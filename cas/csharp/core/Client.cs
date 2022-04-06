// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.CAS.Models;

namespace AntChain.SDK.CAS
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
                        {"sdk_version", "1.4.11"},
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
                        {"sdk_version", "1.4.11"},
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
         * Description: 批量删除构建记录
         * Summary: 批量删除构建记录
         */
        public BatchdeleteApplicationBuildResponse BatchdeleteApplicationBuild(BatchdeleteApplicationBuildRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteApplicationBuildEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除构建记录
         * Summary: 批量删除构建记录
         */
        public async Task<BatchdeleteApplicationBuildResponse> BatchdeleteApplicationBuildAsync(BatchdeleteApplicationBuildRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteApplicationBuildExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除构建记录
         * Summary: 批量删除构建记录
         */
        public BatchdeleteApplicationBuildResponse BatchdeleteApplicationBuildEx(BatchdeleteApplicationBuildRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteApplicationBuildResponse>(DoRequest("1.0", "antcloud.cas.application.build.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除构建记录
         * Summary: 批量删除构建记录
         */
        public async Task<BatchdeleteApplicationBuildResponse> BatchdeleteApplicationBuildExAsync(BatchdeleteApplicationBuildRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteApplicationBuildResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.build.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用明细
         * Summary: 批量查询应用明细
         */
        public ListApplicationManifestResponse ListApplicationManifest(ListApplicationManifestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApplicationManifestEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用明细
         * Summary: 批量查询应用明细
         */
        public async Task<ListApplicationManifestResponse> ListApplicationManifestAsync(ListApplicationManifestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApplicationManifestExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询应用明细
         * Summary: 批量查询应用明细
         */
        public ListApplicationManifestResponse ListApplicationManifestEx(ListApplicationManifestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationManifestResponse>(DoRequest("1.0", "antcloud.cas.application.manifest.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询应用明细
         * Summary: 批量查询应用明细
         */
        public async Task<ListApplicationManifestResponse> ListApplicationManifestExAsync(ListApplicationManifestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationManifestResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.manifest.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用发布包
         * Summary: 批量删除应用发布包
         */
        public BatchdeleteApplicationPackageResponse BatchdeleteApplicationPackage(BatchdeleteApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用发布包
         * Summary: 批量删除应用发布包
         */
        public async Task<BatchdeleteApplicationPackageResponse> BatchdeleteApplicationPackageAsync(BatchdeleteApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除应用发布包
         * Summary: 批量删除应用发布包
         */
        public BatchdeleteApplicationPackageResponse BatchdeleteApplicationPackageEx(BatchdeleteApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteApplicationPackageResponse>(DoRequest("1.0", "antcloud.cas.application.package.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除应用发布包
         * Summary: 批量删除应用发布包
         */
        public async Task<BatchdeleteApplicationPackageResponse> BatchdeleteApplicationPackageExAsync(BatchdeleteApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.package.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用发布包
         * Summary: 创建应用发布包
         */
        public CreateApplicationPackageResponse CreateApplicationPackage(CreateApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用发布包
         * Summary: 创建应用发布包
         */
        public async Task<CreateApplicationPackageResponse> CreateApplicationPackageAsync(CreateApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用发布包
         * Summary: 创建应用发布包
         */
        public CreateApplicationPackageResponse CreateApplicationPackageEx(CreateApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationPackageResponse>(DoRequest("1.0", "antcloud.cas.application.package.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用发布包
         * Summary: 创建应用发布包
         */
        public async Task<CreateApplicationPackageResponse> CreateApplicationPackageExAsync(CreateApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.package.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用发布包
         * Summary: 删除应用发布包
         */
        public DeleteApplicationPackageResponse DeleteApplicationPackage(DeleteApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 删除应用发布包
         * Summary: 删除应用发布包
         */
        public async Task<DeleteApplicationPackageResponse> DeleteApplicationPackageAsync(DeleteApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除应用发布包
         * Summary: 删除应用发布包
         */
        public DeleteApplicationPackageResponse DeleteApplicationPackageEx(DeleteApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationPackageResponse>(DoRequest("1.0", "antcloud.cas.application.package.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用发布包
         * Summary: 删除应用发布包
         */
        public async Task<DeleteApplicationPackageResponse> DeleteApplicationPackageExAsync(DeleteApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.package.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取应用发布包
         * Summary: 批量获取应用发布包
         */
        public ListApplicationPackageResponse ListApplicationPackage(ListApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 批量获取应用发布包
         * Summary: 批量获取应用发布包
         */
        public async Task<ListApplicationPackageResponse> ListApplicationPackageAsync(ListApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量获取应用发布包
         * Summary: 批量获取应用发布包
         */
        public ListApplicationPackageResponse ListApplicationPackageEx(ListApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationPackageResponse>(DoRequest("1.0", "antcloud.cas.application.package.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取应用发布包
         * Summary: 批量获取应用发布包
         */
        public async Task<ListApplicationPackageResponse> ListApplicationPackageExAsync(ListApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.package.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传应用发布包下载配置
         * Summary: 获取上传应用发布包下载配置
         */
        public UploadApplicationPackageconfigResponse UploadApplicationPackageconfig(UploadApplicationPackageconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadApplicationPackageconfigEx(request, headers, runtime);
        }

        /**
         * Description: 获取上传应用发布包下载配置
         * Summary: 获取上传应用发布包下载配置
         */
        public async Task<UploadApplicationPackageconfigResponse> UploadApplicationPackageconfigAsync(UploadApplicationPackageconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadApplicationPackageconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取上传应用发布包下载配置
         * Summary: 获取上传应用发布包下载配置
         */
        public UploadApplicationPackageconfigResponse UploadApplicationPackageconfigEx(UploadApplicationPackageconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationPackageconfigResponse>(DoRequest("1.0", "antcloud.cas.application.packageconfig.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传应用发布包下载配置
         * Summary: 获取上传应用发布包下载配置
         */
        public async Task<UploadApplicationPackageconfigResponse> UploadApplicationPackageconfigExAsync(UploadApplicationPackageconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationPackageconfigResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.packageconfig.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取应用实例的 cell
         * Summary: 批量获取应用实例的 cell
         */
        public ListAppserviceCellResponse ListAppserviceCell(ListAppserviceCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppserviceCellEx(request, headers, runtime);
        }

        /**
         * Description: 批量获取应用实例的 cell
         * Summary: 批量获取应用实例的 cell
         */
        public async Task<ListAppserviceCellResponse> ListAppserviceCellAsync(ListAppserviceCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppserviceCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量获取应用实例的 cell
         * Summary: 批量获取应用实例的 cell
         */
        public ListAppserviceCellResponse ListAppserviceCellEx(ListAppserviceCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppserviceCellResponse>(DoRequest("1.0", "antcloud.cas.appservice.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取应用实例的 cell
         * Summary: 批量获取应用实例的 cell
         */
        public async Task<ListAppserviceCellResponse> ListAppserviceCellExAsync(ListAppserviceCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppserviceCellResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用实例
         * Summary: 创建应用实例
         */
        public CreateAppserviceResponse CreateAppservice(CreateAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用实例
         * Summary: 创建应用实例
         */
        public async Task<CreateAppserviceResponse> CreateAppserviceAsync(CreateAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用实例
         * Summary: 创建应用实例
         */
        public CreateAppserviceResponse CreateAppserviceEx(CreateAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用实例
         * Summary: 创建应用实例
         */
        public async Task<CreateAppserviceResponse> CreateAppserviceExAsync(CreateAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
         * Summary: 旧版应用管理-获取默认的应用服务
         */
        public GetAppserviceDefaultResponse GetAppserviceDefault(GetAppserviceDefaultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppserviceDefaultEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
         * Summary: 旧版应用管理-获取默认的应用服务
         */
        public async Task<GetAppserviceDefaultResponse> GetAppserviceDefaultAsync(GetAppserviceDefaultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppserviceDefaultExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
         * Summary: 旧版应用管理-获取默认的应用服务
         */
        public GetAppserviceDefaultResponse GetAppserviceDefaultEx(GetAppserviceDefaultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppserviceDefaultResponse>(DoRequest("1.0", "antcloud.cas.appservice.default.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
         * Summary: 旧版应用管理-获取默认的应用服务
         */
        public async Task<GetAppserviceDefaultResponse> GetAppserviceDefaultExAsync(GetAppserviceDefaultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppserviceDefaultResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.default.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断应用实例是否存在
         * Summary: 判断应用实例是否存在
         */
        public ExistAppserviceResponse ExistAppservice(ExistAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 判断应用实例是否存在
         * Summary: 判断应用实例是否存在
         */
        public async Task<ExistAppserviceResponse> ExistAppserviceAsync(ExistAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 判断应用实例是否存在
         * Summary: 判断应用实例是否存在
         */
        public ExistAppserviceResponse ExistAppserviceEx(ExistAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断应用实例是否存在
         * Summary: 判断应用实例是否存在
         */
        public async Task<ExistAppserviceResponse> ExistAppserviceExAsync(ExistAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用实例
         * Summary: 更新应用实例
         */
        public UpdateAppserviceResponse UpdateAppservice(UpdateAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用实例
         * Summary: 更新应用实例
         */
        public async Task<UpdateAppserviceResponse> UpdateAppserviceAsync(UpdateAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用实例
         * Summary: 更新应用实例
         */
        public UpdateAppserviceResponse UpdateAppserviceEx(UpdateAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用实例
         * Summary: 更新应用实例
         */
        public async Task<UpdateAppserviceResponse> UpdateAppserviceExAsync(UpdateAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 技术栈1.0查询（opsware）
         * Summary: 技术栈查询
         */
        public QueryBuildpackResponse QueryBuildpack(QueryBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 技术栈1.0查询（opsware）
         * Summary: 技术栈查询
         */
        public async Task<QueryBuildpackResponse> QueryBuildpackAsync(QueryBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 技术栈1.0查询（opsware）
         * Summary: 技术栈查询
         */
        public QueryBuildpackResponse QueryBuildpackEx(QueryBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackResponse>(DoRequest("1.0", "antcloud.cas.buildpack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 技术栈1.0查询（opsware）
         * Summary: 技术栈查询
         */
        public async Task<QueryBuildpackResponse> QueryBuildpackExAsync(QueryBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.cas.buildpack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取指定应用详情
         * Summary: 旧版应用管理-获取应用详情
         */
        public GetApplicationDetailResponse GetApplicationDetail(GetApplicationDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationDetailEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取指定应用详情
         * Summary: 旧版应用管理-获取应用详情
         */
        public async Task<GetApplicationDetailResponse> GetApplicationDetailAsync(GetApplicationDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取指定应用详情
         * Summary: 旧版应用管理-获取应用详情
         */
        public GetApplicationDetailResponse GetApplicationDetailEx(GetApplicationDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationDetailResponse>(DoRequest("1.0", "antcloud.cas.application.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取指定应用详情
         * Summary: 旧版应用管理-获取应用详情
         */
        public async Task<GetApplicationDetailResponse> GetApplicationDetailExAsync(GetApplicationDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationDetailResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public QueryUserResponse QueryUser(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public async Task<QueryUserResponse> QueryUserAsync(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public QueryUserResponse QueryUserEx(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(DoRequest("1.0", "antcloud.cas.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public async Task<QueryUserResponse> QueryUserExAsync(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(await DoRequestAsync("1.0", "antcloud.cas.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用分组列表
         * Summary: 获取应用分组列表
         */
        public ListAppgroupResponse ListAppgroup(ListAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用分组列表
         * Summary: 获取应用分组列表
         */
        public async Task<ListAppgroupResponse> ListAppgroupAsync(ListAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用分组列表
         * Summary: 获取应用分组列表
         */
        public ListAppgroupResponse ListAppgroupEx(ListAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupResponse>(DoRequest("1.0", "antcloud.cas.appgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用分组列表
         * Summary: 获取应用分组列表
         */
        public async Task<ListAppgroupResponse> ListAppgroupExAsync(ListAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查应用分组是否存在
         * Summary: 检查应用分组是否存在
         */
        public ExistAppgroupResponse ExistAppgroup(ExistAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 检查应用分组是否存在
         * Summary: 检查应用分组是否存在
         */
        public async Task<ExistAppgroupResponse> ExistAppgroupAsync(ExistAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查应用分组是否存在
         * Summary: 检查应用分组是否存在
         */
        public ExistAppgroupResponse ExistAppgroupEx(ExistAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppgroupResponse>(DoRequest("1.0", "antcloud.cas.appgroup.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查应用分组是否存在
         * Summary: 检查应用分组是否存在
         */
        public async Task<ExistAppgroupResponse> ExistAppgroupExAsync(ExistAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用分组
         * Summary: 创建应用分组
         */
        public CreateAppgroupResponse CreateAppgroup(CreateAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用分组
         * Summary: 创建应用分组
         */
        public async Task<CreateAppgroupResponse> CreateAppgroupAsync(CreateAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用分组
         * Summary: 创建应用分组
         */
        public CreateAppgroupResponse CreateAppgroupEx(CreateAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppgroupResponse>(DoRequest("1.0", "antcloud.cas.appgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用分组
         * Summary: 创建应用分组
         */
        public async Task<CreateAppgroupResponse> CreateAppgroupExAsync(CreateAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用owner列表
         * Summary: 获取应用owner列表
         */
        public ListAppgroupOwnerResponse ListAppgroupOwner(ListAppgroupOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppgroupOwnerEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用owner列表
         * Summary: 获取应用owner列表
         */
        public async Task<ListAppgroupOwnerResponse> ListAppgroupOwnerAsync(ListAppgroupOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppgroupOwnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用owner列表
         * Summary: 获取应用owner列表
         */
        public ListAppgroupOwnerResponse ListAppgroupOwnerEx(ListAppgroupOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupOwnerResponse>(DoRequest("1.0", "antcloud.cas.appgroup.owner.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用owner列表
         * Summary: 获取应用owner列表
         */
        public async Task<ListAppgroupOwnerResponse> ListAppgroupOwnerExAsync(ListAppgroupOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupOwnerResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.owner.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public GetAppgroupTreeResponse GetAppgroupTree(GetAppgroupTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppgroupTreeEx(request, headers, runtime);
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public async Task<GetAppgroupTreeResponse> GetAppgroupTreeAsync(GetAppgroupTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppgroupTreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public GetAppgroupTreeResponse GetAppgroupTreeEx(GetAppgroupTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgroupTreeResponse>(DoRequest("1.0", "antcloud.cas.appgroup.tree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public async Task<GetAppgroupTreeResponse> GetAppgroupTreeExAsync(GetAppgroupTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgroupTreeResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.tree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public GetAppgroupSystemtreeResponse GetAppgroupSystemtree(GetAppgroupSystemtreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppgroupSystemtreeEx(request, headers, runtime);
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public async Task<GetAppgroupSystemtreeResponse> GetAppgroupSystemtreeAsync(GetAppgroupSystemtreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppgroupSystemtreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public GetAppgroupSystemtreeResponse GetAppgroupSystemtreeEx(GetAppgroupSystemtreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgroupSystemtreeResponse>(DoRequest("1.0", "antcloud.cas.appgroup.systemtree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用分组结构查询
         * Summary: 应用分组结构查询
         */
        public async Task<GetAppgroupSystemtreeResponse> GetAppgroupSystemtreeExAsync(GetAppgroupSystemtreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgroupSystemtreeResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.systemtree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除分组
         * Summary: 删除分组
         */
        public DeleteAppgroupResponse DeleteAppgroup(DeleteAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除分组
         * Summary: 删除分组
         */
        public async Task<DeleteAppgroupResponse> DeleteAppgroupAsync(DeleteAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除分组
         * Summary: 删除分组
         */
        public DeleteAppgroupResponse DeleteAppgroupEx(DeleteAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppgroupResponse>(DoRequest("1.0", "antcloud.cas.appgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除分组
         * Summary: 删除分组
         */
        public async Task<DeleteAppgroupResponse> DeleteAppgroupExAsync(DeleteAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public UpdateAppgroupResponse UpdateAppgroup(UpdateAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public async Task<UpdateAppgroupResponse> UpdateAppgroupAsync(UpdateAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public UpdateAppgroupResponse UpdateAppgroupEx(UpdateAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppgroupResponse>(DoRequest("1.0", "antcloud.cas.appgroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public async Task<UpdateAppgroupResponse> UpdateAppgroupExAsync(UpdateAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有应用等级
         * Summary: 列出所有应用等级
         */
        public ListApplevelResponse ListApplevel(ListApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 列出所有应用等级
         * Summary: 列出所有应用等级
         */
        public async Task<ListApplevelResponse> ListApplevelAsync(ListApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出所有应用等级
         * Summary: 列出所有应用等级
         */
        public ListApplevelResponse ListApplevelEx(ListApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplevelResponse>(DoRequest("1.0", "antcloud.cas.applevel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有应用等级
         * Summary: 列出所有应用等级
         */
        public async Task<ListApplevelResponse> ListApplevelExAsync(ListApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplevelResponse>(await DoRequestAsync("1.0", "antcloud.cas.applevel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用等级是否存在
         * Summary: 应用等级是否存在
         */
        public ExistApplevelResponse ExistApplevel(ExistApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 应用等级是否存在
         * Summary: 应用等级是否存在
         */
        public async Task<ExistApplevelResponse> ExistApplevelAsync(ExistApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用等级是否存在
         * Summary: 应用等级是否存在
         */
        public ExistApplevelResponse ExistApplevelEx(ExistApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplevelResponse>(DoRequest("1.0", "antcloud.cas.applevel.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用等级是否存在
         * Summary: 应用等级是否存在
         */
        public async Task<ExistApplevelResponse> ExistApplevelExAsync(ExistApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplevelResponse>(await DoRequestAsync("1.0", "antcloud.cas.applevel.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用等级
         * Summary: 创建应用等级
         */
        public CreateApplevelResponse CreateApplevel(CreateApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用等级
         * Summary: 创建应用等级
         */
        public async Task<CreateApplevelResponse> CreateApplevelAsync(CreateApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用等级
         * Summary: 创建应用等级
         */
        public CreateApplevelResponse CreateApplevelEx(CreateApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplevelResponse>(DoRequest("1.0", "antcloud.cas.applevel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用等级
         * Summary: 创建应用等级
         */
        public async Task<CreateApplevelResponse> CreateApplevelExAsync(CreateApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplevelResponse>(await DoRequestAsync("1.0", "antcloud.cas.applevel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用分组
         * Summary: 删除应用分组
         */
        public DeleteApplevelResponse DeleteApplevel(DeleteApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 删除应用分组
         * Summary: 删除应用分组
         */
        public async Task<DeleteApplevelResponse> DeleteApplevelAsync(DeleteApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除应用分组
         * Summary: 删除应用分组
         */
        public DeleteApplevelResponse DeleteApplevelEx(DeleteApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplevelResponse>(DoRequest("1.0", "antcloud.cas.applevel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用分组
         * Summary: 删除应用分组
         */
        public async Task<DeleteApplevelResponse> DeleteApplevelExAsync(DeleteApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplevelResponse>(await DoRequestAsync("1.0", "antcloud.cas.applevel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用等级
         * Summary: 更新应用等级
         */
        public UpdateApplevelResponse UpdateApplevel(UpdateApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用等级
         * Summary: 更新应用等级
         */
        public async Task<UpdateApplevelResponse> UpdateApplevelAsync(UpdateApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用等级
         * Summary: 更新应用等级
         */
        public UpdateApplevelResponse UpdateApplevelEx(UpdateApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApplevelResponse>(DoRequest("1.0", "antcloud.cas.applevel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用等级
         * Summary: 更新应用等级
         */
        public async Task<UpdateApplevelResponse> UpdateApplevelExAsync(UpdateApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApplevelResponse>(await DoRequestAsync("1.0", "antcloud.cas.applevel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用列表
         * Summary: 旧版应用管理-获取应用列表
         */
        public ListApplicationResponse ListApplication(ListApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用列表
         * Summary: 旧版应用管理-获取应用列表
         */
        public async Task<ListApplicationResponse> ListApplicationAsync(ListApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用列表
         * Summary: 旧版应用管理-获取应用列表
         */
        public ListApplicationResponse ListApplicationEx(ListApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationResponse>(DoRequest("1.0", "antcloud.cas.application.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用列表
         * Summary: 旧版应用管理-获取应用列表
         */
        public async Task<ListApplicationResponse> ListApplicationExAsync(ListApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-更新应用
         * Summary: 旧版应用管理-更新应用
         */
        public UpdateApplicationResponse UpdateApplication(UpdateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-更新应用
         * Summary: 旧版应用管理-更新应用
         */
        public async Task<UpdateApplicationResponse> UpdateApplicationAsync(UpdateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-更新应用
         * Summary: 旧版应用管理-更新应用
         */
        public UpdateApplicationResponse UpdateApplicationEx(UpdateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApplicationResponse>(DoRequest("1.0", "antcloud.cas.application.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-更新应用
         * Summary: 旧版应用管理-更新应用
         */
        public async Task<UpdateApplicationResponse> UpdateApplicationExAsync(UpdateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApplicationResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-批量查询应用服务
         * Summary: 旧版应用管理-批量查询应用服务
         */
        public ListAppserviceResponse ListAppservice(ListAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-批量查询应用服务
         * Summary: 旧版应用管理-批量查询应用服务
         */
        public async Task<ListAppserviceResponse> ListAppserviceAsync(ListAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-批量查询应用服务
         * Summary: 旧版应用管理-批量查询应用服务
         */
        public ListAppserviceResponse ListAppserviceEx(ListAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-批量查询应用服务
         * Summary: 旧版应用管理-批量查询应用服务
         */
        public async Task<ListAppserviceResponse> ListAppserviceExAsync(ListAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-删除应用服务
         * Summary: 旧版应用管理-删除应用服务
         */
        public DeleteAppserviceResponse DeleteAppservice(DeleteAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-删除应用服务
         * Summary: 旧版应用管理-删除应用服务
         */
        public async Task<DeleteAppserviceResponse> DeleteAppserviceAsync(DeleteAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-删除应用服务
         * Summary: 旧版应用管理-删除应用服务
         */
        public DeleteAppserviceResponse DeleteAppserviceEx(DeleteAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-删除应用服务
         * Summary: 旧版应用管理-删除应用服务
         */
        public async Task<DeleteAppserviceResponse> DeleteAppserviceExAsync(DeleteAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用服务详情
         * Summary: 旧版应用管理-获取应用服务详情
         */
        public GetAppserviceDetailResponse GetAppserviceDetail(GetAppserviceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppserviceDetailEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用服务详情
         * Summary: 旧版应用管理-获取应用服务详情
         */
        public async Task<GetAppserviceDetailResponse> GetAppserviceDetailAsync(GetAppserviceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppserviceDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用服务详情
         * Summary: 旧版应用管理-获取应用服务详情
         */
        public GetAppserviceDetailResponse GetAppserviceDetailEx(GetAppserviceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppserviceDetailResponse>(DoRequest("1.0", "antcloud.cas.appservice.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用服务详情
         * Summary: 旧版应用管理-获取应用服务详情
         */
        public async Task<GetAppserviceDetailResponse> GetAppserviceDetailExAsync(GetAppserviceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppserviceDetailResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-检查应用发布包是否存在
         * Summary: 旧版应用管理-检查应用发布包是否存在
         */
        public ExistApplicationPackageResponse ExistApplicationPackage(ExistApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-检查应用发布包是否存在
         * Summary: 旧版应用管理-检查应用发布包是否存在
         */
        public async Task<ExistApplicationPackageResponse> ExistApplicationPackageAsync(ExistApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-检查应用发布包是否存在
         * Summary: 旧版应用管理-检查应用发布包是否存在
         */
        public ExistApplicationPackageResponse ExistApplicationPackageEx(ExistApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplicationPackageResponse>(DoRequest("1.0", "antcloud.cas.application.package.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-检查应用发布包是否存在
         * Summary: 旧版应用管理-检查应用发布包是否存在
         */
        public async Task<ExistApplicationPackageResponse> ExistApplicationPackageExAsync(ExistApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.package.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用包上传策略
         * Summary: 旧版应用管理-获取应用包上传策略
         */
        public GetApplicationPackageuploadpolicyResponse GetApplicationPackageuploadpolicy(GetApplicationPackageuploadpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationPackageuploadpolicyEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用包上传策略
         * Summary: 旧版应用管理-获取应用包上传策略
         */
        public async Task<GetApplicationPackageuploadpolicyResponse> GetApplicationPackageuploadpolicyAsync(GetApplicationPackageuploadpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationPackageuploadpolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取应用包上传策略
         * Summary: 旧版应用管理-获取应用包上传策略
         */
        public GetApplicationPackageuploadpolicyResponse GetApplicationPackageuploadpolicyEx(GetApplicationPackageuploadpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackageuploadpolicyResponse>(DoRequest("1.0", "antcloud.cas.application.packageuploadpolicy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取应用包上传策略
         * Summary: 旧版应用管理-获取应用包上传策略
         */
        public async Task<GetApplicationPackageuploadpolicyResponse> GetApplicationPackageuploadpolicyExAsync(GetApplicationPackageuploadpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackageuploadpolicyResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.packageuploadpolicy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取发布包下载链接
         * Summary: 旧版应用管理-获取发布包下载链接
         */
        public GetApplicationPackagedownloadurlResponse GetApplicationPackagedownloadurl(GetApplicationPackagedownloadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationPackagedownloadurlEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取发布包下载链接
         * Summary: 旧版应用管理-获取发布包下载链接
         */
        public async Task<GetApplicationPackagedownloadurlResponse> GetApplicationPackagedownloadurlAsync(GetApplicationPackagedownloadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationPackagedownloadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-获取发布包下载链接
         * Summary: 旧版应用管理-获取发布包下载链接
         */
        public GetApplicationPackagedownloadurlResponse GetApplicationPackagedownloadurlEx(GetApplicationPackagedownloadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackagedownloadurlResponse>(DoRequest("1.0", "antcloud.cas.application.packagedownloadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-获取发布包下载链接
         * Summary: 旧版应用管理-获取发布包下载链接
         */
        public async Task<GetApplicationPackagedownloadurlResponse> GetApplicationPackagedownloadurlExAsync(GetApplicationPackagedownloadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackagedownloadurlResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.packagedownloadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-判断应用是否存在
         * Summary: 旧版应用管理-判断应用是否存在
         */
        public ExistApplicationResponse ExistApplication(ExistApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-判断应用是否存在
         * Summary: 旧版应用管理-判断应用是否存在
         */
        public async Task<ExistApplicationResponse> ExistApplicationAsync(ExistApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-判断应用是否存在
         * Summary: 旧版应用管理-判断应用是否存在
         */
        public ExistApplicationResponse ExistApplicationEx(ExistApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplicationResponse>(DoRequest("1.0", "antcloud.cas.application.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-判断应用是否存在
         * Summary: 旧版应用管理-判断应用是否存在
         */
        public async Task<ExistApplicationResponse> ExistApplicationExAsync(ExistApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistApplicationResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
         * Summary: 根据应用服务ids查询应用服务
         */
        public QueryAppserviceResponse QueryAppservice(QueryAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
         * Summary: 根据应用服务ids查询应用服务
         */
        public async Task<QueryAppserviceResponse> QueryAppserviceAsync(QueryAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
         * Summary: 根据应用服务ids查询应用服务
         */
        public QueryAppserviceResponse QueryAppserviceEx(QueryAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceResponse>(DoRequest("1.0", "antcloud.cas.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
         * Summary: 根据应用服务ids查询应用服务
         */
        public async Task<QueryAppserviceResponse> QueryAppserviceExAsync(QueryAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 历史遗留接口-获取开关配置清单
         * Summary: 历史遗留接口-获取开关配置清单
         */
        public GetAppgrayconfigsResponse GetAppgrayconfigs(GetAppgrayconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppgrayconfigsEx(request, headers, runtime);
        }

        /**
         * Description: 历史遗留接口-获取开关配置清单
         * Summary: 历史遗留接口-获取开关配置清单
         */
        public async Task<GetAppgrayconfigsResponse> GetAppgrayconfigsAsync(GetAppgrayconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppgrayconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 历史遗留接口-获取开关配置清单
         * Summary: 历史遗留接口-获取开关配置清单
         */
        public GetAppgrayconfigsResponse GetAppgrayconfigsEx(GetAppgrayconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgrayconfigsResponse>(DoRequest("1.0", "antcloud.cas.appgrayconfigs.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 历史遗留接口-获取开关配置清单
         * Summary: 历史遗留接口-获取开关配置清单
         */
        public async Task<GetAppgrayconfigsResponse> GetAppgrayconfigsExAsync(GetAppgrayconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppgrayconfigsResponse>(await DoRequestAsync("1.0", "antcloud.cas.appgrayconfigs.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 computer 实例
         * Summary: 创建 computer 实例
         */
        public CreateComputerResponse CreateComputer(CreateComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateComputerEx(request, headers, runtime);
        }

        /**
         * Description: 创建 computer 实例
         * Summary: 创建 computer 实例
         */
        public async Task<CreateComputerResponse> CreateComputerAsync(CreateComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 computer 实例
         * Summary: 创建 computer 实例
         */
        public CreateComputerResponse CreateComputerEx(CreateComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 computer 实例
         * Summary: 创建 computer 实例
         */
        public async Task<CreateComputerResponse> CreateComputerExAsync(CreateComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 删除
         * Summary: computer 删除
         */
        public DeleteComputerResponse DeleteComputer(DeleteComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteComputerEx(request, headers, runtime);
        }

        /**
         * Description: computer 删除
         * Summary: computer 删除
         */
        public async Task<DeleteComputerResponse> DeleteComputerAsync(DeleteComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: computer 删除
         * Summary: computer 删除
         */
        public DeleteComputerResponse DeleteComputerEx(DeleteComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 删除
         * Summary: computer 删除
         */
        public async Task<DeleteComputerResponse> DeleteComputerExAsync(DeleteComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 导入
         * Summary: computer 导入
         */
        public ImportComputerResponse ImportComputer(ImportComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportComputerEx(request, headers, runtime);
        }

        /**
         * Description: computer 导入
         * Summary: computer 导入
         */
        public async Task<ImportComputerResponse> ImportComputerAsync(ImportComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: computer 导入
         * Summary: computer 导入
         */
        public ImportComputerResponse ImportComputerEx(ImportComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 导入
         * Summary: computer 导入
         */
        public async Task<ImportComputerResponse> ImportComputerExAsync(ImportComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 创建
         * Summary: database 创建
         */
        public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: database 创建
         * Summary: database 创建
         */
        public async Task<CreateDatabaseResponse> CreateDatabaseAsync(CreateDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: database 创建
         * Summary: database 创建
         */
        public CreateDatabaseResponse CreateDatabaseEx(CreateDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 创建
         * Summary: database 创建
         */
        public async Task<CreateDatabaseResponse> CreateDatabaseExAsync(CreateDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 导入
         * Summary: database 导入
         */
        public ImportDatabaseResponse ImportDatabase(ImportDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: database 导入
         * Summary: database 导入
         */
        public async Task<ImportDatabaseResponse> ImportDatabaseAsync(ImportDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: database 导入
         * Summary: database 导入
         */
        public ImportDatabaseResponse ImportDatabaseEx(ImportDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 导入
         * Summary: database 导入
         */
        public async Task<ImportDatabaseResponse> ImportDatabaseExAsync(ImportDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 删除
         * Summary: database 删除
         */
        public DeleteDatabaseResponse DeleteDatabase(DeleteDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: database 删除
         * Summary: database 删除
         */
        public async Task<DeleteDatabaseResponse> DeleteDatabaseAsync(DeleteDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: database 删除
         * Summary: database 删除
         */
        public DeleteDatabaseResponse DeleteDatabaseEx(DeleteDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 删除
         * Summary: database 删除
         */
        public async Task<DeleteDatabaseResponse> DeleteDatabaseExAsync(DeleteDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 创建
         * Summary: loadbalance 创建
         */
        public CreateLoadbalanceResponse CreateLoadbalance(CreateLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance 创建
         * Summary: loadbalance 创建
         */
        public async Task<CreateLoadbalanceResponse> CreateLoadbalanceAsync(CreateLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance 创建
         * Summary: loadbalance 创建
         */
        public CreateLoadbalanceResponse CreateLoadbalanceEx(CreateLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 创建
         * Summary: loadbalance 创建
         */
        public async Task<CreateLoadbalanceResponse> CreateLoadbalanceExAsync(CreateLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 删除
         * Summary: loadbalance 删除
         */
        public DeleteLoadbalanceResponse DeleteLoadbalance(DeleteLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance 删除
         * Summary: loadbalance 删除
         */
        public async Task<DeleteLoadbalanceResponse> DeleteLoadbalanceAsync(DeleteLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance 删除
         * Summary: loadbalance 删除
         */
        public DeleteLoadbalanceResponse DeleteLoadbalanceEx(DeleteLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 删除
         * Summary: loadbalance 删除
         */
        public async Task<DeleteLoadbalanceResponse> DeleteLoadbalanceExAsync(DeleteLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 导入
         * Summary: loadbalance 导入
         */
        public ImportLoadbalanceResponse ImportLoadbalance(ImportLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance 导入
         * Summary: loadbalance 导入
         */
        public async Task<ImportLoadbalanceResponse> ImportLoadbalanceAsync(ImportLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance 导入
         * Summary: loadbalance 导入
         */
        public ImportLoadbalanceResponse ImportLoadbalanceEx(ImportLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 导入
         * Summary: loadbalance 导入
         */
        public async Task<ImportLoadbalanceResponse> ImportLoadbalanceExAsync(ImportLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vpc 创建
         * Summary: vpc 创建
         */
        public CreateVpcResponse CreateVpc(CreateVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateVpcEx(request, headers, runtime);
        }

        /**
         * Description: vpc 创建
         * Summary: vpc 创建
         */
        public async Task<CreateVpcResponse> CreateVpcAsync(CreateVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: vpc 创建
         * Summary: vpc 创建
         */
        public CreateVpcResponse CreateVpcEx(CreateVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcResponse>(DoRequest("1.0", "antcloud.cas.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vpc 创建
         * Summary: vpc 创建
         */
        public async Task<CreateVpcResponse> CreateVpcExAsync(CreateVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vpc 删除
         * Summary: vpc 删除
         */
        public DeleteVpcResponse DeleteVpc(DeleteVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteVpcEx(request, headers, runtime);
        }

        /**
         * Description: vpc 删除
         * Summary: vpc 删除
         */
        public async Task<DeleteVpcResponse> DeleteVpcAsync(DeleteVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: vpc 删除
         * Summary: vpc 删除
         */
        public DeleteVpcResponse DeleteVpcEx(DeleteVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcResponse>(DoRequest("1.0", "antcloud.cas.vpc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vpc 删除
         * Summary: vpc 删除
         */
        public async Task<DeleteVpcResponse> DeleteVpcExAsync(DeleteVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 从应用中释放
         * Summary: computer 从应用中释放
         */
        public ReleaseComputerResponse ReleaseComputer(ReleaseComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseComputerEx(request, headers, runtime);
        }

        /**
         * Description: computer 从应用中释放
         * Summary: computer 从应用中释放
         */
        public async Task<ReleaseComputerResponse> ReleaseComputerAsync(ReleaseComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: computer 从应用中释放
         * Summary: computer 从应用中释放
         */
        public ReleaseComputerResponse ReleaseComputerEx(ReleaseComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 从应用中释放
         * Summary: computer 从应用中释放
         */
        public async Task<ReleaseComputerResponse> ReleaseComputerExAsync(ReleaseComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置 computer 密码
         * Summary: 重置 computer 密码
         */
        public ReinitComputerPasswordResponse ReinitComputerPassword(ReinitComputerPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitComputerPasswordEx(request, headers, runtime);
        }

        /**
         * Description: 重置 computer 密码
         * Summary: 重置 computer 密码
         */
        public async Task<ReinitComputerPasswordResponse> ReinitComputerPasswordAsync(ReinitComputerPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitComputerPasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 重置 computer 密码
         * Summary: 重置 computer 密码
         */
        public ReinitComputerPasswordResponse ReinitComputerPasswordEx(ReinitComputerPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitComputerPasswordResponse>(DoRequest("1.0", "antcloud.cas.computer.password.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置 computer 密码
         * Summary: 重置 computer 密码
         */
        public async Task<ReinitComputerPasswordResponse> ReinitComputerPasswordExAsync(ReinitComputerPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitComputerPasswordResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.password.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 从应用中释放
         * Summary: database 从应用中释放
         */
        public ReleaseDatabaseResponse ReleaseDatabase(ReleaseDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: database 从应用中释放
         * Summary: database 从应用中释放
         */
        public async Task<ReleaseDatabaseResponse> ReleaseDatabaseAsync(ReleaseDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: database 从应用中释放
         * Summary: database 从应用中释放
         */
        public ReleaseDatabaseResponse ReleaseDatabaseEx(ReleaseDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 从应用中释放
         * Summary: database 从应用中释放
         */
        public async Task<ReleaseDatabaseResponse> ReleaseDatabaseExAsync(ReleaseDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除 computer 
         * Summary: 移除 computer 
         */
        public RemoveComputerResponse RemoveComputer(RemoveComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveComputerEx(request, headers, runtime);
        }

        /**
         * Description: 移除 computer 
         * Summary: 移除 computer 
         */
        public async Task<RemoveComputerResponse> RemoveComputerAsync(RemoveComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除 computer 
         * Summary: 移除 computer 
         */
        public RemoveComputerResponse RemoveComputerEx(RemoveComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除 computer 
         * Summary: 移除 computer 
         */
        public async Task<RemoveComputerResponse> RemoveComputerExAsync(RemoveComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 移除
         * Summary: loadbalance 移除
         */
        public RemoveLoadbalanceResponse RemoveLoadbalance(RemoveLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance 移除
         * Summary: loadbalance 移除
         */
        public async Task<RemoveLoadbalanceResponse> RemoveLoadbalanceAsync(RemoveLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance 移除
         * Summary: loadbalance 移除
         */
        public RemoveLoadbalanceResponse RemoveLoadbalanceEx(RemoveLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 移除
         * Summary: loadbalance 移除
         */
        public async Task<RemoveLoadbalanceResponse> RemoveLoadbalanceExAsync(RemoveLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 移除
         * Summary: database 移除
         */
        public RemoveDatabaseResponse RemoveDatabase(RemoveDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: database 移除
         * Summary: database 移除
         */
        public async Task<RemoveDatabaseResponse> RemoveDatabaseAsync(RemoveDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: database 移除
         * Summary: database 移除
         */
        public RemoveDatabaseResponse RemoveDatabaseEx(RemoveDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database 移除
         * Summary: database 移除
         */
        public async Task<RemoveDatabaseResponse> RemoveDatabaseExAsync(RemoveDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 从应用中释放
         * Summary: loadbalance 从应用中释放
         */
        public ReleaseLoadbalanceResponse ReleaseLoadbalance(ReleaseLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance 从应用中释放
         * Summary: loadbalance 从应用中释放
         */
        public async Task<ReleaseLoadbalanceResponse> ReleaseLoadbalanceAsync(ReleaseLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance 从应用中释放
         * Summary: loadbalance 从应用中释放
         */
        public ReleaseLoadbalanceResponse ReleaseLoadbalanceEx(ReleaseLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance 从应用中释放
         * Summary: loadbalance 从应用中释放
         */
        public async Task<ReleaseLoadbalanceResponse> ReleaseLoadbalanceExAsync(ReleaseLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database account 创建
         * Summary: database account 创建
         */
        public CreateDatabaseAccountResponse CreateDatabaseAccount(CreateDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDatabaseAccountEx(request, headers, runtime);
        }

        /**
         * Description: database account 创建
         * Summary: database account 创建
         */
        public async Task<CreateDatabaseAccountResponse> CreateDatabaseAccountAsync(CreateDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDatabaseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: database account 创建
         * Summary: database account 创建
         */
        public CreateDatabaseAccountResponse CreateDatabaseAccountEx(CreateDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseAccountResponse>(DoRequest("1.0", "antcloud.cas.database.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: database account 创建
         * Summary: database account 创建
         */
        public async Task<CreateDatabaseAccountResponse> CreateDatabaseAccountExAsync(CreateDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseAccountResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全域/组 创建
         * Summary: 安全域/组 创建
         */
        public CreateSecuritygroupResponse CreateSecuritygroup(CreateSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 安全域/组 创建
         * Summary: 安全域/组 创建
         */
        public async Task<CreateSecuritygroupResponse> CreateSecuritygroupAsync(CreateSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全域/组 创建
         * Summary: 安全域/组 创建
         */
        public CreateSecuritygroupResponse CreateSecuritygroupEx(CreateSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全域/组 创建
         * Summary: 安全域/组 创建
         */
        public async Task<CreateSecuritygroupResponse> CreateSecuritygroupExAsync(CreateSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 导入
         * Summary: securitygroup 导入
         */
        public ImportSecuritygroupResponse ImportSecuritygroup(ImportSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: securitygroup 导入
         * Summary: securitygroup 导入
         */
        public async Task<ImportSecuritygroupResponse> ImportSecuritygroupAsync(ImportSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: securitygroup 导入
         * Summary: securitygroup 导入
         */
        public ImportSecuritygroupResponse ImportSecuritygroupEx(ImportSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 导入
         * Summary: securitygroup 导入
         */
        public async Task<ImportSecuritygroupResponse> ImportSecuritygroupExAsync(ImportSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 移除
         * Summary: securitygroup 移除
         */
        public RemoveSecuritygroupResponse RemoveSecuritygroup(RemoveSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: securitygroup 移除
         * Summary: securitygroup 移除
         */
        public async Task<RemoveSecuritygroupResponse> RemoveSecuritygroupAsync(RemoveSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: securitygroup 移除
         * Summary: securitygroup 移除
         */
        public RemoveSecuritygroupResponse RemoveSecuritygroupEx(RemoveSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 移除
         * Summary: securitygroup 移除
         */
        public async Task<RemoveSecuritygroupResponse> RemoveSecuritygroupExAsync(RemoveSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 删除
         * Summary: securitygroup 删除
         */
        public DeleteSecuritygroupResponse DeleteSecuritygroup(DeleteSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: securitygroup 删除
         * Summary: securitygroup 删除
         */
        public async Task<DeleteSecuritygroupResponse> DeleteSecuritygroupAsync(DeleteSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: securitygroup 删除
         * Summary: securitygroup 删除
         */
        public DeleteSecuritygroupResponse DeleteSecuritygroupEx(DeleteSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: securitygroup 删除
         * Summary: securitygroup 删除
         */
        public async Task<DeleteSecuritygroupResponse> DeleteSecuritygroupExAsync(DeleteSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: schema 删除
         * Summary: schema 删除
         */
        public DeleteDatabaseSchemaResponse DeleteDatabaseSchema(DeleteDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDatabaseSchemaEx(request, headers, runtime);
        }

        /**
         * Description: schema 删除
         * Summary: schema 删除
         */
        public async Task<DeleteDatabaseSchemaResponse> DeleteDatabaseSchemaAsync(DeleteDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDatabaseSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: schema 删除
         * Summary: schema 删除
         */
        public DeleteDatabaseSchemaResponse DeleteDatabaseSchemaEx(DeleteDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseSchemaResponse>(DoRequest("1.0", "antcloud.cas.database.schema.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: schema 删除
         * Summary: schema 删除
         */
        public async Task<DeleteDatabaseSchemaResponse> DeleteDatabaseSchemaExAsync(DeleteDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseSchemaResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.schema.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: account 删除
         * Summary: account 删除
         */
        public DeleteDatabaseAccountResponse DeleteDatabaseAccount(DeleteDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDatabaseAccountEx(request, headers, runtime);
        }

        /**
         * Description: account 删除
         * Summary: account 删除
         */
        public async Task<DeleteDatabaseAccountResponse> DeleteDatabaseAccountAsync(DeleteDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDatabaseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: account 删除
         * Summary: account 删除
         */
        public DeleteDatabaseAccountResponse DeleteDatabaseAccountEx(DeleteDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseAccountResponse>(DoRequest("1.0", "antcloud.cas.database.account.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: account 删除
         * Summary: account 删除
         */
        public async Task<DeleteDatabaseAccountResponse> DeleteDatabaseAccountExAsync(DeleteDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDatabaseAccountResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.account.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 删除
         * Summary: vswitch 删除
         */
        public DeleteVpcVswitchResponse DeleteVpcVswitch(DeleteVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteVpcVswitchEx(request, headers, runtime);
        }

        /**
         * Description: vswitch 删除
         * Summary: vswitch 删除
         */
        public async Task<DeleteVpcVswitchResponse> DeleteVpcVswitchAsync(DeleteVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteVpcVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: vswitch 删除
         * Summary: vswitch 删除
         */
        public DeleteVpcVswitchResponse DeleteVpcVswitchEx(DeleteVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcVswitchResponse>(DoRequest("1.0", "antcloud.cas.vpc.vswitch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 删除
         * Summary: vswitch 删除
         */
        public async Task<DeleteVpcVswitchResponse> DeleteVpcVswitchExAsync(DeleteVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vswitch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: listener 删除
         * Summary: listener 删除
         */
        public DeleteLoadbalanceListenerResponse DeleteLoadbalanceListener(DeleteLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: listener 删除
         * Summary: listener 删除
         */
        public async Task<DeleteLoadbalanceListenerResponse> DeleteLoadbalanceListenerAsync(DeleteLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: listener 删除
         * Summary: listener 删除
         */
        public DeleteLoadbalanceListenerResponse DeleteLoadbalanceListenerEx(DeleteLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: listener 删除
         * Summary: listener 删除
         */
        public async Task<DeleteLoadbalanceListenerResponse> DeleteLoadbalanceListenerExAsync(DeleteLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路由表删除
         * Summary: 路由表删除
         */
        public DeleteVpcVroutertableResponse DeleteVpcVroutertable(DeleteVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteVpcVroutertableEx(request, headers, runtime);
        }

        /**
         * Description: 路由表删除
         * Summary: 路由表删除
         */
        public async Task<DeleteVpcVroutertableResponse> DeleteVpcVroutertableAsync(DeleteVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteVpcVroutertableExAsync(request, headers, runtime);
        }

        /**
         * Description: 路由表删除
         * Summary: 路由表删除
         */
        public DeleteVpcVroutertableResponse DeleteVpcVroutertableEx(DeleteVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcVroutertableResponse>(DoRequest("1.0", "antcloud.cas.vpc.vroutertable.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路由表删除
         * Summary: 路由表删除
         */
        public async Task<DeleteVpcVroutertableResponse> DeleteVpcVroutertableExAsync(DeleteVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVpcVroutertableResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vroutertable.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组中实例移除
         * Summary: 安全组中实例移除
         */
        public RemoveSecuritygroupInstanceResponse RemoveSecuritygroupInstance(RemoveSecuritygroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveSecuritygroupInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 安全组中实例移除
         * Summary: 安全组中实例移除
         */
        public async Task<RemoveSecuritygroupInstanceResponse> RemoveSecuritygroupInstanceAsync(RemoveSecuritygroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveSecuritygroupInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全组中实例移除
         * Summary: 安全组中实例移除
         */
        public RemoveSecuritygroupInstanceResponse RemoveSecuritygroupInstanceEx(RemoveSecuritygroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveSecuritygroupInstanceResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.instance.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组中实例移除
         * Summary: 安全组中实例移除
         */
        public async Task<RemoveSecuritygroupInstanceResponse> RemoveSecuritygroupInstanceExAsync(RemoveSecuritygroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveSecuritygroupInstanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.instance.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组 permission 删除
         * Summary: 安全组 permission 删除
         */
        public DeleteSecuritygroupPermissionResponse DeleteSecuritygroupPermission(DeleteSecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSecuritygroupPermissionEx(request, headers, runtime);
        }

        /**
         * Description: 安全组 permission 删除
         * Summary: 安全组 permission 删除
         */
        public async Task<DeleteSecuritygroupPermissionResponse> DeleteSecuritygroupPermissionAsync(DeleteSecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSecuritygroupPermissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全组 permission 删除
         * Summary: 安全组 permission 删除
         */
        public DeleteSecuritygroupPermissionResponse DeleteSecuritygroupPermissionEx(DeleteSecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSecuritygroupPermissionResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.permission.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组 permission 删除
         * Summary: 安全组 permission 删除
         */
        public async Task<DeleteSecuritygroupPermissionResponse> DeleteSecuritygroupPermissionExAsync(DeleteSecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSecuritygroupPermissionResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.permission.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 监听器访问 ip 删除
         * Summary: lb 监听器访问 ip 删除
         */
        public RemoveLoadbalanceSecurityipResponse RemoveLoadbalanceSecurityip(RemoveLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveLoadbalanceSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: lb 监听器访问 ip 删除
         * Summary: lb 监听器访问 ip 删除
         */
        public async Task<RemoveLoadbalanceSecurityipResponse> RemoveLoadbalanceSecurityipAsync(RemoveLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveLoadbalanceSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: lb 监听器访问 ip 删除
         * Summary: lb 监听器访问 ip 删除
         */
        public RemoveLoadbalanceSecurityipResponse RemoveLoadbalanceSecurityipEx(RemoveLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceSecurityipResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.securityip.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 监听器访问 ip 删除
         * Summary: lb 监听器访问 ip 删除
         */
        public async Task<RemoveLoadbalanceSecurityipResponse> RemoveLoadbalanceSecurityipExAsync(RemoveLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.securityip.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用创建
         * Summary: 应用创建
         */
        public CreateApplicationResponse CreateApplication(CreateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 应用创建
         * Summary: 应用创建
         */
        public async Task<CreateApplicationResponse> CreateApplicationAsync(CreateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用创建
         * Summary: 应用创建
         */
        public CreateApplicationResponse CreateApplicationEx(CreateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationResponse>(DoRequest("1.0", "antcloud.cas.application.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用创建
         * Summary: 应用创建
         */
        public async Task<CreateApplicationResponse> CreateApplicationExAsync(CreateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用删除
         * Summary: 应用删除
         */
        public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 应用删除
         * Summary: 应用删除
         */
        public async Task<DeleteApplicationResponse> DeleteApplicationAsync(DeleteApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用删除
         * Summary: 应用删除
         */
        public DeleteApplicationResponse DeleteApplicationEx(DeleteApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationResponse>(DoRequest("1.0", "antcloud.cas.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用删除
         * Summary: 应用删除
         */
        public async Task<DeleteApplicationResponse> DeleteApplicationExAsync(DeleteApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationResponse>(await DoRequestAsync("1.0", "antcloud.cas.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 创建
         * Summary: vswitch 创建
         */
        public CreateVpcVswitchResponse CreateVpcVswitch(CreateVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateVpcVswitchEx(request, headers, runtime);
        }

        /**
         * Description: vswitch 创建
         * Summary: vswitch 创建
         */
        public async Task<CreateVpcVswitchResponse> CreateVpcVswitchAsync(CreateVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateVpcVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: vswitch 创建
         * Summary: vswitch 创建
         */
        public CreateVpcVswitchResponse CreateVpcVswitchEx(CreateVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcVswitchResponse>(DoRequest("1.0", "antcloud.cas.vpc.vswitch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 创建
         * Summary: vswitch 创建
         */
        public async Task<CreateVpcVswitchResponse> CreateVpcVswitchExAsync(CreateVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vswitch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vRouterTable 创建
         * Summary: vRouterTable 创建
         */
        public CreateVpcVroutertableResponse CreateVpcVroutertable(CreateVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateVpcVroutertableEx(request, headers, runtime);
        }

        /**
         * Description: vRouterTable 创建
         * Summary: vRouterTable 创建
         */
        public async Task<CreateVpcVroutertableResponse> CreateVpcVroutertableAsync(CreateVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateVpcVroutertableExAsync(request, headers, runtime);
        }

        /**
         * Description: vRouterTable 创建
         * Summary: vRouterTable 创建
         */
        public CreateVpcVroutertableResponse CreateVpcVroutertableEx(CreateVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcVroutertableResponse>(DoRequest("1.0", "antcloud.cas.vpc.vroutertable.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vRouterTable 创建
         * Summary: vRouterTable 创建
         */
        public async Task<CreateVpcVroutertableResponse> CreateVpcVroutertableExAsync(CreateVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcVroutertableResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vroutertable.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组添加实例
         * Summary: 安全组添加实例
         */
        public AddSecuritygroupInstanceResponse AddSecuritygroupInstance(AddSecuritygroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSecuritygroupInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 安全组添加实例
         * Summary: 安全组添加实例
         */
        public async Task<AddSecuritygroupInstanceResponse> AddSecuritygroupInstanceAsync(AddSecuritygroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSecuritygroupInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全组添加实例
         * Summary: 安全组添加实例
         */
        public AddSecuritygroupInstanceResponse AddSecuritygroupInstanceEx(AddSecuritygroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSecuritygroupInstanceResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.instance.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全组添加实例
         * Summary: 安全组添加实例
         */
        public async Task<AddSecuritygroupInstanceResponse> AddSecuritygroupInstanceExAsync(AddSecuritygroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSecuritygroupInstanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.instance.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: db 规格修改
         * Summary: db 规格修改
         */
        public UpdateDatabaseSpecResponse UpdateDatabaseSpec(UpdateDatabaseSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDatabaseSpecEx(request, headers, runtime);
        }

        /**
         * Description: db 规格修改
         * Summary: db 规格修改
         */
        public async Task<UpdateDatabaseSpecResponse> UpdateDatabaseSpecAsync(UpdateDatabaseSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDatabaseSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: db 规格修改
         * Summary: db 规格修改
         */
        public UpdateDatabaseSpecResponse UpdateDatabaseSpecEx(UpdateDatabaseSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseSpecResponse>(DoRequest("1.0", "antcloud.cas.database.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: db 规格修改
         * Summary: db 规格修改
         */
        public async Task<UpdateDatabaseSpecResponse> UpdateDatabaseSpecExAsync(UpdateDatabaseSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseSpecResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 访问控制修改
         * Summary: lb 访问控制修改
         */
        public UpdateLoadbalanceAccesscontrolResponse UpdateLoadbalanceAccesscontrol(UpdateLoadbalanceAccesscontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceAccesscontrolEx(request, headers, runtime);
        }

        /**
         * Description: lb 访问控制修改
         * Summary: lb 访问控制修改
         */
        public async Task<UpdateLoadbalanceAccesscontrolResponse> UpdateLoadbalanceAccesscontrolAsync(UpdateLoadbalanceAccesscontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceAccesscontrolExAsync(request, headers, runtime);
        }

        /**
         * Description: lb 访问控制修改
         * Summary: lb 访问控制修改
         */
        public UpdateLoadbalanceAccesscontrolResponse UpdateLoadbalanceAccesscontrolEx(UpdateLoadbalanceAccesscontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceAccesscontrolResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.accesscontrol.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 访问控制修改
         * Summary: lb 访问控制修改
         */
        public async Task<UpdateLoadbalanceAccesscontrolResponse> UpdateLoadbalanceAccesscontrolExAsync(UpdateLoadbalanceAccesscontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceAccesscontrolResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.accesscontrol.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 规格修改
         * Summary: lb 规格修改
         */
        public UpdateLoadbalanceSpecResponse UpdateLoadbalanceSpec(UpdateLoadbalanceSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceSpecEx(request, headers, runtime);
        }

        /**
         * Description: lb 规格修改
         * Summary: lb 规格修改
         */
        public async Task<UpdateLoadbalanceSpecResponse> UpdateLoadbalanceSpecAsync(UpdateLoadbalanceSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: lb 规格修改
         * Summary: lb 规格修改
         */
        public UpdateLoadbalanceSpecResponse UpdateLoadbalanceSpecEx(UpdateLoadbalanceSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceSpecResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: lb 规格修改
         * Summary: lb 规格修改
         */
        public async Task<UpdateLoadbalanceSpecResponse> UpdateLoadbalanceSpecExAsync(UpdateLoadbalanceSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceSpecResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 信息修改
         * Summary: vswitch 信息修改
         */
        public UpdateVpcVswitchResponse UpdateVpcVswitch(UpdateVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateVpcVswitchEx(request, headers, runtime);
        }

        /**
         * Description: vswitch 信息修改
         * Summary: vswitch 信息修改
         */
        public async Task<UpdateVpcVswitchResponse> UpdateVpcVswitchAsync(UpdateVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateVpcVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: vswitch 信息修改
         * Summary: vswitch 信息修改
         */
        public UpdateVpcVswitchResponse UpdateVpcVswitchEx(UpdateVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVpcVswitchResponse>(DoRequest("1.0", "antcloud.cas.vpc.vswitch.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: vswitch 信息修改
         * Summary: vswitch 信息修改
         */
        public async Task<UpdateVpcVswitchResponse> UpdateVpcVswitchExAsync(UpdateVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVpcVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vswitch.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 workspace
         * Summary: 创建 workspace
         */
        public CreateWorkspaceResponse CreateWorkspace(CreateWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 创建 workspace
         * Summary: 创建 workspace
         */
        public async Task<CreateWorkspaceResponse> CreateWorkspaceAsync(CreateWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 workspace
         * Summary: 创建 workspace
         */
        public CreateWorkspaceResponse CreateWorkspaceEx(CreateWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 workspace
         * Summary: 创建 workspace
         */
        public async Task<CreateWorkspaceResponse> CreateWorkspaceExAsync(CreateWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 元数据workspace创建
         * Summary: 元数据workspace创建
         */
        public CreateMetaWorkspaceResponse CreateMetaWorkspace(CreateMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 元数据workspace创建
         * Summary: 元数据workspace创建
         */
        public async Task<CreateMetaWorkspaceResponse> CreateMetaWorkspaceAsync(CreateMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 元数据workspace创建
         * Summary: 元数据workspace创建
         */
        public CreateMetaWorkspaceResponse CreateMetaWorkspaceEx(CreateMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.meta.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 元数据workspace创建
         * Summary: 元数据workspace创建
         */
        public async Task<CreateMetaWorkspaceResponse> CreateMetaWorkspaceExAsync(CreateMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.meta.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace查询
         * Summary: workspace查询
         */
        public QueryMetaWorkspaceResponse QueryMetaWorkspace(QueryMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: workspace查询
         * Summary: workspace查询
         */
        public async Task<QueryMetaWorkspaceResponse> QueryMetaWorkspaceAsync(QueryMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: workspace查询
         * Summary: workspace查询
         */
        public QueryMetaWorkspaceResponse QueryMetaWorkspaceEx(QueryMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.meta.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace查询
         * Summary: workspace查询
         */
        public async Task<QueryMetaWorkspaceResponse> QueryMetaWorkspaceExAsync(QueryMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.meta.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 元数据workspace删除
         * Summary: 元数据workspace删除
         */
        public DeleteMetaWorkspaceResponse DeleteMetaWorkspace(DeleteMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 元数据workspace删除
         * Summary: 元数据workspace删除
         */
        public async Task<DeleteMetaWorkspaceResponse> DeleteMetaWorkspaceAsync(DeleteMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 元数据workspace删除
         * Summary: 元数据workspace删除
         */
        public DeleteMetaWorkspaceResponse DeleteMetaWorkspaceEx(DeleteMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMetaWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.meta.workspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 元数据workspace删除
         * Summary: 元数据workspace删除
         */
        public async Task<DeleteMetaWorkspaceResponse> DeleteMetaWorkspaceExAsync(DeleteMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.meta.workspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC创建
         * Summary: 资源VPC创建
         */
        public CreateResourceVpcResponse CreateResourceVpc(CreateResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 资源VPC创建
         * Summary: 资源VPC创建
         */
        public async Task<CreateResourceVpcResponse> CreateResourceVpcAsync(CreateResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源VPC创建
         * Summary: 资源VPC创建
         */
        public CreateResourceVpcResponse CreateResourceVpcEx(CreateResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceVpcResponse>(DoRequest("1.0", "antcloud.cas.resource.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC创建
         * Summary: 资源VPC创建
         */
        public async Task<CreateResourceVpcResponse> CreateResourceVpcExAsync(CreateResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC查询
         * Summary: 资源VPC查询
         */
        public QueryResourceVpcResponse QueryResourceVpc(QueryResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 资源VPC查询
         * Summary: 资源VPC查询
         */
        public async Task<QueryResourceVpcResponse> QueryResourceVpcAsync(QueryResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源VPC查询
         * Summary: 资源VPC查询
         */
        public QueryResourceVpcResponse QueryResourceVpcEx(QueryResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceVpcResponse>(DoRequest("1.0", "antcloud.cas.resource.vpc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC查询
         * Summary: 资源VPC查询
         */
        public async Task<QueryResourceVpcResponse> QueryResourceVpcExAsync(QueryResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vpc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC删除
         * Summary: 资源VPC删除
         */
        public DeleteResourceVpcResponse DeleteResourceVpc(DeleteResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteResourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 资源VPC删除
         * Summary: 资源VPC删除
         */
        public async Task<DeleteResourceVpcResponse> DeleteResourceVpcAsync(DeleteResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteResourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源VPC删除
         * Summary: 资源VPC删除
         */
        public DeleteResourceVpcResponse DeleteResourceVpcEx(DeleteResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceVpcResponse>(DoRequest("1.0", "antcloud.cas.resource.vpc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源VPC删除
         * Summary: 资源VPC删除
         */
        public async Task<DeleteResourceVpcResponse> DeleteResourceVpcExAsync(DeleteResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vpc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch创建
         * Summary: 资源vswitch创建
         */
        public CreateResourceVswitchResponse CreateResourceVswitch(CreateResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourceVswitchEx(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch创建
         * Summary: 资源vswitch创建
         */
        public async Task<CreateResourceVswitchResponse> CreateResourceVswitchAsync(CreateResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourceVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch创建
         * Summary: 资源vswitch创建
         */
        public CreateResourceVswitchResponse CreateResourceVswitchEx(CreateResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceVswitchResponse>(DoRequest("1.0", "antcloud.cas.resource.vswitch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch创建
         * Summary: 资源vswitch创建
         */
        public async Task<CreateResourceVswitchResponse> CreateResourceVswitchExAsync(CreateResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vswitch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch查询
         * Summary: 资源vswitch查询
         */
        public QueryResourceVswitchResponse QueryResourceVswitch(QueryResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourceVswitchEx(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch查询
         * Summary: 资源vswitch查询
         */
        public async Task<QueryResourceVswitchResponse> QueryResourceVswitchAsync(QueryResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourceVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch查询
         * Summary: 资源vswitch查询
         */
        public QueryResourceVswitchResponse QueryResourceVswitchEx(QueryResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceVswitchResponse>(DoRequest("1.0", "antcloud.cas.resource.vswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch查询
         * Summary: 资源vswitch查询
         */
        public async Task<QueryResourceVswitchResponse> QueryResourceVswitchExAsync(QueryResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch删除
         * Summary: 资源vswitch删除
         */
        public DeleteResourceVswitchResponse DeleteResourceVswitch(DeleteResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteResourceVswitchEx(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch删除
         * Summary: 资源vswitch删除
         */
        public async Task<DeleteResourceVswitchResponse> DeleteResourceVswitchAsync(DeleteResourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteResourceVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源vswitch删除
         * Summary: 资源vswitch删除
         */
        public DeleteResourceVswitchResponse DeleteResourceVswitchEx(DeleteResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceVswitchResponse>(DoRequest("1.0", "antcloud.cas.resource.vswitch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源vswitch删除
         * Summary: 资源vswitch删除
         */
        public async Task<DeleteResourceVswitchResponse> DeleteResourceVswitchExAsync(DeleteResourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vswitch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源securitygroup查询
         * Summary: 资源securitygroup查询
         */
        public QueryResourceSecuritygroupResponse QueryResourceSecuritygroup(QueryResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourceSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 资源securitygroup查询
         * Summary: 资源securitygroup查询
         */
        public async Task<QueryResourceSecuritygroupResponse> QueryResourceSecuritygroupAsync(QueryResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourceSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源securitygroup查询
         * Summary: 资源securitygroup查询
         */
        public QueryResourceSecuritygroupResponse QueryResourceSecuritygroupEx(QueryResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.resource.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源securitygroup查询
         * Summary: 资源securitygroup查询
         */
        public async Task<QueryResourceSecuritygroupResponse> QueryResourceSecuritygroupExAsync(QueryResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace 列表
         * Summary: workspace 列表
         */
        public ListMetaWorkspaceResponse ListMetaWorkspace(ListMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMetaWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: workspace 列表
         * Summary: workspace 列表
         */
        public async Task<ListMetaWorkspaceResponse> ListMetaWorkspaceAsync(ListMetaWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMetaWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: workspace 列表
         * Summary: workspace 列表
         */
        public ListMetaWorkspaceResponse ListMetaWorkspaceEx(ListMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMetaWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.meta.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace 列表
         * Summary: workspace 列表
         */
        public async Task<ListMetaWorkspaceResponse> ListMetaWorkspaceExAsync(ListMetaWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMetaWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.meta.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建安全组资源
         * Summary: 创建安全组
         */
        public CreateResourceSecuritygroupResponse CreateResourceSecuritygroup(CreateResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourceSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建安全组资源
         * Summary: 创建安全组
         */
        public async Task<CreateResourceSecuritygroupResponse> CreateResourceSecuritygroupAsync(CreateResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourceSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建安全组资源
         * Summary: 创建安全组
         */
        public CreateResourceSecuritygroupResponse CreateResourceSecuritygroupEx(CreateResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.resource.securitygroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建安全组资源
         * Summary: 创建安全组
         */
        public async Task<CreateResourceSecuritygroupResponse> CreateResourceSecuritygroupExAsync(CreateResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.securitygroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除安全组
         * Summary: 删除安全组
         */
        public DeleteResourceSecuritygroupResponse DeleteResourceSecuritygroup(DeleteResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteResourceSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除安全组
         * Summary: 删除安全组
         */
        public async Task<DeleteResourceSecuritygroupResponse> DeleteResourceSecuritygroupAsync(DeleteResourceSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteResourceSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除安全组
         * Summary: 删除安全组
         */
        public DeleteResourceSecuritygroupResponse DeleteResourceSecuritygroupEx(DeleteResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.resource.securitygroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除安全组
         * Summary: 删除安全组
         */
        public async Task<DeleteResourceSecuritygroupResponse> DeleteResourceSecuritygroupExAsync(DeleteResourceSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.securitygroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建云主机instance
         * Summary: 创建云主机instance
         */
        public CreateResourceComputerResponse CreateResourceComputer(CreateResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourceComputerEx(request, headers, runtime);
        }

        /**
         * Description: 创建云主机instance
         * Summary: 创建云主机instance
         */
        public async Task<CreateResourceComputerResponse> CreateResourceComputerAsync(CreateResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourceComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建云主机instance
         * Summary: 创建云主机instance
         */
        public CreateResourceComputerResponse CreateResourceComputerEx(CreateResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceComputerResponse>(DoRequest("1.0", "antcloud.cas.resource.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建云主机instance
         * Summary: 创建云主机instance
         */
        public async Task<CreateResourceComputerResponse> CreateResourceComputerExAsync(CreateResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 查询
         * Summary: computer 查询
         */
        public QueryResourceComputerResponse QueryResourceComputer(QueryResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourceComputerEx(request, headers, runtime);
        }

        /**
         * Description: computer 查询
         * Summary: computer 查询
         */
        public async Task<QueryResourceComputerResponse> QueryResourceComputerAsync(QueryResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourceComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: computer 查询
         * Summary: computer 查询
         */
        public QueryResourceComputerResponse QueryResourceComputerEx(QueryResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceComputerResponse>(DoRequest("1.0", "antcloud.cas.resource.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: computer 查询
         * Summary: computer 查询
         */
        public async Task<QueryResourceComputerResponse> QueryResourceComputerExAsync(QueryResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据CPU内存机器规格查询api
         * Summary: 机器规格查询api
         */
        public QueryResourceComputerspecResponse QueryResourceComputerspec(QueryResourceComputerspecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourceComputerspecEx(request, headers, runtime);
        }

        /**
         * Description: 根据CPU内存机器规格查询api
         * Summary: 机器规格查询api
         */
        public async Task<QueryResourceComputerspecResponse> QueryResourceComputerspecAsync(QueryResourceComputerspecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourceComputerspecExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据CPU内存机器规格查询api
         * Summary: 机器规格查询api
         */
        public QueryResourceComputerspecResponse QueryResourceComputerspecEx(QueryResourceComputerspecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceComputerspecResponse>(DoRequest("1.0", "antcloud.cas.resource.computerspec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据CPU内存机器规格查询api
         * Summary: 机器规格查询api
         */
        public async Task<QueryResourceComputerspecResponse> QueryResourceComputerspecExAsync(QueryResourceComputerspecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourceComputerspecResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computerspec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除computer
         * Summary: 删除computer
         */
        public DeleteResourceComputerResponse DeleteResourceComputer(DeleteResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteResourceComputerEx(request, headers, runtime);
        }

        /**
         * Description: 删除computer
         * Summary: 删除computer
         */
        public async Task<DeleteResourceComputerResponse> DeleteResourceComputerAsync(DeleteResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteResourceComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除computer
         * Summary: 删除computer
         */
        public DeleteResourceComputerResponse DeleteResourceComputerEx(DeleteResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceComputerResponse>(DoRequest("1.0", "antcloud.cas.resource.computer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除computer
         * Summary: 删除computer
         */
        public async Task<DeleteResourceComputerResponse> DeleteResourceComputerExAsync(DeleteResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置computer密码
         * Summary: 重置computer密码
         */
        public ReinitResourceComputerpasswordResponse ReinitResourceComputerpassword(ReinitResourceComputerpasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitResourceComputerpasswordEx(request, headers, runtime);
        }

        /**
         * Description: 重置computer密码
         * Summary: 重置computer密码
         */
        public async Task<ReinitResourceComputerpasswordResponse> ReinitResourceComputerpasswordAsync(ReinitResourceComputerpasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitResourceComputerpasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 重置computer密码
         * Summary: 重置computer密码
         */
        public ReinitResourceComputerpasswordResponse ReinitResourceComputerpasswordEx(ReinitResourceComputerpasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitResourceComputerpasswordResponse>(DoRequest("1.0", "antcloud.cas.resource.computerpassword.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置computer密码
         * Summary: 重置computer密码
         */
        public async Task<ReinitResourceComputerpasswordResponse> ReinitResourceComputerpasswordExAsync(ReinitResourceComputerpasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitResourceComputerpasswordResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computerpassword.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动computer
         * Summary: 启动computer
         */
        public StartResourceComputerResponse StartResourceComputer(StartResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartResourceComputerEx(request, headers, runtime);
        }

        /**
         * Description: 启动computer
         * Summary: 启动computer
         */
        public async Task<StartResourceComputerResponse> StartResourceComputerAsync(StartResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartResourceComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动computer
         * Summary: 启动computer
         */
        public StartResourceComputerResponse StartResourceComputerEx(StartResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartResourceComputerResponse>(DoRequest("1.0", "antcloud.cas.resource.computer.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动computer
         * Summary: 启动computer
         */
        public async Task<StartResourceComputerResponse> StartResourceComputerExAsync(StartResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartResourceComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computer.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止机器
         * Summary: 停止机器
         */
        public StopResourceComputerResponse StopResourceComputer(StopResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopResourceComputerEx(request, headers, runtime);
        }

        /**
         * Description: 停止机器
         * Summary: 停止机器
         */
        public async Task<StopResourceComputerResponse> StopResourceComputerAsync(StopResourceComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopResourceComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止机器
         * Summary: 停止机器
         */
        public StopResourceComputerResponse StopResourceComputerEx(StopResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopResourceComputerResponse>(DoRequest("1.0", "antcloud.cas.resource.computer.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止机器
         * Summary: 停止机器
         */
        public async Task<StopResourceComputerResponse> StopResourceComputerExAsync(StopResourceComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopResourceComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computer.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志项目
         * Summary: 创建日志项目
         */
        public CreateSlsProjectResponse CreateSlsProject(CreateSlsProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSlsProjectEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志项目
         * Summary: 创建日志项目
         */
        public async Task<CreateSlsProjectResponse> CreateSlsProjectAsync(CreateSlsProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSlsProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志项目
         * Summary: 创建日志项目
         */
        public CreateSlsProjectResponse CreateSlsProjectEx(CreateSlsProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsProjectResponse>(DoRequest("1.0", "antcloud.cas.sls.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志项目
         * Summary: 创建日志项目
         */
        public async Task<CreateSlsProjectResponse> CreateSlsProjectExAsync(CreateSlsProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsProjectResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志项目列表
         * Summary: 获取日志项目列表
         */
        public ListSlsProjectResponse ListSlsProject(ListSlsProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSlsProjectEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志项目列表
         * Summary: 获取日志项目列表
         */
        public async Task<ListSlsProjectResponse> ListSlsProjectAsync(ListSlsProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSlsProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志项目列表
         * Summary: 获取日志项目列表
         */
        public ListSlsProjectResponse ListSlsProjectEx(ListSlsProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsProjectResponse>(DoRequest("1.0", "antcloud.cas.sls.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志项目列表
         * Summary: 获取日志项目列表
         */
        public async Task<ListSlsProjectResponse> ListSlsProjectExAsync(ListSlsProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsProjectResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志库
         * Summary: 创建日志库
         */
        public CreateSlsLogstoreResponse CreateSlsLogstore(CreateSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSlsLogstoreEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志库
         * Summary: 创建日志库
         */
        public async Task<CreateSlsLogstoreResponse> CreateSlsLogstoreAsync(CreateSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSlsLogstoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志库
         * Summary: 创建日志库
         */
        public CreateSlsLogstoreResponse CreateSlsLogstoreEx(CreateSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsLogstoreResponse>(DoRequest("1.0", "antcloud.cas.sls.logstore.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志库
         * Summary: 创建日志库
         */
        public async Task<CreateSlsLogstoreResponse> CreateSlsLogstoreExAsync(CreateSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsLogstoreResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.logstore.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志库列表
         * Summary: 获取日志库列表
         */
        public ListSlsLogstoreResponse ListSlsLogstore(ListSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSlsLogstoreEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志库列表
         * Summary: 获取日志库列表
         */
        public async Task<ListSlsLogstoreResponse> ListSlsLogstoreAsync(ListSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSlsLogstoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志库列表
         * Summary: 获取日志库列表
         */
        public ListSlsLogstoreResponse ListSlsLogstoreEx(ListSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsLogstoreResponse>(DoRequest("1.0", "antcloud.cas.sls.logstore.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志库列表
         * Summary: 获取日志库列表
         */
        public async Task<ListSlsLogstoreResponse> ListSlsLogstoreExAsync(ListSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsLogstoreResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.logstore.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取单个日志库
         * Summary: 获取单个日志库
         */
        public GetSlsLogstoreResponse GetSlsLogstore(GetSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSlsLogstoreEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取单个日志库
         * Summary: 获取单个日志库
         */
        public async Task<GetSlsLogstoreResponse> GetSlsLogstoreAsync(GetSlsLogstoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSlsLogstoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取单个日志库
         * Summary: 获取单个日志库
         */
        public GetSlsLogstoreResponse GetSlsLogstoreEx(GetSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSlsLogstoreResponse>(DoRequest("1.0", "antcloud.cas.sls.logstore.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取单个日志库
         * Summary: 获取单个日志库
         */
        public async Task<GetSlsLogstoreResponse> GetSlsLogstoreExAsync(GetSlsLogstoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSlsLogstoreResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.logstore.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志配置
         * Summary: 创建日志配置
         */
        public CreateSlsConfigResponse CreateSlsConfig(CreateSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSlsConfigEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志配置
         * Summary: 创建日志配置
         */
        public async Task<CreateSlsConfigResponse> CreateSlsConfigAsync(CreateSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSlsConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志配置
         * Summary: 创建日志配置
         */
        public CreateSlsConfigResponse CreateSlsConfigEx(CreateSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsConfigResponse>(DoRequest("1.0", "antcloud.cas.sls.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-创建日志配置
         * Summary: 创建日志配置
         */
        public async Task<CreateSlsConfigResponse> CreateSlsConfigExAsync(CreateSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSlsConfigResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志配置列表
         * Summary: 获取日志配置列表
         */
        public ListSlsConfigResponse ListSlsConfig(ListSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSlsConfigEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志配置列表
         * Summary: 获取日志配置列表
         */
        public async Task<ListSlsConfigResponse> ListSlsConfigAsync(ListSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSlsConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志配置列表
         * Summary: 获取日志配置列表
         */
        public ListSlsConfigResponse ListSlsConfigEx(ListSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsConfigResponse>(DoRequest("1.0", "antcloud.cas.sls.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-获取日志配置列表
         * Summary: 获取日志配置列表
         */
        public async Task<ListSlsConfigResponse> ListSlsConfigExAsync(ListSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSlsConfigResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-更新日志配置
         * Summary: 更新日志配置
         */
        public UpdateSlsConfigResponse UpdateSlsConfig(UpdateSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSlsConfigEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-更新日志配置
         * Summary: 更新日志配置
         */
        public async Task<UpdateSlsConfigResponse> UpdateSlsConfigAsync(UpdateSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSlsConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-更新日志配置
         * Summary: 更新日志配置
         */
        public UpdateSlsConfigResponse UpdateSlsConfigEx(UpdateSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSlsConfigResponse>(DoRequest("1.0", "antcloud.cas.sls.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-更新日志配置
         * Summary: 更新日志配置
         */
        public async Task<UpdateSlsConfigResponse> UpdateSlsConfigExAsync(UpdateSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSlsConfigResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-删除日志配置
         * Summary: 删除日志配置
         */
        public DeleteSlsConfigResponse DeleteSlsConfig(DeleteSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSlsConfigEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-删除日志配置
         * Summary: 删除日志配置
         */
        public async Task<DeleteSlsConfigResponse> DeleteSlsConfigAsync(DeleteSlsConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSlsConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS)-删除日志配置
         * Summary: 删除日志配置
         */
        public DeleteSlsConfigResponse DeleteSlsConfigEx(DeleteSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSlsConfigResponse>(DoRequest("1.0", "antcloud.cas.sls.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS)-删除日志配置
         * Summary: 删除日志配置
         */
        public async Task<DeleteSlsConfigResponse> DeleteSlsConfigExAsync(DeleteSlsConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSlsConfigResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS) - 查询日志
         * Summary: 查询日志
         */
        public QuerySlsLogResponse QuerySlsLog(QuerySlsLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySlsLogEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS) - 查询日志
         * Summary: 查询日志
         */
        public async Task<QuerySlsLogResponse> QuerySlsLogAsync(QuerySlsLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySlsLogExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云日志服务(SLS) - 查询日志
         * Summary: 查询日志
         */
        public QuerySlsLogResponse QuerySlsLogEx(QuerySlsLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySlsLogResponse>(DoRequest("1.0", "antcloud.cas.sls.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云日志服务(SLS) - 查询日志
         * Summary: 查询日志
         */
        public async Task<QuerySlsLogResponse> QuerySlsLogExAsync(QuerySlsLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySlsLogResponse>(await DoRequestAsync("1.0", "antcloud.cas.sls.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量添加安全组入规则
         * Summary: 批量添加安全组规则
         */
        public BatchcreateResourceIngressrulesResponse BatchcreateResourceIngressrules(BatchcreateResourceIngressrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateResourceIngressrulesEx(request, headers, runtime);
        }

        /**
         * Description: 批量添加安全组入规则
         * Summary: 批量添加安全组规则
         */
        public async Task<BatchcreateResourceIngressrulesResponse> BatchcreateResourceIngressrulesAsync(BatchcreateResourceIngressrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateResourceIngressrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量添加安全组入规则
         * Summary: 批量添加安全组规则
         */
        public BatchcreateResourceIngressrulesResponse BatchcreateResourceIngressrulesEx(BatchcreateResourceIngressrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateResourceIngressrulesResponse>(DoRequest("1.0", "antcloud.cas.resource.ingressrules.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量添加安全组入规则
         * Summary: 批量添加安全组规则
         */
        public async Task<BatchcreateResourceIngressrulesResponse> BatchcreateResourceIngressrulesExAsync(BatchcreateResourceIngressrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateResourceIngressrulesResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.ingressrules.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量添加安全组出方向规则
         * Summary: 批量添加安全组出方向规则
         */
        public BatchcreateResourceEgressrulesResponse BatchcreateResourceEgressrules(BatchcreateResourceEgressrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateResourceEgressrulesEx(request, headers, runtime);
        }

        /**
         * Description: 批量添加安全组出方向规则
         * Summary: 批量添加安全组出方向规则
         */
        public async Task<BatchcreateResourceEgressrulesResponse> BatchcreateResourceEgressrulesAsync(BatchcreateResourceEgressrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateResourceEgressrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量添加安全组出方向规则
         * Summary: 批量添加安全组出方向规则
         */
        public BatchcreateResourceEgressrulesResponse BatchcreateResourceEgressrulesEx(BatchcreateResourceEgressrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateResourceEgressrulesResponse>(DoRequest("1.0", "antcloud.cas.resource.egressrules.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量添加安全组出方向规则
         * Summary: 批量添加安全组出方向规则
         */
        public async Task<BatchcreateResourceEgressrulesResponse> BatchcreateResourceEgressrulesExAsync(BatchcreateResourceEgressrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateResourceEgressrulesResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.egressrules.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance查询
         * Summary: loadbalance查询
         */
        public QueryLoadbalanceResponse QueryLoadbalance(QueryLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: loadbalance查询
         * Summary: loadbalance查询
         */
        public async Task<QueryLoadbalanceResponse> QueryLoadbalanceAsync(QueryLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: loadbalance查询
         * Summary: loadbalance查询
         */
        public QueryLoadbalanceResponse QueryLoadbalanceEx(QueryLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: loadbalance查询
         * Summary: loadbalance查询
         */
        public async Task<QueryLoadbalanceResponse> QueryLoadbalanceExAsync(QueryLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个LB的健康状态
         * Summary: 获取单个LB的健康状态
         */
        public GetLoadbalanceHealthResponse GetLoadbalanceHealth(GetLoadbalanceHealthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLoadbalanceHealthEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个LB的健康状态
         * Summary: 获取单个LB的健康状态
         */
        public async Task<GetLoadbalanceHealthResponse> GetLoadbalanceHealthAsync(GetLoadbalanceHealthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLoadbalanceHealthExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个LB的健康状态
         * Summary: 获取单个LB的健康状态
         */
        public GetLoadbalanceHealthResponse GetLoadbalanceHealthEx(GetLoadbalanceHealthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceHealthResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.health.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个LB的健康状态
         * Summary: 获取单个LB的健康状态
         */
        public async Task<GetLoadbalanceHealthResponse> GetLoadbalanceHealthExAsync(GetLoadbalanceHealthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceHealthResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.health.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有的vip类型
         * Summary: 获取所有的vip类型
         */
        public AllLoadbalanceViptypeResponse AllLoadbalanceViptype(AllLoadbalanceViptypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceViptypeEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有的vip类型
         * Summary: 获取所有的vip类型
         */
        public async Task<AllLoadbalanceViptypeResponse> AllLoadbalanceViptypeAsync(AllLoadbalanceViptypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceViptypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有的vip类型
         * Summary: 获取所有的vip类型
         */
        public AllLoadbalanceViptypeResponse AllLoadbalanceViptypeEx(AllLoadbalanceViptypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceViptypeResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.viptype.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有的vip类型
         * Summary: 获取所有的vip类型
         */
        public async Task<AllLoadbalanceViptypeResponse> AllLoadbalanceViptypeExAsync(AllLoadbalanceViptypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceViptypeResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.viptype.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有的LB集群
         * Summary: 获取所有的LB集群
         */
        public AllLoadbalanceClusterResponse AllLoadbalanceCluster(AllLoadbalanceClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceClusterEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有的LB集群
         * Summary: 获取所有的LB集群
         */
        public async Task<AllLoadbalanceClusterResponse> AllLoadbalanceClusterAsync(AllLoadbalanceClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有的LB集群
         * Summary: 获取所有的LB集群
         */
        public AllLoadbalanceClusterResponse AllLoadbalanceClusterEx(AllLoadbalanceClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceClusterResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.cluster.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有的LB集群
         * Summary: 获取所有的LB集群
         */
        public async Task<AllLoadbalanceClusterResponse> AllLoadbalanceClusterExAsync(AllLoadbalanceClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceClusterResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.cluster.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vpc详细信息
         * Summary: 查询vpc详细信息
         */
        public QueryVpcResponse QueryVpc(QueryVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryVpcEx(request, headers, runtime);
        }

        /**
         * Description: 查询vpc详细信息
         * Summary: 查询vpc详细信息
         */
        public async Task<QueryVpcResponse> QueryVpcAsync(QueryVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询vpc详细信息
         * Summary: 查询vpc详细信息
         */
        public QueryVpcResponse QueryVpcEx(QueryVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcResponse>(DoRequest("1.0", "antcloud.cas.vpc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vpc详细信息
         * Summary: 查询vpc详细信息
         */
        public async Task<QueryVpcResponse> QueryVpcExAsync(QueryVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已导入workspace的vpc
         * Summary: 查询已导入workspace的vpc
         */
        public ListVpcImportResponse ListVpcImport(ListVpcImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListVpcImportEx(request, headers, runtime);
        }

        /**
         * Description: 查询已导入workspace的vpc
         * Summary: 查询已导入workspace的vpc
         */
        public async Task<ListVpcImportResponse> ListVpcImportAsync(ListVpcImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListVpcImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已导入workspace的vpc
         * Summary: 查询已导入workspace的vpc
         */
        public ListVpcImportResponse ListVpcImportEx(ListVpcImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVpcImportResponse>(DoRequest("1.0", "antcloud.cas.vpc.import.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已导入workspace的vpc
         * Summary: 查询已导入workspace的vpc
         */
        public async Task<ListVpcImportResponse> ListVpcImportExAsync(ListVpcImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVpcImportResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.import.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vpc cidrblock信息
         * Summary: 查询vpc cidrblock信息
         */
        public ListVpcCidrblockResponse ListVpcCidrblock(ListVpcCidrblockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListVpcCidrblockEx(request, headers, runtime);
        }

        /**
         * Description: 查询vpc cidrblock信息
         * Summary: 查询vpc cidrblock信息
         */
        public async Task<ListVpcCidrblockResponse> ListVpcCidrblockAsync(ListVpcCidrblockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListVpcCidrblockExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询vpc cidrblock信息
         * Summary: 查询vpc cidrblock信息
         */
        public ListVpcCidrblockResponse ListVpcCidrblockEx(ListVpcCidrblockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVpcCidrblockResponse>(DoRequest("1.0", "antcloud.cas.vpc.cidrblock.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vpc cidrblock信息
         * Summary: 查询vpc cidrblock信息
         */
        public async Task<ListVpcCidrblockResponse> ListVpcCidrblockExAsync(ListVpcCidrblockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVpcCidrblockResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.cidrblock.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public QueryVpcVswitchResponse QueryVpcVswitch(QueryVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryVpcVswitchEx(request, headers, runtime);
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public async Task<QueryVpcVswitchResponse> QueryVpcVswitchAsync(QueryVpcVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryVpcVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public QueryVpcVswitchResponse QueryVpcVswitchEx(QueryVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcVswitchResponse>(DoRequest("1.0", "antcloud.cas.vpc.vswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public async Task<QueryVpcVswitchResponse> QueryVpcVswitchExAsync(QueryVpcVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由表信息
         * Summary: 查询路由表信息
         */
        public QueryVpcVroutertableResponse QueryVpcVroutertable(QueryVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryVpcVroutertableEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由表信息
         * Summary: 查询路由表信息
         */
        public async Task<QueryVpcVroutertableResponse> QueryVpcVroutertableAsync(QueryVpcVroutertableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryVpcVroutertableExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由表信息
         * Summary: 查询路由表信息
         */
        public QueryVpcVroutertableResponse QueryVpcVroutertableEx(QueryVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcVroutertableResponse>(DoRequest("1.0", "antcloud.cas.vpc.vroutertable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由表信息
         * Summary: 查询路由表信息
         */
        public async Task<QueryVpcVroutertableResponse> QueryVpcVroutertableExAsync(QueryVpcVroutertableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVpcVroutertableResponse>(await DoRequestAsync("1.0", "antcloud.cas.vpc.vroutertable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个rule
         * Summary: 获取单个rule
         */
        public GetLoadbalanceRuleResponse GetLoadbalanceRule(GetLoadbalanceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLoadbalanceRuleEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个rule
         * Summary: 获取单个rule
         */
        public async Task<GetLoadbalanceRuleResponse> GetLoadbalanceRuleAsync(GetLoadbalanceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLoadbalanceRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个rule
         * Summary: 获取单个rule
         */
        public GetLoadbalanceRuleResponse GetLoadbalanceRuleEx(GetLoadbalanceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceRuleResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个rule
         * Summary: 获取单个rule
         */
        public async Task<GetLoadbalanceRuleResponse> GetLoadbalanceRuleExAsync(GetLoadbalanceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceRuleResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询Lb rule
         * Summary: 批量查询Lb rule
         */
        public QueryLoadbalanceRuleResponse QueryLoadbalanceRule(QueryLoadbalanceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceRuleEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询Lb rule
         * Summary: 批量查询Lb rule
         */
        public async Task<QueryLoadbalanceRuleResponse> QueryLoadbalanceRuleAsync(QueryLoadbalanceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询Lb rule
         * Summary: 批量查询Lb rule
         */
        public QueryLoadbalanceRuleResponse QueryLoadbalanceRuleEx(QueryLoadbalanceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceRuleResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询Lb rule
         * Summary: 批量查询Lb rule
         */
        public async Task<QueryLoadbalanceRuleResponse> QueryLoadbalanceRuleExAsync(QueryLoadbalanceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceRuleResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个Lb ById
         * Summary: 获取单个Lb ById
         */
        public GetLoadbalanceResponse GetLoadbalance(GetLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个Lb ById
         * Summary: 获取单个Lb ById
         */
        public async Task<GetLoadbalanceResponse> GetLoadbalanceAsync(GetLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个Lb ById
         * Summary: 获取单个Lb ById
         */
        public GetLoadbalanceResponse GetLoadbalanceEx(GetLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个Lb ById
         * Summary: 获取单个Lb ById
         */
        public async Task<GetLoadbalanceResponse> GetLoadbalanceExAsync(GetLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取LB后端所有主机
         * Summary: 获取LB后端所有主机
         */
        public AllLoadbalanceMountResponse AllLoadbalanceMount(AllLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceMountEx(request, headers, runtime);
        }

        /**
         * Description: 获取LB后端所有主机
         * Summary: 获取LB后端所有主机
         */
        public async Task<AllLoadbalanceMountResponse> AllLoadbalanceMountAsync(AllLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceMountExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取LB后端所有主机
         * Summary: 获取LB后端所有主机
         */
        public AllLoadbalanceMountResponse AllLoadbalanceMountEx(AllLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceMountResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.mount.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取LB后端所有主机
         * Summary: 获取LB后端所有主机
         */
        public async Task<AllLoadbalanceMountResponse> AllLoadbalanceMountExAsync(AllLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceMountResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.mount.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询后端的主机
         * Summary: 根据条件查询后端的主机
         */
        public QueryLoadbalanceMountResponse QueryLoadbalanceMount(QueryLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceMountEx(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询后端的主机
         * Summary: 根据条件查询后端的主机
         */
        public async Task<QueryLoadbalanceMountResponse> QueryLoadbalanceMountAsync(QueryLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceMountExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询后端的主机
         * Summary: 根据条件查询后端的主机
         */
        public QueryLoadbalanceMountResponse QueryLoadbalanceMountEx(QueryLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceMountResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.mount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询后端的主机
         * Summary: 根据条件查询后端的主机
         */
        public async Task<QueryLoadbalanceMountResponse> QueryLoadbalanceMountExAsync(QueryLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceMountResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.mount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个vcomputergroup
         * Summary: 获取单个vcomputergroup
         */
        public GetLoadbalanceVcomputergroupResponse GetLoadbalanceVcomputergroup(GetLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个vcomputergroup
         * Summary: 获取单个vcomputergroup
         */
        public async Task<GetLoadbalanceVcomputergroupResponse> GetLoadbalanceVcomputergroupAsync(GetLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个vcomputergroup
         * Summary: 获取单个vcomputergroup
         */
        public GetLoadbalanceVcomputergroupResponse GetLoadbalanceVcomputergroupEx(GetLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个vcomputergroup
         * Summary: 获取单个vcomputergroup
         */
        public async Task<GetLoadbalanceVcomputergroupResponse> GetLoadbalanceVcomputergroupExAsync(GetLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vcomputergroup
         * Summary: 查询vcomputergroup
         */
        public QueryLoadbalanceVcomputergroupResponse QueryLoadbalanceVcomputergroup(QueryLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询vcomputergroup
         * Summary: 查询vcomputergroup
         */
        public async Task<QueryLoadbalanceVcomputergroupResponse> QueryLoadbalanceVcomputergroupAsync(QueryLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询vcomputergroup
         * Summary: 查询vcomputergroup
         */
        public QueryLoadbalanceVcomputergroupResponse QueryLoadbalanceVcomputergroupEx(QueryLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询vcomputergroup
         * Summary: 查询vcomputergroup
         */
        public async Task<QueryLoadbalanceVcomputergroupResponse> QueryLoadbalanceVcomputergroupExAsync(QueryLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有vcomputergroup
         * Summary: 获取所有vcomputergroup
         */
        public AllLoadbalanceVcomputergroupResponse AllLoadbalanceVcomputergroup(AllLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有vcomputergroup
         * Summary: 获取所有vcomputergroup
         */
        public async Task<AllLoadbalanceVcomputergroupResponse> AllLoadbalanceVcomputergroupAsync(AllLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有vcomputergroup
         * Summary: 获取所有vcomputergroup
         */
        public AllLoadbalanceVcomputergroupResponse AllLoadbalanceVcomputergroupEx(AllLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有vcomputergroup
         * Summary: 获取所有vcomputergroup
         */
        public async Task<AllLoadbalanceVcomputergroupResponse> AllLoadbalanceVcomputergroupExAsync(AllLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取vcomputer
         * Summary: 获取vcomputer
         */
        public QueryLoadbalanceVcomputerResponse QueryLoadbalanceVcomputer(QueryLoadbalanceVcomputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceVcomputerEx(request, headers, runtime);
        }

        /**
         * Description: 获取vcomputer
         * Summary: 获取vcomputer
         */
        public async Task<QueryLoadbalanceVcomputerResponse> QueryLoadbalanceVcomputerAsync(QueryLoadbalanceVcomputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceVcomputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取vcomputer
         * Summary: 获取vcomputer
         */
        public QueryLoadbalanceVcomputerResponse QueryLoadbalanceVcomputerEx(QueryLoadbalanceVcomputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceVcomputerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取vcomputer
         * Summary: 获取vcomputer
         */
        public async Task<QueryLoadbalanceVcomputerResponse> QueryLoadbalanceVcomputerExAsync(QueryLoadbalanceVcomputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceVcomputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询listener
         * Summary: 查询listener
         */
        public QueryLoadbalanceListenerResponse QueryLoadbalanceListener(QueryLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 查询listener
         * Summary: 查询listener
         */
        public async Task<QueryLoadbalanceListenerResponse> QueryLoadbalanceListenerAsync(QueryLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询listener
         * Summary: 查询listener
         */
        public QueryLoadbalanceListenerResponse QueryLoadbalanceListenerEx(QueryLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询listener
         * Summary: 查询listener
         */
        public async Task<QueryLoadbalanceListenerResponse> QueryLoadbalanceListenerExAsync(QueryLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有listener
         * Summary: 获取所有listener
         */
        public AllLoadbalanceListenerResponse AllLoadbalanceListener(AllLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有listener
         * Summary: 获取所有listener
         */
        public async Task<AllLoadbalanceListenerResponse> AllLoadbalanceListenerAsync(AllLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有listener
         * Summary: 获取所有listener
         */
        public AllLoadbalanceListenerResponse AllLoadbalanceListenerEx(AllLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有listener
         * Summary: 获取所有listener
         */
        public async Task<AllLoadbalanceListenerResponse> AllLoadbalanceListenerExAsync(AllLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public QueryLoadbalanceSecurityipResponse QueryLoadbalanceSecurityip(QueryLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public async Task<QueryLoadbalanceSecurityipResponse> QueryLoadbalanceSecurityipAsync(QueryLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public QueryLoadbalanceSecurityipResponse QueryLoadbalanceSecurityipEx(QueryLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceSecurityipResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.securityip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public async Task<QueryLoadbalanceSecurityipResponse> QueryLoadbalanceSecurityipExAsync(QueryLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.securityip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个database
         * Summary: 获取单个database
         */
        public GetDatabaseResponse GetDatabase(GetDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个database
         * Summary: 获取单个database
         */
        public async Task<GetDatabaseResponse> GetDatabaseAsync(GetDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个database
         * Summary: 获取单个database
         */
        public GetDatabaseResponse GetDatabaseEx(GetDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个database
         * Summary: 获取单个database
         */
        public async Task<GetDatabaseResponse> GetDatabaseExAsync(GetDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有masterzone
         * Summary: 获取所有masterzone
         */
        public AllDatabaseMasterzoneResponse AllDatabaseMasterzone(AllDatabaseMasterzoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDatabaseMasterzoneEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有masterzone
         * Summary: 获取所有masterzone
         */
        public async Task<AllDatabaseMasterzoneResponse> AllDatabaseMasterzoneAsync(AllDatabaseMasterzoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDatabaseMasterzoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有masterzone
         * Summary: 获取所有masterzone
         */
        public AllDatabaseMasterzoneResponse AllDatabaseMasterzoneEx(AllDatabaseMasterzoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseMasterzoneResponse>(DoRequest("1.0", "antcloud.cas.database.masterzone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有masterzone
         * Summary: 获取所有masterzone
         */
        public async Task<AllDatabaseMasterzoneResponse> AllDatabaseMasterzoneExAsync(AllDatabaseMasterzoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseMasterzoneResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.masterzone.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库
         * Summary: 查询数据库
         */
        public QueryDatabaseResponse QueryDatabase(QueryDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库
         * Summary: 查询数据库
         */
        public async Task<QueryDatabaseResponse> QueryDatabaseAsync(QueryDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库
         * Summary: 查询数据库
         */
        public QueryDatabaseResponse QueryDatabaseEx(QueryDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库
         * Summary: 查询数据库
         */
        public async Task<QueryDatabaseResponse> QueryDatabaseExAsync(QueryDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库规格
         * Summary: 查询数据库规格
         */
        public QueryDatabaseSpecResponse QueryDatabaseSpec(QueryDatabaseSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseSpecEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库规格
         * Summary: 查询数据库规格
         */
        public async Task<QueryDatabaseSpecResponse> QueryDatabaseSpecAsync(QueryDatabaseSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库规格
         * Summary: 查询数据库规格
         */
        public QueryDatabaseSpecResponse QueryDatabaseSpecEx(QueryDatabaseSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSpecResponse>(DoRequest("1.0", "antcloud.cas.database.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库规格
         * Summary: 查询数据库规格
         */
        public async Task<QueryDatabaseSpecResponse> QueryDatabaseSpecExAsync(QueryDatabaseSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSpecResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据引擎
         * Summary: 查询数据引擎
         */
        public AllDatabaseEngineResponse AllDatabaseEngine(AllDatabaseEngineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDatabaseEngineEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据引擎
         * Summary: 查询数据引擎
         */
        public async Task<AllDatabaseEngineResponse> AllDatabaseEngineAsync(AllDatabaseEngineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDatabaseEngineExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据引擎
         * Summary: 查询数据引擎
         */
        public AllDatabaseEngineResponse AllDatabaseEngineEx(AllDatabaseEngineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseEngineResponse>(DoRequest("1.0", "antcloud.cas.database.engine.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据引擎
         * Summary: 查询数据引擎
         */
        public async Task<AllDatabaseEngineResponse> AllDatabaseEngineExAsync(AllDatabaseEngineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseEngineResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.engine.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库quota
         * Summary: 查询数据库quota
         */
        public AllDatabaseQuotaResponse AllDatabaseQuota(AllDatabaseQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDatabaseQuotaEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库quota
         * Summary: 查询数据库quota
         */
        public async Task<AllDatabaseQuotaResponse> AllDatabaseQuotaAsync(AllDatabaseQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDatabaseQuotaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库quota
         * Summary: 查询数据库quota
         */
        public AllDatabaseQuotaResponse AllDatabaseQuotaEx(AllDatabaseQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseQuotaResponse>(DoRequest("1.0", "antcloud.cas.database.quota.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库quota
         * Summary: 查询数据库quota
         */
        public async Task<AllDatabaseQuotaResponse> AllDatabaseQuotaExAsync(AllDatabaseQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseQuotaResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.quota.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库所有securityip
         * Summary: 查询数据库所有securityip
         */
        public AllDatabaseSecurityipResponse AllDatabaseSecurityip(AllDatabaseSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDatabaseSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库所有securityip
         * Summary: 查询数据库所有securityip
         */
        public async Task<AllDatabaseSecurityipResponse> AllDatabaseSecurityipAsync(AllDatabaseSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDatabaseSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库所有securityip
         * Summary: 查询数据库所有securityip
         */
        public AllDatabaseSecurityipResponse AllDatabaseSecurityipEx(AllDatabaseSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseSecurityipResponse>(DoRequest("1.0", "antcloud.cas.database.securityip.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库所有securityip
         * Summary: 查询数据库所有securityip
         */
        public async Task<AllDatabaseSecurityipResponse> AllDatabaseSecurityipExAsync(AllDatabaseSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.securityip.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ！！！！不要用，typo
         * Summary: ！！！！不要用，typo
         */
        public QueryDatabaseSchemeResponse QueryDatabaseScheme(QueryDatabaseSchemeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseSchemeEx(request, headers, runtime);
        }

        /**
         * Description: ！！！！不要用，typo
         * Summary: ！！！！不要用，typo
         */
        public async Task<QueryDatabaseSchemeResponse> QueryDatabaseSchemeAsync(QueryDatabaseSchemeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseSchemeExAsync(request, headers, runtime);
        }

        /**
         * Description: ！！！！不要用，typo
         * Summary: ！！！！不要用，typo
         */
        public QueryDatabaseSchemeResponse QueryDatabaseSchemeEx(QueryDatabaseSchemeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSchemeResponse>(DoRequest("1.0", "antcloud.cas.database.scheme.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ！！！！不要用，typo
         * Summary: ！！！！不要用，typo
         */
        public async Task<QueryDatabaseSchemeResponse> QueryDatabaseSchemeExAsync(QueryDatabaseSchemeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSchemeResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.scheme.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数据库导入记录
         * Summary: 获取数据库导入记录
         */
        public AllDatabaseImportResponse AllDatabaseImport(AllDatabaseImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDatabaseImportEx(request, headers, runtime);
        }

        /**
         * Description: 获取数据库导入记录
         * Summary: 获取数据库导入记录
         */
        public async Task<AllDatabaseImportResponse> AllDatabaseImportAsync(AllDatabaseImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDatabaseImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取数据库导入记录
         * Summary: 获取数据库导入记录
         */
        public AllDatabaseImportResponse AllDatabaseImportEx(AllDatabaseImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseImportResponse>(DoRequest("1.0", "antcloud.cas.database.import.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数据库导入记录
         * Summary: 获取数据库导入记录
         */
        public async Task<AllDatabaseImportResponse> AllDatabaseImportExAsync(AllDatabaseImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDatabaseImportResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.import.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer agent状态
         * Summary: 查询computer agent状态
         */
        public QueryComputerAgentstatusResponse QueryComputerAgentstatus(QueryComputerAgentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerAgentstatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询computer agent状态
         * Summary: 查询computer agent状态
         */
        public async Task<QueryComputerAgentstatusResponse> QueryComputerAgentstatusAsync(QueryComputerAgentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerAgentstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询computer agent状态
         * Summary: 查询computer agent状态
         */
        public QueryComputerAgentstatusResponse QueryComputerAgentstatusEx(QueryComputerAgentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerAgentstatusResponse>(DoRequest("1.0", "antcloud.cas.computer.agentstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer agent状态
         * Summary: 查询computer agent状态
         */
        public async Task<QueryComputerAgentstatusResponse> QueryComputerAgentstatusExAsync(QueryComputerAgentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerAgentstatusResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.agentstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer staragent 启动命令
         * Summary: 查询 staragent 启动命令
         */
        public QueryComputerAgentsetupcommandResponse QueryComputerAgentsetupcommand(QueryComputerAgentsetupcommandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerAgentsetupcommandEx(request, headers, runtime);
        }

        /**
         * Description: 查询computer staragent 启动命令
         * Summary: 查询 staragent 启动命令
         */
        public async Task<QueryComputerAgentsetupcommandResponse> QueryComputerAgentsetupcommandAsync(QueryComputerAgentsetupcommandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerAgentsetupcommandExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询computer staragent 启动命令
         * Summary: 查询 staragent 启动命令
         */
        public QueryComputerAgentsetupcommandResponse QueryComputerAgentsetupcommandEx(QueryComputerAgentsetupcommandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerAgentsetupcommandResponse>(DoRequest("1.0", "antcloud.cas.computer.agentsetupcommand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer staragent 启动命令
         * Summary: 查询 staragent 启动命令
         */
        public async Task<QueryComputerAgentsetupcommandResponse> QueryComputerAgentsetupcommandExAsync(QueryComputerAgentsetupcommandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerAgentsetupcommandResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.agentsetupcommand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可以导入的computer信息
         * Summary: 查询可以导入的computer信息
         */
        public QueryComputerImportResponse QueryComputerImport(QueryComputerImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerImportEx(request, headers, runtime);
        }

        /**
         * Description: 查询可以导入的computer信息
         * Summary: 查询可以导入的computer信息
         */
        public async Task<QueryComputerImportResponse> QueryComputerImportAsync(QueryComputerImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可以导入的computer信息
         * Summary: 查询可以导入的computer信息
         */
        public QueryComputerImportResponse QueryComputerImportEx(QueryComputerImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerImportResponse>(DoRequest("1.0", "antcloud.cas.computer.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可以导入的computer信息
         * Summary: 查询可以导入的computer信息
         */
        public async Task<QueryComputerImportResponse> QueryComputerImportExAsync(QueryComputerImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerImportResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list computers
         * Summary: list computers
         */
        public ListComputerResponse ListComputer(ListComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListComputerEx(request, headers, runtime);
        }

        /**
         * Description: list computers
         * Summary: list computers
         */
        public async Task<ListComputerResponse> ListComputerAsync(ListComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: list computers
         * Summary: list computers
         */
        public ListComputerResponse ListComputerEx(ListComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list computers
         * Summary: list computers
         */
        public async Task<ListComputerResponse> ListComputerExAsync(ListComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query computer specs
         * Summary: query computer specs
         */
        public QueryComputerSpecResponse QueryComputerSpec(QueryComputerSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerSpecEx(request, headers, runtime);
        }

        /**
         * Description: query computer specs
         * Summary: query computer specs
         */
        public async Task<QueryComputerSpecResponse> QueryComputerSpecAsync(QueryComputerSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: query computer specs
         * Summary: query computer specs
         */
        public QueryComputerSpecResponse QueryComputerSpecEx(QueryComputerSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerSpecResponse>(DoRequest("1.0", "antcloud.cas.computer.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query computer specs
         * Summary: query computer specs
         */
        public async Task<QueryComputerSpecResponse> QueryComputerSpecExAsync(QueryComputerSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerSpecResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query computer common image
         * Summary: query common image
         */
        public QueryComputerCommonimageResponse QueryComputerCommonimage(QueryComputerCommonimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerCommonimageEx(request, headers, runtime);
        }

        /**
         * Description: query computer common image
         * Summary: query common image
         */
        public async Task<QueryComputerCommonimageResponse> QueryComputerCommonimageAsync(QueryComputerCommonimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerCommonimageExAsync(request, headers, runtime);
        }

        /**
         * Description: query computer common image
         * Summary: query common image
         */
        public QueryComputerCommonimageResponse QueryComputerCommonimageEx(QueryComputerCommonimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerCommonimageResponse>(DoRequest("1.0", "antcloud.cas.computer.commonimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query computer common image
         * Summary: query common image
         */
        public async Task<QueryComputerCommonimageResponse> QueryComputerCommonimageExAsync(QueryComputerCommonimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerCommonimageResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.commonimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有loadbalance
         * Summary: 获取所有loadbalance
         */
        public AllLoadbalanceResponse AllLoadbalance(AllLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有loadbalance
         * Summary: 获取所有loadbalance
         */
        public async Task<AllLoadbalanceResponse> AllLoadbalanceAsync(AllLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有loadbalance
         * Summary: 获取所有loadbalance
         */
        public AllLoadbalanceResponse AllLoadbalanceEx(AllLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有loadbalance
         * Summary: 获取所有loadbalance
         */
        public async Task<AllLoadbalanceResponse> AllLoadbalanceExAsync(AllLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询导入信息
         * Summary: 查询导入信息
         */
        public QueryLoadbalanceImportResponse QueryLoadbalanceImport(QueryLoadbalanceImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalanceImportEx(request, headers, runtime);
        }

        /**
         * Description: 查询导入信息
         * Summary: 查询导入信息
         */
        public async Task<QueryLoadbalanceImportResponse> QueryLoadbalanceImportAsync(QueryLoadbalanceImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalanceImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询导入信息
         * Summary: 查询导入信息
         */
        public QueryLoadbalanceImportResponse QueryLoadbalanceImportEx(QueryLoadbalanceImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceImportResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询导入信息
         * Summary: 查询导入信息
         */
        public async Task<QueryLoadbalanceImportResponse> QueryLoadbalanceImportExAsync(QueryLoadbalanceImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalanceImportResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库导入记录
         * Summary: 查询数据库导入记录
         */
        public QueryDatabaseImportResponse QueryDatabaseImport(QueryDatabaseImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseImportEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库导入记录
         * Summary: 查询数据库导入记录
         */
        public async Task<QueryDatabaseImportResponse> QueryDatabaseImportAsync(QueryDatabaseImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库导入记录
         * Summary: 查询数据库导入记录
         */
        public QueryDatabaseImportResponse QueryDatabaseImportEx(QueryDatabaseImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseImportResponse>(DoRequest("1.0", "antcloud.cas.database.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库导入记录
         * Summary: 查询数据库导入记录
         */
        public async Task<QueryDatabaseImportResponse> QueryDatabaseImportExAsync(QueryDatabaseImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseImportResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.import.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询masterzone
         * Summary: 查询masterzone
         */
        public QueryDatabaseMasterzoneResponse QueryDatabaseMasterzone(QueryDatabaseMasterzoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseMasterzoneEx(request, headers, runtime);
        }

        /**
         * Description: 查询masterzone
         * Summary: 查询masterzone
         */
        public async Task<QueryDatabaseMasterzoneResponse> QueryDatabaseMasterzoneAsync(QueryDatabaseMasterzoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseMasterzoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询masterzone
         * Summary: 查询masterzone
         */
        public QueryDatabaseMasterzoneResponse QueryDatabaseMasterzoneEx(QueryDatabaseMasterzoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseMasterzoneResponse>(DoRequest("1.0", "antcloud.cas.database.masterzone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询masterzone
         * Summary: 查询masterzone
         */
        public async Task<QueryDatabaseMasterzoneResponse> QueryDatabaseMasterzoneExAsync(QueryDatabaseMasterzoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseMasterzoneResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.masterzone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库额度
         * Summary: 查询数据库额度
         */
        public QueryDatabaseQuotaResponse QueryDatabaseQuota(QueryDatabaseQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseQuotaEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库额度
         * Summary: 查询数据库额度
         */
        public async Task<QueryDatabaseQuotaResponse> QueryDatabaseQuotaAsync(QueryDatabaseQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseQuotaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库额度
         * Summary: 查询数据库额度
         */
        public QueryDatabaseQuotaResponse QueryDatabaseQuotaEx(QueryDatabaseQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseQuotaResponse>(DoRequest("1.0", "antcloud.cas.database.quota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库额度
         * Summary: 查询数据库额度
         */
        public async Task<QueryDatabaseQuotaResponse> QueryDatabaseQuotaExAsync(QueryDatabaseQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseQuotaResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.quota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public QueryDatabaseSecurityipResponse QueryDatabaseSecurityip(QueryDatabaseSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public async Task<QueryDatabaseSecurityipResponse> QueryDatabaseSecurityipAsync(QueryDatabaseSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public QueryDatabaseSecurityipResponse QueryDatabaseSecurityipEx(QueryDatabaseSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSecurityipResponse>(DoRequest("1.0", "antcloud.cas.database.securityip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询securityip
         * Summary: 查询securityip
         */
        public async Task<QueryDatabaseSecurityipResponse> QueryDatabaseSecurityipExAsync(QueryDatabaseSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.securityip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前数据库的schema
         * Summary: 查询当前数据库的schema
         */
        public QueryDatabaseSchemaResponse QueryDatabaseSchema(QueryDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前数据库的schema
         * Summary: 查询当前数据库的schema
         */
        public async Task<QueryDatabaseSchemaResponse> QueryDatabaseSchemaAsync(QueryDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前数据库的schema
         * Summary: 查询当前数据库的schema
         */
        public QueryDatabaseSchemaResponse QueryDatabaseSchemaEx(QueryDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSchemaResponse>(DoRequest("1.0", "antcloud.cas.database.schema.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前数据库的schema
         * Summary: 查询当前数据库的schema
         */
        public async Task<QueryDatabaseSchemaResponse> QueryDatabaseSchemaExAsync(QueryDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseSchemaResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.schema.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库的账号
         * Summary: 查询数据库的账号
         */
        public QueryDatabaseAccountResponse QueryDatabaseAccount(QueryDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatabaseAccountEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据库的账号
         * Summary: 查询数据库的账号
         */
        public async Task<QueryDatabaseAccountResponse> QueryDatabaseAccountAsync(QueryDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatabaseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据库的账号
         * Summary: 查询数据库的账号
         */
        public QueryDatabaseAccountResponse QueryDatabaseAccountEx(QueryDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseAccountResponse>(DoRequest("1.0", "antcloud.cas.database.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据库的账号
         * Summary: 查询数据库的账号
         */
        public async Task<QueryDatabaseAccountResponse> QueryDatabaseAccountExAsync(QueryDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatabaseAccountResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace
         * Summary: 查询workspace
         */
        public GetWorkspaceResponse GetWorkspace(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询workspace
         * Summary: 查询workspace
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceAsync(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询workspace
         * Summary: 查询workspace
         */
        public GetWorkspaceResponse GetWorkspaceEx(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(DoRequest("1.0", "antcloud.cas.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace
         * Summary: 查询workspace
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceExAsync(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询region
         * Summary: 查询region
         */
        public ListRegionResponse ListRegion(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegionEx(request, headers, runtime);
        }

        /**
         * Description: 查询region
         * Summary: 查询region
         */
        public async Task<ListRegionResponse> ListRegionAsync(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询region
         * Summary: 查询region
         */
        public ListRegionResponse ListRegionEx(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(DoRequest("1.0", "antcloud.cas.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询region
         * Summary: 查询region
         */
        public async Task<ListRegionResponse> ListRegionExAsync(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(await DoRequestAsync("1.0", "antcloud.cas.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户可用region
         * Summary: 租户可用region
         */
        public ListRegionAccessibleResponse ListRegionAccessible(ListRegionAccessibleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegionAccessibleEx(request, headers, runtime);
        }

        /**
         * Description: 租户可用region
         * Summary: 租户可用region
         */
        public async Task<ListRegionAccessibleResponse> ListRegionAccessibleAsync(ListRegionAccessibleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegionAccessibleExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户可用region
         * Summary: 租户可用region
         */
        public ListRegionAccessibleResponse ListRegionAccessibleEx(ListRegionAccessibleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionAccessibleResponse>(DoRequest("1.0", "antcloud.cas.region.accessible.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户可用region
         * Summary: 租户可用region
         */
        public async Task<ListRegionAccessibleResponse> ListRegionAccessibleExAsync(ListRegionAccessibleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionAccessibleResponse>(await DoRequestAsync("1.0", "antcloud.cas.region.accessible.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新基本信息
         * Summary: 更新基本信息
         */
        public UpdateDatabaseInfoResponse UpdateDatabaseInfo(UpdateDatabaseInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDatabaseInfoEx(request, headers, runtime);
        }

        /**
         * Description: 更新基本信息
         * Summary: 更新基本信息
         */
        public async Task<UpdateDatabaseInfoResponse> UpdateDatabaseInfoAsync(UpdateDatabaseInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDatabaseInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新基本信息
         * Summary: 更新基本信息
         */
        public UpdateDatabaseInfoResponse UpdateDatabaseInfoEx(UpdateDatabaseInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseInfoResponse>(DoRequest("1.0", "antcloud.cas.database.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新基本信息
         * Summary: 更新基本信息
         */
        public async Task<UpdateDatabaseInfoResponse> UpdateDatabaseInfoExAsync(UpdateDatabaseInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseInfoResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 把数据库分配给应用
         * Summary: 把数据库分配给应用
         */
        public SetDatabaseAssignResponse SetDatabaseAssign(SetDatabaseAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetDatabaseAssignEx(request, headers, runtime);
        }

        /**
         * Description: 把数据库分配给应用
         * Summary: 把数据库分配给应用
         */
        public async Task<SetDatabaseAssignResponse> SetDatabaseAssignAsync(SetDatabaseAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetDatabaseAssignExAsync(request, headers, runtime);
        }

        /**
         * Description: 把数据库分配给应用
         * Summary: 把数据库分配给应用
         */
        public SetDatabaseAssignResponse SetDatabaseAssignEx(SetDatabaseAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseAssignResponse>(DoRequest("1.0", "antcloud.cas.database.assign.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 把数据库分配给应用
         * Summary: 把数据库分配给应用
         */
        public async Task<SetDatabaseAssignResponse> SetDatabaseAssignExAsync(SetDatabaseAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseAssignResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.assign.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享数据库给其他workspace
         * Summary: 共享数据库给其他workspace
         */
        public SetDatabaseShareResponse SetDatabaseShare(SetDatabaseShareRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetDatabaseShareEx(request, headers, runtime);
        }

        /**
         * Description: 共享数据库给其他workspace
         * Summary: 共享数据库给其他workspace
         */
        public async Task<SetDatabaseShareResponse> SetDatabaseShareAsync(SetDatabaseShareRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetDatabaseShareExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享数据库给其他workspace
         * Summary: 共享数据库给其他workspace
         */
        public SetDatabaseShareResponse SetDatabaseShareEx(SetDatabaseShareRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseShareResponse>(DoRequest("1.0", "antcloud.cas.database.share.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享数据库给其他workspace
         * Summary: 共享数据库给其他workspace
         */
        public async Task<SetDatabaseShareResponse> SetDatabaseShareExAsync(SetDatabaseShareRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseShareResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.share.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启数据库
         * Summary: 重启数据库
         */
        public RebootDatabaseResponse RebootDatabase(RebootDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RebootDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: 重启数据库
         * Summary: 重启数据库
         */
        public async Task<RebootDatabaseResponse> RebootDatabaseAsync(RebootDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RebootDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 重启数据库
         * Summary: 重启数据库
         */
        public RebootDatabaseResponse RebootDatabaseEx(RebootDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启数据库
         * Summary: 重启数据库
         */
        public async Task<RebootDatabaseResponse> RebootDatabaseExAsync(RebootDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新账户信息
         * Summary: 更新账户信息
         */
        public UpdateDatabaseAccountResponse UpdateDatabaseAccount(UpdateDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDatabaseAccountEx(request, headers, runtime);
        }

        /**
         * Description: 更新账户信息
         * Summary: 更新账户信息
         */
        public async Task<UpdateDatabaseAccountResponse> UpdateDatabaseAccountAsync(UpdateDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDatabaseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新账户信息
         * Summary: 更新账户信息
         */
        public UpdateDatabaseAccountResponse UpdateDatabaseAccountEx(UpdateDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseAccountResponse>(DoRequest("1.0", "antcloud.cas.database.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新账户信息
         * Summary: 更新账户信息
         */
        public async Task<UpdateDatabaseAccountResponse> UpdateDatabaseAccountExAsync(UpdateDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseAccountResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重设databaseaccount密码
         * Summary: 重设databaseaccount密码
         */
        public SetDatabaseAccountpasswordResponse SetDatabaseAccountpassword(SetDatabaseAccountpasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetDatabaseAccountpasswordEx(request, headers, runtime);
        }

        /**
         * Description: 重设databaseaccount密码
         * Summary: 重设databaseaccount密码
         */
        public async Task<SetDatabaseAccountpasswordResponse> SetDatabaseAccountpasswordAsync(SetDatabaseAccountpasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetDatabaseAccountpasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 重设databaseaccount密码
         * Summary: 重设databaseaccount密码
         */
        public SetDatabaseAccountpasswordResponse SetDatabaseAccountpasswordEx(SetDatabaseAccountpasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseAccountpasswordResponse>(DoRequest("1.0", "antcloud.cas.database.accountpassword.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重设databaseaccount密码
         * Summary: 重设databaseaccount密码
         */
        public async Task<SetDatabaseAccountpasswordResponse> SetDatabaseAccountpasswordExAsync(SetDatabaseAccountpasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDatabaseAccountpasswordResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.accountpassword.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据库账户授权schema
         * Summary: 数据库账户授权schema
         */
        public AuthDatabaseAccountResponse AuthDatabaseAccount(AuthDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthDatabaseAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数据库账户授权schema
         * Summary: 数据库账户授权schema
         */
        public async Task<AuthDatabaseAccountResponse> AuthDatabaseAccountAsync(AuthDatabaseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthDatabaseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据库账户授权schema
         * Summary: 数据库账户授权schema
         */
        public AuthDatabaseAccountResponse AuthDatabaseAccountEx(AuthDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDatabaseAccountResponse>(DoRequest("1.0", "antcloud.cas.database.account.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据库账户授权schema
         * Summary: 数据库账户授权schema
         */
        public async Task<AuthDatabaseAccountResponse> AuthDatabaseAccountExAsync(AuthDatabaseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthDatabaseAccountResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.account.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询tenantRegion
         * Summary: 查询tenantRegion
         */
        public GetRegionTenantResponse GetRegionTenant(GetRegionTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRegionTenantEx(request, headers, runtime);
        }

        /**
         * Description: 查询tenantRegion
         * Summary: 查询tenantRegion
         */
        public async Task<GetRegionTenantResponse> GetRegionTenantAsync(GetRegionTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRegionTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询tenantRegion
         * Summary: 查询tenantRegion
         */
        public GetRegionTenantResponse GetRegionTenantEx(GetRegionTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegionTenantResponse>(DoRequest("1.0", "antcloud.cas.region.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询tenantRegion
         * Summary: 查询tenantRegion
         */
        public async Task<GetRegionTenantResponse> GetRegionTenantExAsync(GetRegionTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegionTenantResponse>(await DoRequestAsync("1.0", "antcloud.cas.region.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getRegionAliasById
         * Summary: getRegionAliasById
         */
        public GetRegionAliasbyidResponse GetRegionAliasbyid(GetRegionAliasbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRegionAliasbyidEx(request, headers, runtime);
        }

        /**
         * Description: getRegionAliasById
         * Summary: getRegionAliasById
         */
        public async Task<GetRegionAliasbyidResponse> GetRegionAliasbyidAsync(GetRegionAliasbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRegionAliasbyidExAsync(request, headers, runtime);
        }

        /**
         * Description: getRegionAliasById
         * Summary: getRegionAliasById
         */
        public GetRegionAliasbyidResponse GetRegionAliasbyidEx(GetRegionAliasbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegionAliasbyidResponse>(DoRequest("1.0", "antcloud.cas.region.aliasbyid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getRegionAliasById
         * Summary: getRegionAliasById
         */
        public async Task<GetRegionAliasbyidResponse> GetRegionAliasbyidExAsync(GetRegionAliasbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegionAliasbyidResponse>(await DoRequestAsync("1.0", "antcloud.cas.region.aliasbyid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询disk信息
         * Summary: 查询disk信息
         */
        public QueryDiskResponse QueryDisk(QueryDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDiskEx(request, headers, runtime);
        }

        /**
         * Description: 查询disk信息
         * Summary: 查询disk信息
         */
        public async Task<QueryDiskResponse> QueryDiskAsync(QueryDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询disk信息
         * Summary: 查询disk信息
         */
        public QueryDiskResponse QueryDiskEx(QueryDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDiskResponse>(DoRequest("1.0", "antcloud.cas.disk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询disk信息
         * Summary: 查询disk信息
         */
        public async Task<QueryDiskResponse> QueryDiskExAsync(QueryDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDiskResponse>(await DoRequestAsync("1.0", "antcloud.cas.disk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer image信息
         * Summary: 查询computer image信息
         */
        public QueryImageResponse QueryImage(QueryImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImageEx(request, headers, runtime);
        }

        /**
         * Description: 查询computer image信息
         * Summary: 查询computer image信息
         */
        public async Task<QueryImageResponse> QueryImageAsync(QueryImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询computer image信息
         * Summary: 查询computer image信息
         */
        public QueryImageResponse QueryImageEx(QueryImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageResponse>(DoRequest("1.0", "antcloud.cas.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer image信息
         * Summary: 查询computer image信息
         */
        public async Task<QueryImageResponse> QueryImageExAsync(QueryImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImageResponse>(await DoRequestAsync("1.0", "antcloud.cas.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据库schema
         * Summary: 创建数据库schema
         */
        public CreateDatabaseSchemaResponse CreateDatabaseSchema(CreateDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDatabaseSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 创建数据库schema
         * Summary: 创建数据库schema
         */
        public async Task<CreateDatabaseSchemaResponse> CreateDatabaseSchemaAsync(CreateDatabaseSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDatabaseSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数据库schema
         * Summary: 创建数据库schema
         */
        public CreateDatabaseSchemaResponse CreateDatabaseSchemaEx(CreateDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseSchemaResponse>(DoRequest("1.0", "antcloud.cas.database.schema.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据库schema
         * Summary: 创建数据库schema
         */
        public async Task<CreateDatabaseSchemaResponse> CreateDatabaseSchemaExAsync(CreateDatabaseSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDatabaseSchemaResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.schema.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LB挂载后端主机
         * Summary: LB挂载后端主机
         */
        public CreateLoadbalanceMountResponse CreateLoadbalanceMount(CreateLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLoadbalanceMountEx(request, headers, runtime);
        }

        /**
         * Description: LB挂载后端主机
         * Summary: LB挂载后端主机
         */
        public async Task<CreateLoadbalanceMountResponse> CreateLoadbalanceMountAsync(CreateLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLoadbalanceMountExAsync(request, headers, runtime);
        }

        /**
         * Description: LB挂载后端主机
         * Summary: LB挂载后端主机
         */
        public CreateLoadbalanceMountResponse CreateLoadbalanceMountEx(CreateLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceMountResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.mount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LB挂载后端主机
         * Summary: LB挂载后端主机
         */
        public async Task<CreateLoadbalanceMountResponse> CreateLoadbalanceMountExAsync(CreateLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceMountResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.mount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建监听器
         * Summary: 创建监听器
         */
        public CreateLoadbalanceListenerResponse CreateLoadbalanceListener(CreateLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 创建监听器
         * Summary: 创建监听器
         */
        public async Task<CreateLoadbalanceListenerResponse> CreateLoadbalanceListenerAsync(CreateLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建监听器
         * Summary: 创建监听器
         */
        public CreateLoadbalanceListenerResponse CreateLoadbalanceListenerEx(CreateLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建监听器
         * Summary: 创建监听器
         */
        public async Task<CreateLoadbalanceListenerResponse> CreateLoadbalanceListenerExAsync(CreateLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止监听器
         * Summary: 停止监听器
         */
        public StopLoadbalanceListenerResponse StopLoadbalanceListener(StopLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 停止监听器
         * Summary: 停止监听器
         */
        public async Task<StopLoadbalanceListenerResponse> StopLoadbalanceListenerAsync(StopLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止监听器
         * Summary: 停止监听器
         */
        public StopLoadbalanceListenerResponse StopLoadbalanceListenerEx(StopLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止监听器
         * Summary: 停止监听器
         */
        public async Task<StopLoadbalanceListenerResponse> StopLoadbalanceListenerExAsync(StopLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动lb
         * Summary: 启动lb
         */
        public StartLoadbalanceListenerResponse StartLoadbalanceListener(StartLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 启动lb
         * Summary: 启动lb
         */
        public async Task<StartLoadbalanceListenerResponse> StartLoadbalanceListenerAsync(StartLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动lb
         * Summary: 启动lb
         */
        public StartLoadbalanceListenerResponse StartLoadbalanceListenerEx(StartLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动lb
         * Summary: 启动lb
         */
        public async Task<StartLoadbalanceListenerResponse> StartLoadbalanceListenerExAsync(StartLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新listener配置
         * Summary: 更新listener配置
         */
        public UpdateLoadbalanceListenerResponse UpdateLoadbalanceListener(UpdateLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceListenerEx(request, headers, runtime);
        }

        /**
         * Description: 更新listener配置
         * Summary: 更新listener配置
         */
        public async Task<UpdateLoadbalanceListenerResponse> UpdateLoadbalanceListenerAsync(UpdateLoadbalanceListenerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceListenerExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新listener配置
         * Summary: 更新listener配置
         */
        public UpdateLoadbalanceListenerResponse UpdateLoadbalanceListenerEx(UpdateLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceListenerResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.listener.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新listener配置
         * Summary: 更新listener配置
         */
        public async Task<UpdateLoadbalanceListenerResponse> UpdateLoadbalanceListenerExAsync(UpdateLoadbalanceListenerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceListenerResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.listener.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询disk spec信息
         * Summary: 查询disk spec信息
         */
        public QueryDiskspecResponse QueryDiskspec(QueryDiskspecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDiskspecEx(request, headers, runtime);
        }

        /**
         * Description: 查询disk spec信息
         * Summary: 查询disk spec信息
         */
        public async Task<QueryDiskspecResponse> QueryDiskspecAsync(QueryDiskspecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDiskspecExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询disk spec信息
         * Summary: 查询disk spec信息
         */
        public QueryDiskspecResponse QueryDiskspecEx(QueryDiskspecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDiskspecResponse>(DoRequest("1.0", "antcloud.cas.diskspec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询disk spec信息
         * Summary: 查询disk spec信息
         */
        public async Task<QueryDiskspecResponse> QueryDiskspecExAsync(QueryDiskspecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDiskspecResponse>(await DoRequestAsync("1.0", "antcloud.cas.diskspec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer quota
         * Summary: 查询computer quota
         */
        public QueryComputerquotaResponse QueryComputerquota(QueryComputerquotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerquotaEx(request, headers, runtime);
        }

        /**
         * Description: 查询computer quota
         * Summary: 查询computer quota
         */
        public async Task<QueryComputerquotaResponse> QueryComputerquotaAsync(QueryComputerquotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerquotaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询computer quota
         * Summary: 查询computer quota
         */
        public QueryComputerquotaResponse QueryComputerquotaEx(QueryComputerquotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerquotaResponse>(DoRequest("1.0", "antcloud.cas.computerquota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer quota
         * Summary: 查询computer quota
         */
        public async Task<QueryComputerquotaResponse> QueryComputerquotaExAsync(QueryComputerquotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerquotaResponse>(await DoRequestAsync("1.0", "antcloud.cas.computerquota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止computer
         * Summary: 停止computer
         */
        public StopComputerResponse StopComputer(StopComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopComputerEx(request, headers, runtime);
        }

        /**
         * Description: 停止computer
         * Summary: 停止computer
         */
        public async Task<StopComputerResponse> StopComputerAsync(StopComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止computer
         * Summary: 停止computer
         */
        public StopComputerResponse StopComputerEx(StopComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止computer
         * Summary: 停止computer
         */
        public async Task<StopComputerResponse> StopComputerExAsync(StopComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启computer
         * Summary: 重启computer
         */
        public RebootComputerResponse RebootComputer(RebootComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RebootComputerEx(request, headers, runtime);
        }

        /**
         * Description: 重启computer
         * Summary: 重启computer
         */
        public async Task<RebootComputerResponse> RebootComputerAsync(RebootComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RebootComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 重启computer
         * Summary: 重启computer
         */
        public RebootComputerResponse RebootComputerEx(RebootComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启computer
         * Summary: 重启computer
         */
        public async Task<RebootComputerResponse> RebootComputerExAsync(RebootComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer所属安全组
         * Summary: 查询computer所属安全组
         */
        public QueryComputerSecuritygroupResponse QueryComputerSecuritygroup(QueryComputerSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerSecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询computer所属安全组
         * Summary: 查询computer所属安全组
         */
        public async Task<QueryComputerSecuritygroupResponse> QueryComputerSecuritygroupAsync(QueryComputerSecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerSecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询computer所属安全组
         * Summary: 查询computer所属安全组
         */
        public QueryComputerSecuritygroupResponse QueryComputerSecuritygroupEx(QueryComputerSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerSecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.computer.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询computer所属安全组
         * Summary: 查询computer所属安全组
         */
        public async Task<QueryComputerSecuritygroupResponse> QueryComputerSecuritygroupExAsync(QueryComputerSecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerSecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询安全组信息
         * Summary: 查询安全组信息
         */
        public QuerySecuritygroupResponse QuerySecuritygroup(QuerySecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySecuritygroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询安全组信息
         * Summary: 查询安全组信息
         */
        public async Task<QuerySecuritygroupResponse> QuerySecuritygroupAsync(QuerySecuritygroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySecuritygroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询安全组信息
         * Summary: 查询安全组信息
         */
        public QuerySecuritygroupResponse QuerySecuritygroupEx(QuerySecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritygroupResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询安全组信息
         * Summary: 查询安全组信息
         */
        public async Task<QuerySecuritygroupResponse> QuerySecuritygroupExAsync(QuerySecuritygroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritygroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建安全组规则
         * Summary: 创建安全组规则
         */
        public CreateSecuritygroupPermissionResponse CreateSecuritygroupPermission(CreateSecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSecuritygroupPermissionEx(request, headers, runtime);
        }

        /**
         * Description: 创建安全组规则
         * Summary: 创建安全组规则
         */
        public async Task<CreateSecuritygroupPermissionResponse> CreateSecuritygroupPermissionAsync(CreateSecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSecuritygroupPermissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建安全组规则
         * Summary: 创建安全组规则
         */
        public CreateSecuritygroupPermissionResponse CreateSecuritygroupPermissionEx(CreateSecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSecuritygroupPermissionResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.permission.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建安全组规则
         * Summary: 创建安全组规则
         */
        public async Task<CreateSecuritygroupPermissionResponse> CreateSecuritygroupPermissionExAsync(CreateSecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSecuritygroupPermissionResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.permission.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询安全组规则信息
         * Summary: 查询安全组规则信息
         */
        public QuerySecuritygroupPermissionResponse QuerySecuritygroupPermission(QuerySecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySecuritygroupPermissionEx(request, headers, runtime);
        }

        /**
         * Description: 查询安全组规则信息
         * Summary: 查询安全组规则信息
         */
        public async Task<QuerySecuritygroupPermissionResponse> QuerySecuritygroupPermissionAsync(QuerySecuritygroupPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySecuritygroupPermissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询安全组规则信息
         * Summary: 查询安全组规则信息
         */
        public QuerySecuritygroupPermissionResponse QuerySecuritygroupPermissionEx(QuerySecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritygroupPermissionResponse>(DoRequest("1.0", "antcloud.cas.securitygroup.permission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询安全组规则信息
         * Summary: 查询安全组规则信息
         */
        public async Task<QuerySecuritygroupPermissionResponse> QuerySecuritygroupPermissionExAsync(QuerySecuritygroupPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySecuritygroupPermissionResponse>(await DoRequestAsync("1.0", "antcloud.cas.securitygroup.permission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新监听器的安全控制
         * Summary: 更新监听器的安全控制
         */
        public UpdateLoadbalanaceSecurityipResponse UpdateLoadbalanaceSecurityip(UpdateLoadbalanaceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanaceSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: 更新监听器的安全控制
         * Summary: 更新监听器的安全控制
         */
        public async Task<UpdateLoadbalanaceSecurityipResponse> UpdateLoadbalanaceSecurityipAsync(UpdateLoadbalanaceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanaceSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新监听器的安全控制
         * Summary: 更新监听器的安全控制
         */
        public UpdateLoadbalanaceSecurityipResponse UpdateLoadbalanaceSecurityipEx(UpdateLoadbalanaceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanaceSecurityipResponse>(DoRequest("1.0", "antcloud.cas.loadbalanace.securityip.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新监听器的安全控制
         * Summary: 更新监听器的安全控制
         */
        public async Task<UpdateLoadbalanaceSecurityipResponse> UpdateLoadbalanaceSecurityipExAsync(UpdateLoadbalanaceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanaceSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalanace.securityip.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建lb监听器的安全控制
         * Summary: 创建lb监听器的安全控制
         */
        public CreateLoadbalanceSecurityipResponse CreateLoadbalanceSecurityip(CreateLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLoadbalanceSecurityipEx(request, headers, runtime);
        }

        /**
         * Description: 创建lb监听器的安全控制
         * Summary: 创建lb监听器的安全控制
         */
        public async Task<CreateLoadbalanceSecurityipResponse> CreateLoadbalanceSecurityipAsync(CreateLoadbalanceSecurityipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLoadbalanceSecurityipExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建lb监听器的安全控制
         * Summary: 创建lb监听器的安全控制
         */
        public CreateLoadbalanceSecurityipResponse CreateLoadbalanceSecurityipEx(CreateLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceSecurityipResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.securityip.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建lb监听器的安全控制
         * Summary: 创建lb监听器的安全控制
         */
        public async Task<CreateLoadbalanceSecurityipResponse> CreateLoadbalanceSecurityipExAsync(CreateLoadbalanceSecurityipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceSecurityipResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.securityip.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑数据库的基本属性
         * Summary: 编辑数据库的基本属性
         */
        public UpdateDatabaseResponse UpdateDatabase(UpdateDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: 编辑数据库的基本属性
         * Summary: 编辑数据库的基本属性
         */
        public async Task<UpdateDatabaseResponse> UpdateDatabaseAsync(UpdateDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑数据库的基本属性
         * Summary: 编辑数据库的基本属性
         */
        public UpdateDatabaseResponse UpdateDatabaseEx(UpdateDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseResponse>(DoRequest("1.0", "antcloud.cas.database.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑数据库的基本属性
         * Summary: 编辑数据库的基本属性
         */
        public async Task<UpdateDatabaseResponse> UpdateDatabaseExAsync(UpdateDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.cas.database.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新后端权重
         * Summary: 更新后端权重
         */
        public UpdateLoadbalanceMountResponse UpdateLoadbalanceMount(UpdateLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceMountEx(request, headers, runtime);
        }

        /**
         * Description: 更新后端权重
         * Summary: 更新后端权重
         */
        public async Task<UpdateLoadbalanceMountResponse> UpdateLoadbalanceMountAsync(UpdateLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceMountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新后端权重
         * Summary: 更新后端权重
         */
        public UpdateLoadbalanceMountResponse UpdateLoadbalanceMountEx(UpdateLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceMountResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.mount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新后端权重
         * Summary: 更新后端权重
         */
        public async Task<UpdateLoadbalanceMountResponse> UpdateLoadbalanceMountExAsync(UpdateLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceMountResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.mount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除LB后端挂载主机
         * Summary: 删除LB后端挂载主机
         */
        public DeleteLoadbalanceMountResponse DeleteLoadbalanceMount(DeleteLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteLoadbalanceMountEx(request, headers, runtime);
        }

        /**
         * Description: 删除LB后端挂载主机
         * Summary: 删除LB后端挂载主机
         */
        public async Task<DeleteLoadbalanceMountResponse> DeleteLoadbalanceMountAsync(DeleteLoadbalanceMountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteLoadbalanceMountExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除LB后端挂载主机
         * Summary: 删除LB后端挂载主机
         */
        public DeleteLoadbalanceMountResponse DeleteLoadbalanceMountEx(DeleteLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceMountResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.mount.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除LB后端挂载主机
         * Summary: 删除LB后端挂载主机
         */
        public async Task<DeleteLoadbalanceMountResponse> DeleteLoadbalanceMountExAsync(DeleteLoadbalanceMountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceMountResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.mount.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务记录
         * Summary: 查询任务记录
         */
        public QueryRequestResponse QueryRequest(QueryRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRequestEx(request, headers, runtime);
        }

        /**
         * Description: 查询任务记录
         * Summary: 查询任务记录
         */
        public async Task<QueryRequestResponse> QueryRequestAsync(QueryRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRequestExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询任务记录
         * Summary: 查询任务记录
         */
        public QueryRequestResponse QueryRequestEx(QueryRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestResponse>(DoRequest("1.0", "antcloud.cas.request.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务记录
         * Summary: 查询任务记录
         */
        public async Task<QueryRequestResponse> QueryRequestExAsync(QueryRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestResponse>(await DoRequestAsync("1.0", "antcloud.cas.request.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个request
         * Summary: 获取单个request
         */
        public GetRequestResponse GetRequest(GetRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRequestEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个request
         * Summary: 获取单个request
         */
        public async Task<GetRequestResponse> GetRequestAsync(GetRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRequestExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个request
         * Summary: 获取单个request
         */
        public GetRequestResponse GetRequestEx(GetRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRequestResponse>(DoRequest("1.0", "antcloud.cas.request.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个request
         * Summary: 获取单个request
         */
        public async Task<GetRequestResponse> GetRequestExAsync(GetRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRequestResponse>(await DoRequestAsync("1.0", "antcloud.cas.request.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询task
         * Summary: 查询task
         */
        public QueryRequestTaskResponse QueryRequestTask(QueryRequestTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRequestTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询task
         * Summary: 查询task
         */
        public async Task<QueryRequestTaskResponse> QueryRequestTaskAsync(QueryRequestTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRequestTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询task
         * Summary: 查询task
         */
        public QueryRequestTaskResponse QueryRequestTaskEx(QueryRequestTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestTaskResponse>(DoRequest("1.0", "antcloud.cas.request.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询task
         * Summary: 查询task
         */
        public async Task<QueryRequestTaskResponse> QueryRequestTaskExAsync(QueryRequestTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestTaskResponse>(await DoRequestAsync("1.0", "antcloud.cas.request.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务日志
         * Summary: 查询任务日志
         */
        public QueryTaskLogResponse QueryTaskLog(QueryTaskLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTaskLogEx(request, headers, runtime);
        }

        /**
         * Description: 查询任务日志
         * Summary: 查询任务日志
         */
        public async Task<QueryTaskLogResponse> QueryTaskLogAsync(QueryTaskLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTaskLogExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询任务日志
         * Summary: 查询任务日志
         */
        public QueryTaskLogResponse QueryTaskLogEx(QueryTaskLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTaskLogResponse>(DoRequest("1.0", "antcloud.cas.task.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务日志
         * Summary: 查询任务日志
         */
        public async Task<QueryTaskLogResponse> QueryTaskLogExAsync(QueryTaskLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTaskLogResponse>(await DoRequestAsync("1.0", "antcloud.cas.task.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
         * Summary: 列出 tenant workspace
         */
        public ListTenantworkspaceResponse ListTenantworkspace(ListTenantworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTenantworkspaceEx(request, headers, runtime);
        }

        /**
         * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
         * Summary: 列出 tenant workspace
         */
        public async Task<ListTenantworkspaceResponse> ListTenantworkspaceAsync(ListTenantworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTenantworkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
         * Summary: 列出 tenant workspace
         */
        public ListTenantworkspaceResponse ListTenantworkspaceEx(ListTenantworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTenantworkspaceResponse>(DoRequest("1.0", "antcloud.cas.tenantworkspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
         * Summary: 列出 tenant workspace
         */
        public async Task<ListTenantworkspaceResponse> ListTenantworkspaceExAsync(ListTenantworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTenantworkspaceResponse>(await DoRequestAsync("1.0", "antcloud.cas.tenantworkspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
         * Summary: 环境filterStatus
         */
        public QueryTenantworkspaceFilterResponse QueryTenantworkspaceFilter(QueryTenantworkspaceFilterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantworkspaceFilterEx(request, headers, runtime);
        }

        /**
         * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
         * Summary: 环境filterStatus
         */
        public async Task<QueryTenantworkspaceFilterResponse> QueryTenantworkspaceFilterAsync(QueryTenantworkspaceFilterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantworkspaceFilterExAsync(request, headers, runtime);
        }

        /**
         * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
         * Summary: 环境filterStatus
         */
        public QueryTenantworkspaceFilterResponse QueryTenantworkspaceFilterEx(QueryTenantworkspaceFilterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantworkspaceFilterResponse>(DoRequest("1.0", "antcloud.cas.tenantworkspace.filter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
         * Summary: 环境filterStatus
         */
        public async Task<QueryTenantworkspaceFilterResponse> QueryTenantworkspaceFilterExAsync(QueryTenantworkspaceFilterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantworkspaceFilterResponse>(await DoRequestAsync("1.0", "antcloud.cas.tenantworkspace.filter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: group by region列表
         * Summary: group by region列表
         */
        public ListRegionGroupbyResponse ListRegionGroupby(ListRegionGroupbyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegionGroupbyEx(request, headers, runtime);
        }

        /**
         * Description: group by region列表
         * Summary: group by region列表
         */
        public async Task<ListRegionGroupbyResponse> ListRegionGroupbyAsync(ListRegionGroupbyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegionGroupbyExAsync(request, headers, runtime);
        }

        /**
         * Description: group by region列表
         * Summary: group by region列表
         */
        public ListRegionGroupbyResponse ListRegionGroupbyEx(ListRegionGroupbyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionGroupbyResponse>(DoRequest("1.0", "antcloud.cas.region.groupby.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: group by region列表
         * Summary: group by region列表
         */
        public async Task<ListRegionGroupbyResponse> ListRegionGroupbyExAsync(ListRegionGroupbyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionGroupbyResponse>(await DoRequestAsync("1.0", "antcloud.cas.region.groupby.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务最后的步骤
         * Summary: 查询任务最后的步骤
         */
        public QueryRequestFinaltaskResponse QueryRequestFinaltask(QueryRequestFinaltaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRequestFinaltaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询任务最后的步骤
         * Summary: 查询任务最后的步骤
         */
        public async Task<QueryRequestFinaltaskResponse> QueryRequestFinaltaskAsync(QueryRequestFinaltaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRequestFinaltaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询任务最后的步骤
         * Summary: 查询任务最后的步骤
         */
        public QueryRequestFinaltaskResponse QueryRequestFinaltaskEx(QueryRequestFinaltaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestFinaltaskResponse>(DoRequest("1.0", "antcloud.cas.request.finaltask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务最后的步骤
         * Summary: 查询任务最后的步骤
         */
        public async Task<QueryRequestFinaltaskResponse> QueryRequestFinaltaskExAsync(QueryRequestFinaltaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRequestFinaltaskResponse>(await DoRequestAsync("1.0", "antcloud.cas.request.finaltask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前支持的功能
         * Summary: 查询当前支持的功能
         */
        public QueryFeatureResponse QueryFeature(QueryFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFeatureEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前支持的功能
         * Summary: 查询当前支持的功能
         */
        public async Task<QueryFeatureResponse> QueryFeatureAsync(QueryFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFeatureExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前支持的功能
         * Summary: 查询当前支持的功能
         */
        public QueryFeatureResponse QueryFeatureEx(QueryFeatureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFeatureResponse>(DoRequest("1.0", "antcloud.cas.feature.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前支持的功能
         * Summary: 查询当前支持的功能
         */
        public async Task<QueryFeatureResponse> QueryFeatureExAsync(QueryFeatureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFeatureResponse>(await DoRequestAsync("1.0", "antcloud.cas.feature.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: start computer
         * Summary: start computer
         */
        public StartComputerResponse StartComputer(StartComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartComputerEx(request, headers, runtime);
        }

        /**
         * Description: start computer
         * Summary: start computer
         */
        public async Task<StartComputerResponse> StartComputerAsync(StartComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: start computer
         * Summary: start computer
         */
        public StartComputerResponse StartComputerEx(StartComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: start computer
         * Summary: start computer
         */
        public async Task<StartComputerResponse> StartComputerExAsync(StartComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启lb
         * Summary: 开启lb
         */
        public StartLoadbalanceResponse StartLoadbalance(StartLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 开启lb
         * Summary: 开启lb
         */
        public async Task<StartLoadbalanceResponse> StartLoadbalanceAsync(StartLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启lb
         * Summary: 开启lb
         */
        public StartLoadbalanceResponse StartLoadbalanceEx(StartLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启lb
         * Summary: 开启lb
         */
        public async Task<StartLoadbalanceResponse> StartLoadbalanceExAsync(StartLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止lb
         * Summary: 停止lb
         */
        public StopLoadbalanceResponse StopLoadbalance(StopLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 停止lb
         * Summary: 停止lb
         */
        public async Task<StopLoadbalanceResponse> StopLoadbalanceAsync(StopLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止lb
         * Summary: 停止lb
         */
        public StopLoadbalanceResponse StopLoadbalanceEx(StopLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止lb
         * Summary: 停止lb
         */
        public async Task<StopLoadbalanceResponse> StopLoadbalanceExAsync(StopLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新lb信息
         * Summary: 更新lb信息
         */
        public UpdateLoadbalanceResponse UpdateLoadbalance(UpdateLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 更新lb信息
         * Summary: 更新lb信息
         */
        public async Task<UpdateLoadbalanceResponse> UpdateLoadbalanceAsync(UpdateLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新lb信息
         * Summary: 更新lb信息
         */
        public UpdateLoadbalanceResponse UpdateLoadbalanceEx(UpdateLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新lb信息
         * Summary: 更新lb信息
         */
        public async Task<UpdateLoadbalanceResponse> UpdateLoadbalanceExAsync(UpdateLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 把LB分配给应用
         * Summary: 把LB分配给应用
         */
        public AddLoadbalanceAssignResponse AddLoadbalanceAssign(AddLoadbalanceAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddLoadbalanceAssignEx(request, headers, runtime);
        }

        /**
         * Description: 把LB分配给应用
         * Summary: 把LB分配给应用
         */
        public async Task<AddLoadbalanceAssignResponse> AddLoadbalanceAssignAsync(AddLoadbalanceAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddLoadbalanceAssignExAsync(request, headers, runtime);
        }

        /**
         * Description: 把LB分配给应用
         * Summary: 把LB分配给应用
         */
        public AddLoadbalanceAssignResponse AddLoadbalanceAssignEx(AddLoadbalanceAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLoadbalanceAssignResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.assign.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 把LB分配给应用
         * Summary: 把LB分配给应用
         */
        public async Task<AddLoadbalanceAssignResponse> AddLoadbalanceAssignExAsync(AddLoadbalanceAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLoadbalanceAssignResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.assign.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书查询
         * Summary: 证书查询
         */
        public QueryCertificateResponse QueryCertificate(QueryCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 证书查询
         * Summary: 证书查询
         */
        public async Task<QueryCertificateResponse> QueryCertificateAsync(QueryCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 证书查询
         * Summary: 证书查询
         */
        public QueryCertificateResponse QueryCertificateEx(QueryCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertificateResponse>(DoRequest("1.0", "antcloud.cas.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证书查询
         * Summary: 证书查询
         */
        public async Task<QueryCertificateResponse> QueryCertificateExAsync(QueryCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertificateResponse>(await DoRequestAsync("1.0", "antcloud.cas.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建证书
         * Summary: 创建证书
         */
        public CreateCertificateResponse CreateCertificate(CreateCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 创建证书
         * Summary: 创建证书
         */
        public async Task<CreateCertificateResponse> CreateCertificateAsync(CreateCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建证书
         * Summary: 创建证书
         */
        public CreateCertificateResponse CreateCertificateEx(CreateCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCertificateResponse>(DoRequest("1.0", "antcloud.cas.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建证书
         * Summary: 创建证书
         */
        public async Task<CreateCertificateResponse> CreateCertificateExAsync(CreateCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCertificateResponse>(await DoRequestAsync("1.0", "antcloud.cas.certificate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除证书
         * Summary: 删除证书
         */
        public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 删除证书
         * Summary: 删除证书
         */
        public async Task<DeleteCertificateResponse> DeleteCertificateAsync(DeleteCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除证书
         * Summary: 删除证书
         */
        public DeleteCertificateResponse DeleteCertificateEx(DeleteCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCertificateResponse>(DoRequest("1.0", "antcloud.cas.certificate.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除证书
         * Summary: 删除证书
         */
        public async Task<DeleteCertificateResponse> DeleteCertificateExAsync(DeleteCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCertificateResponse>(await DoRequestAsync("1.0", "antcloud.cas.certificate.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已创建的VPC
         * Summary: 查询已创建的VPC
         */
        public DescribeUnifiedresourceVpcResponse DescribeUnifiedresourceVpc(DescribeUnifiedresourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeUnifiedresourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 查询已创建的VPC
         * Summary: 查询已创建的VPC
         */
        public async Task<DescribeUnifiedresourceVpcResponse> DescribeUnifiedresourceVpcAsync(DescribeUnifiedresourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeUnifiedresourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已创建的VPC
         * Summary: 查询已创建的VPC
         */
        public DescribeUnifiedresourceVpcResponse DescribeUnifiedresourceVpcEx(DescribeUnifiedresourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUnifiedresourceVpcResponse>(DoRequest("1.0", "antcloud.cas.unifiedresource.vpc.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已创建的VPC
         * Summary: 查询已创建的VPC
         */
        public async Task<DescribeUnifiedresourceVpcResponse> DescribeUnifiedresourceVpcExAsync(DescribeUnifiedresourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUnifiedresourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.unifiedresource.vpc.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例规格族列表
         * Summary: 查询实例规格族列表
         */
        public ListUnifiedresourceInstancefamiliesResponse ListUnifiedresourceInstancefamilies(ListUnifiedresourceInstancefamiliesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnifiedresourceInstancefamiliesEx(request, headers, runtime);
        }

        /**
         * Description: 查询实例规格族列表
         * Summary: 查询实例规格族列表
         */
        public async Task<ListUnifiedresourceInstancefamiliesResponse> ListUnifiedresourceInstancefamiliesAsync(ListUnifiedresourceInstancefamiliesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnifiedresourceInstancefamiliesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实例规格族列表
         * Summary: 查询实例规格族列表
         */
        public ListUnifiedresourceInstancefamiliesResponse ListUnifiedresourceInstancefamiliesEx(ListUnifiedresourceInstancefamiliesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceInstancefamiliesResponse>(DoRequest("1.0", "antcloud.cas.unifiedresource.instancefamilies.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例规格族列表
         * Summary: 查询实例规格族列表
         */
        public async Task<ListUnifiedresourceInstancefamiliesResponse> ListUnifiedresourceInstancefamiliesExAsync(ListUnifiedresourceInstancefamiliesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceInstancefamiliesResponse>(await DoRequestAsync("1.0", "antcloud.cas.unifiedresource.instancefamilies.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有实例规格详细信息
         * Summary: 查询实例规格资源
         */
        public ListUnifiedresourceInstancetypeResponse ListUnifiedresourceInstancetype(ListUnifiedresourceInstancetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnifiedresourceInstancetypeEx(request, headers, runtime);
        }

        /**
         * Description: 查询所有实例规格详细信息
         * Summary: 查询实例规格资源
         */
        public async Task<ListUnifiedresourceInstancetypeResponse> ListUnifiedresourceInstancetypeAsync(ListUnifiedresourceInstancetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnifiedresourceInstancetypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所有实例规格详细信息
         * Summary: 查询实例规格资源
         */
        public ListUnifiedresourceInstancetypeResponse ListUnifiedresourceInstancetypeEx(ListUnifiedresourceInstancetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceInstancetypeResponse>(DoRequest("1.0", "antcloud.cas.unifiedresource.instancetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有实例规格详细信息
         * Summary: 查询实例规格资源
         */
        public async Task<ListUnifiedresourceInstancetypeResponse> ListUnifiedresourceInstancetypeExAsync(ListUnifiedresourceInstancetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceInstancetypeResponse>(await DoRequestAsync("1.0", "antcloud.cas.unifiedresource.instancetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query cas computer detail info by id
         * Summary: 获取单个computer的详细信息
         */
        public QueryComputerResponse QueryComputer(QueryComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComputerEx(request, headers, runtime);
        }

        /**
         * Description: query cas computer detail info by id
         * Summary: 获取单个computer的详细信息
         */
        public async Task<QueryComputerResponse> QueryComputerAsync(QueryComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: query cas computer detail info by id
         * Summary: 获取单个computer的详细信息
         */
        public QueryComputerResponse QueryComputerEx(QueryComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query cas computer detail info by id
         * Summary: 获取单个computer的详细信息
         */
        public async Task<QueryComputerResponse> QueryComputerExAsync(QueryComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
         * Summary: 查询可用实例类型
         */
        public ListResourceComputertypeResponse ListResourceComputertype(ListResourceComputertypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListResourceComputertypeEx(request, headers, runtime);
        }

        /**
         * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
         * Summary: 查询可用实例类型
         */
        public async Task<ListResourceComputertypeResponse> ListResourceComputertypeAsync(ListResourceComputertypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListResourceComputertypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
         * Summary: 查询可用实例类型
         */
        public ListResourceComputertypeResponse ListResourceComputertypeEx(ListResourceComputertypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceComputertypeResponse>(DoRequest("1.0", "antcloud.cas.resource.computertype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
         * Summary: 查询可用实例类型
         */
        public async Task<ListResourceComputertypeResponse> ListResourceComputertypeExAsync(ListResourceComputertypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceComputertypeResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computertype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ecs disk 列表
         * Summary: 查询ecs disk info
         */
        public ListResourceDiskResponse ListResourceDisk(ListResourceDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListResourceDiskEx(request, headers, runtime);
        }

        /**
         * Description: 查询ecs disk 列表
         * Summary: 查询ecs disk info
         */
        public async Task<ListResourceDiskResponse> ListResourceDiskAsync(ListResourceDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListResourceDiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询ecs disk 列表
         * Summary: 查询ecs disk info
         */
        public ListResourceDiskResponse ListResourceDiskEx(ListResourceDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceDiskResponse>(DoRequest("1.0", "antcloud.cas.resource.disk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ecs disk 列表
         * Summary: 查询ecs disk info
         */
        public async Task<ListResourceDiskResponse> ListResourceDiskExAsync(ListResourceDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceDiskResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.disk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询云服务器规格族列表
         * Summary: 查询云服务器规格族列表
         */
        public ListResourceComputertypefamilyResponse ListResourceComputertypefamily(ListResourceComputertypefamilyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListResourceComputertypefamilyEx(request, headers, runtime);
        }

        /**
         * Description: 查询云服务器规格族列表
         * Summary: 查询云服务器规格族列表
         */
        public async Task<ListResourceComputertypefamilyResponse> ListResourceComputertypefamilyAsync(ListResourceComputertypefamilyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListResourceComputertypefamilyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询云服务器规格族列表
         * Summary: 查询云服务器规格族列表
         */
        public ListResourceComputertypefamilyResponse ListResourceComputertypefamilyEx(ListResourceComputertypefamilyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceComputertypefamilyResponse>(DoRequest("1.0", "antcloud.cas.resource.computertypefamily.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询云服务器规格族列表
         * Summary: 查询云服务器规格族列表
         */
        public async Task<ListResourceComputertypefamilyResponse> ListResourceComputertypefamilyExAsync(ListResourceComputertypefamilyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListResourceComputertypefamilyResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.computertypefamily.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public ListUnifiedresourceVswitchResponse ListUnifiedresourceVswitch(ListUnifiedresourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnifiedresourceVswitchEx(request, headers, runtime);
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public async Task<ListUnifiedresourceVswitchResponse> ListUnifiedresourceVswitchAsync(ListUnifiedresourceVswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnifiedresourceVswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public ListUnifiedresourceVswitchResponse ListUnifiedresourceVswitchEx(ListUnifiedresourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceVswitchResponse>(DoRequest("1.0", "antcloud.cas.unifiedresource.vswitch.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询交换机信息
         * Summary: 查询交换机信息
         */
        public async Task<ListUnifiedresourceVswitchResponse> ListUnifiedresourceVswitchExAsync(ListUnifiedresourceVswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceVswitchResponse>(await DoRequestAsync("1.0", "antcloud.cas.unifiedresource.vswitch.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前region的vpc列表
         * Summary: 查询region vpc列表
         */
        public ListUnifiedresourceVpcResponse ListUnifiedresourceVpc(ListUnifiedresourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnifiedresourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前region的vpc列表
         * Summary: 查询region vpc列表
         */
        public async Task<ListUnifiedresourceVpcResponse> ListUnifiedresourceVpcAsync(ListUnifiedresourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnifiedresourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前region的vpc列表
         * Summary: 查询region vpc列表
         */
        public ListUnifiedresourceVpcResponse ListUnifiedresourceVpcEx(ListUnifiedresourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceVpcResponse>(DoRequest("1.0", "antcloud.cas.unifiedresource.vpc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前region的vpc列表
         * Summary: 查询region vpc列表
         */
        public async Task<ListUnifiedresourceVpcResponse> ListUnifiedresourceVpcExAsync(ListUnifiedresourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnifiedresourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.unifiedresource.vpc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入vpc到workspace
         * Summary: 导入vpc
         */
        public ImportResourceVpcResponse ImportResourceVpc(ImportResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportResourceVpcEx(request, headers, runtime);
        }

        /**
         * Description: 导入vpc到workspace
         * Summary: 导入vpc
         */
        public async Task<ImportResourceVpcResponse> ImportResourceVpcAsync(ImportResourceVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportResourceVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入vpc到workspace
         * Summary: 导入vpc
         */
        public ImportResourceVpcResponse ImportResourceVpcEx(ImportResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportResourceVpcResponse>(DoRequest("1.0", "antcloud.cas.resource.vpc.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入vpc到workspace
         * Summary: 导入vpc
         */
        public async Task<ImportResourceVpcResponse> ImportResourceVpcExAsync(ImportResourceVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportResourceVpcResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.vpc.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除安全组规则
         * Summary: 删除安全组规则
         */
        public DeleteResourceRuleResponse DeleteResourceRule(DeleteResourceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteResourceRuleEx(request, headers, runtime);
        }

        /**
         * Description: 删除安全组规则
         * Summary: 删除安全组规则
         */
        public async Task<DeleteResourceRuleResponse> DeleteResourceRuleAsync(DeleteResourceRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteResourceRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除安全组规则
         * Summary: 删除安全组规则
         */
        public DeleteResourceRuleResponse DeleteResourceRuleEx(DeleteResourceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceRuleResponse>(DoRequest("1.0", "antcloud.cas.resource.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除安全组规则
         * Summary: 删除安全组规则
         */
        public async Task<DeleteResourceRuleResponse> DeleteResourceRuleExAsync(DeleteResourceRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteResourceRuleResponse>(await DoRequestAsync("1.0", "antcloud.cas.resource.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由表条目列表
         * Summary: 查询路由表条目列表
         */
        public ListRouteEntryResponse ListRouteEntry(ListRouteEntryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRouteEntryEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由表条目列表
         * Summary: 查询路由表条目列表
         */
        public async Task<ListRouteEntryResponse> ListRouteEntryAsync(ListRouteEntryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRouteEntryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由表条目列表
         * Summary: 查询路由表条目列表
         */
        public ListRouteEntryResponse ListRouteEntryEx(ListRouteEntryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouteEntryResponse>(DoRequest("1.0", "antcloud.cas.route.entry.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由表条目列表
         * Summary: 查询路由表条目列表
         */
        public async Task<ListRouteEntryResponse> ListRouteEntryExAsync(ListRouteEntryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouteEntryResponse>(await DoRequestAsync("1.0", "antcloud.cas.route.entry.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用disk资源详细信息
         * Summary: 查询可用disk资源详细信息
         */
        public ListAvailableDiskResponse ListAvailableDisk(ListAvailableDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAvailableDiskEx(request, headers, runtime);
        }

        /**
         * Description: 查询可用disk资源详细信息
         * Summary: 查询可用disk资源详细信息
         */
        public async Task<ListAvailableDiskResponse> ListAvailableDiskAsync(ListAvailableDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAvailableDiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可用disk资源详细信息
         * Summary: 查询可用disk资源详细信息
         */
        public ListAvailableDiskResponse ListAvailableDiskEx(ListAvailableDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAvailableDiskResponse>(DoRequest("1.0", "antcloud.cas.available.disk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用disk资源详细信息
         * Summary: 查询可用disk资源详细信息
         */
        public async Task<ListAvailableDiskResponse> ListAvailableDiskExAsync(ListAvailableDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAvailableDiskResponse>(await DoRequestAsync("1.0", "antcloud.cas.available.disk.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用实例类型信息
         * Summary: 查询可用实例类型信息
         */
        public ListAvailableInstancetypeResponse ListAvailableInstancetype(ListAvailableInstancetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAvailableInstancetypeEx(request, headers, runtime);
        }

        /**
         * Description: 查询可用实例类型信息
         * Summary: 查询可用实例类型信息
         */
        public async Task<ListAvailableInstancetypeResponse> ListAvailableInstancetypeAsync(ListAvailableInstancetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAvailableInstancetypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可用实例类型信息
         * Summary: 查询可用实例类型信息
         */
        public ListAvailableInstancetypeResponse ListAvailableInstancetypeEx(ListAvailableInstancetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAvailableInstancetypeResponse>(DoRequest("1.0", "antcloud.cas.available.instancetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用实例类型信息
         * Summary: 查询可用实例类型信息
         */
        public async Task<ListAvailableInstancetypeResponse> ListAvailableInstancetypeExAsync(ListAvailableInstancetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAvailableInstancetypeResponse>(await DoRequestAsync("1.0", "antcloud.cas.available.instancetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询node meta数据
         * Summary: 查询node meta数据
         */
        public QueryResourcemetaNodeResponse QueryResourcemetaNode(QueryResourcemetaNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourcemetaNodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询node meta数据
         * Summary: 查询node meta数据
         */
        public async Task<QueryResourcemetaNodeResponse> QueryResourcemetaNodeAsync(QueryResourcemetaNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourcemetaNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询node meta数据
         * Summary: 查询node meta数据
         */
        public QueryResourcemetaNodeResponse QueryResourcemetaNodeEx(QueryResourcemetaNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcemetaNodeResponse>(DoRequest("1.0", "antcloud.cas.resourcemeta.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询node meta数据
         * Summary: 查询node meta数据
         */
        public async Task<QueryResourcemetaNodeResponse> QueryResourcemetaNodeExAsync(QueryResourcemetaNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcemetaNodeResponse>(await DoRequestAsync("1.0", "antcloud.cas.resourcemeta.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务meta数据
         * Summary: 查询应用服务meta数据
         */
        public QueryResourcemetaAppserviceResponse QueryResourcemetaAppservice(QueryResourcemetaAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourcemetaAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务meta数据
         * Summary: 查询应用服务meta数据
         */
        public async Task<QueryResourcemetaAppserviceResponse> QueryResourcemetaAppserviceAsync(QueryResourcemetaAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourcemetaAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务meta数据
         * Summary: 查询应用服务meta数据
         */
        public QueryResourcemetaAppserviceResponse QueryResourcemetaAppserviceEx(QueryResourcemetaAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcemetaAppserviceResponse>(DoRequest("1.0", "antcloud.cas.resourcemeta.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务meta数据
         * Summary: 查询应用服务meta数据
         */
        public async Task<QueryResourcemetaAppserviceResponse> QueryResourcemetaAppserviceExAsync(QueryResourcemetaAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcemetaAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.cas.resourcemeta.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
         * Summary: 同步机器状态
         */
        public SyncComputerResponse SyncComputer(SyncComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncComputerEx(request, headers, runtime);
        }

        /**
         * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
         * Summary: 同步机器状态
         */
        public async Task<SyncComputerResponse> SyncComputerAsync(SyncComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
         * Summary: 同步机器状态
         */
        public SyncComputerResponse SyncComputerEx(SyncComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncComputerResponse>(DoRequest("1.0", "antcloud.cas.computer.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
         * Summary: 同步机器状态
         */
        public async Task<SyncComputerResponse> SyncComputerExAsync(SyncComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncComputerResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步LB状态
         * Summary: 同步LB状态
         */
        public SyncLoadbalanceResponse SyncLoadbalance(SyncLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncLoadbalanceEx(request, headers, runtime);
        }

        /**
         * Description: 同步LB状态
         * Summary: 同步LB状态
         */
        public async Task<SyncLoadbalanceResponse> SyncLoadbalanceAsync(SyncLoadbalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncLoadbalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步LB状态
         * Summary: 同步LB状态
         */
        public SyncLoadbalanceResponse SyncLoadbalanceEx(SyncLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLoadbalanceResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步LB状态
         * Summary: 同步LB状态
         */
        public async Task<SyncLoadbalanceResponse> SyncLoadbalanceExAsync(SyncLoadbalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLoadbalanceResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新机器基本信息
         * Summary: 更新机器基本信息
         */
        public UpdateComputerInfoResponse UpdateComputerInfo(UpdateComputerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateComputerInfoEx(request, headers, runtime);
        }

        /**
         * Description: 更新机器基本信息
         * Summary: 更新机器基本信息
         */
        public async Task<UpdateComputerInfoResponse> UpdateComputerInfoAsync(UpdateComputerInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateComputerInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新机器基本信息
         * Summary: 更新机器基本信息
         */
        public UpdateComputerInfoResponse UpdateComputerInfoEx(UpdateComputerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateComputerInfoResponse>(DoRequest("1.0", "antcloud.cas.computer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新机器基本信息
         * Summary: 更新机器基本信息
         */
        public async Task<UpdateComputerInfoResponse> UpdateComputerInfoExAsync(UpdateComputerInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateComputerInfoResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将机器分配给应用
         * Summary: 将机器分配给应用
         */
        public SetComputerAssignResponse SetComputerAssign(SetComputerAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetComputerAssignEx(request, headers, runtime);
        }

        /**
         * Description: 将机器分配给应用
         * Summary: 将机器分配给应用
         */
        public async Task<SetComputerAssignResponse> SetComputerAssignAsync(SetComputerAssignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetComputerAssignExAsync(request, headers, runtime);
        }

        /**
         * Description: 将机器分配给应用
         * Summary: 将机器分配给应用
         */
        public SetComputerAssignResponse SetComputerAssignEx(SetComputerAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetComputerAssignResponse>(DoRequest("1.0", "antcloud.cas.computer.assign.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将机器分配给应用
         * Summary: 将机器分配给应用
         */
        public async Task<SetComputerAssignResponse> SetComputerAssignExAsync(SetComputerAssignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetComputerAssignResponse>(await DoRequestAsync("1.0", "antcloud.cas.computer.assign.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行任务
         * Summary: 执行任务
         */
        public ExecRequestTaskResponse ExecRequestTask(ExecRequestTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRequestTaskEx(request, headers, runtime);
        }

        /**
         * Description: 执行任务
         * Summary: 执行任务
         */
        public async Task<ExecRequestTaskResponse> ExecRequestTaskAsync(ExecRequestTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRequestTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行任务
         * Summary: 执行任务
         */
        public ExecRequestTaskResponse ExecRequestTaskEx(ExecRequestTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRequestTaskResponse>(DoRequest("1.0", "antcloud.cas.request.task.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行任务
         * Summary: 执行任务
         */
        public async Task<ExecRequestTaskResponse> ExecRequestTaskExAsync(ExecRequestTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRequestTaskResponse>(await DoRequestAsync("1.0", "antcloud.cas.request.task.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化机器
         * Summary: 重新初始化机器
         */
        public ReinitDiskResponse ReinitDisk(ReinitDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitDiskEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化机器
         * Summary: 重新初始化机器
         */
        public async Task<ReinitDiskResponse> ReinitDiskAsync(ReinitDiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitDiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化机器
         * Summary: 重新初始化机器
         */
        public ReinitDiskResponse ReinitDiskEx(ReinitDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitDiskResponse>(DoRequest("1.0", "antcloud.cas.disk.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化机器
         * Summary: 重新初始化机器
         */
        public async Task<ReinitDiskResponse> ReinitDiskExAsync(ReinitDiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitDiskResponse>(await DoRequestAsync("1.0", "antcloud.cas.disk.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改磁盘策略
         * Summary: 修改磁盘策略
         */
        public UpdateDiskStrategyResponse UpdateDiskStrategy(UpdateDiskStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDiskStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 修改磁盘策略
         * Summary: 修改磁盘策略
         */
        public async Task<UpdateDiskStrategyResponse> UpdateDiskStrategyAsync(UpdateDiskStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDiskStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改磁盘策略
         * Summary: 修改磁盘策略
         */
        public UpdateDiskStrategyResponse UpdateDiskStrategyEx(UpdateDiskStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDiskStrategyResponse>(DoRequest("1.0", "antcloud.cas.disk.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改磁盘策略
         * Summary: 修改磁盘策略
         */
        public async Task<UpdateDiskStrategyResponse> UpdateDiskStrategyExAsync(UpdateDiskStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDiskStrategyResponse>(await DoRequestAsync("1.0", "antcloud.cas.disk.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建虚拟服务器组
         * Summary: 创建虚拟服务器组
         */
        public CreateLoadbalanceVcomputergroupResponse CreateLoadbalanceVcomputergroup(CreateLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建虚拟服务器组
         * Summary: 创建虚拟服务器组
         */
        public async Task<CreateLoadbalanceVcomputergroupResponse> CreateLoadbalanceVcomputergroupAsync(CreateLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建虚拟服务器组
         * Summary: 创建虚拟服务器组
         */
        public CreateLoadbalanceVcomputergroupResponse CreateLoadbalanceVcomputergroupEx(CreateLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建虚拟服务器组
         * Summary: 创建虚拟服务器组
         */
        public async Task<CreateLoadbalanceVcomputergroupResponse> CreateLoadbalanceVcomputergroupExAsync(CreateLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在VComputerGroup里更新后端服务器
         * Summary: 增加VCompute
         */
        public UpdateLoadbalanceVcomputergroupResponse UpdateLoadbalanceVcomputergroup(UpdateLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 在VComputerGroup里更新后端服务器
         * Summary: 增加VCompute
         */
        public async Task<UpdateLoadbalanceVcomputergroupResponse> UpdateLoadbalanceVcomputergroupAsync(UpdateLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 在VComputerGroup里更新后端服务器
         * Summary: 增加VCompute
         */
        public UpdateLoadbalanceVcomputergroupResponse UpdateLoadbalanceVcomputergroupEx(UpdateLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在VComputerGroup里更新后端服务器
         * Summary: 增加VCompute
         */
        public async Task<UpdateLoadbalanceVcomputergroupResponse> UpdateLoadbalanceVcomputergroupExAsync(UpdateLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除VComputerGroup
         * Summary: 删除VComputerGroup
         */
        public DeleteLoadbalanceVcomputergroupResponse DeleteLoadbalanceVcomputergroup(DeleteLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除VComputerGroup
         * Summary: 删除VComputerGroup
         */
        public async Task<DeleteLoadbalanceVcomputergroupResponse> DeleteLoadbalanceVcomputergroupAsync(DeleteLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除VComputerGroup
         * Summary: 删除VComputerGroup
         */
        public DeleteLoadbalanceVcomputergroupResponse DeleteLoadbalanceVcomputergroupEx(DeleteLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除VComputerGroup
         * Summary: 删除VComputerGroup
         */
        public async Task<DeleteLoadbalanceVcomputergroupResponse> DeleteLoadbalanceVcomputergroupExAsync(DeleteLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在虚拟服务器组中增加服务器
         * Summary: 在虚拟服务器组中增加服务器
         */
        public AddLoadbalanceVcomputergroupResponse AddLoadbalanceVcomputergroup(AddLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 在虚拟服务器组中增加服务器
         * Summary: 在虚拟服务器组中增加服务器
         */
        public async Task<AddLoadbalanceVcomputergroupResponse> AddLoadbalanceVcomputergroupAsync(AddLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 在虚拟服务器组中增加服务器
         * Summary: 在虚拟服务器组中增加服务器
         */
        public AddLoadbalanceVcomputergroupResponse AddLoadbalanceVcomputergroupEx(AddLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在虚拟服务器组中增加服务器
         * Summary: 在虚拟服务器组中增加服务器
         */
        public async Task<AddLoadbalanceVcomputergroupResponse> AddLoadbalanceVcomputergroupExAsync(AddLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从虚拟服务器组中删除服务器
         * Summary: 从虚拟服务器组中删除服务器
         */
        public RemoveLoadbalanceVcomputergroupResponse RemoveLoadbalanceVcomputergroup(RemoveLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveLoadbalanceVcomputergroupEx(request, headers, runtime);
        }

        /**
         * Description: 从虚拟服务器组中删除服务器
         * Summary: 从虚拟服务器组中删除服务器
         */
        public async Task<RemoveLoadbalanceVcomputergroupResponse> RemoveLoadbalanceVcomputergroupAsync(RemoveLoadbalanceVcomputergroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveLoadbalanceVcomputergroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 从虚拟服务器组中删除服务器
         * Summary: 从虚拟服务器组中删除服务器
         */
        public RemoveLoadbalanceVcomputergroupResponse RemoveLoadbalanceVcomputergroupEx(RemoveLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceVcomputergroupResponse>(DoRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从虚拟服务器组中删除服务器
         * Summary: 从虚拟服务器组中删除服务器
         */
        public async Task<RemoveLoadbalanceVcomputergroupResponse> RemoveLoadbalanceVcomputergroupExAsync(RemoveLoadbalanceVcomputergroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveLoadbalanceVcomputergroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.loadbalance.vcomputergroup.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加域名记录
         * Summary: 添加域名记录
         */
        public AddDnsRecordsetResponse AddDnsRecordset(AddDnsRecordsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDnsRecordsetEx(request, headers, runtime);
        }

        /**
         * Description: 添加域名记录
         * Summary: 添加域名记录
         */
        public async Task<AddDnsRecordsetResponse> AddDnsRecordsetAsync(AddDnsRecordsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDnsRecordsetExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加域名记录
         * Summary: 添加域名记录
         */
        public AddDnsRecordsetResponse AddDnsRecordsetEx(AddDnsRecordsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDnsRecordsetResponse>(DoRequest("1.0", "antcloud.cas.dns.recordset.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加域名记录
         * Summary: 添加域名记录
         */
        public async Task<AddDnsRecordsetResponse> AddDnsRecordsetExAsync(AddDnsRecordsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDnsRecordsetResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.recordset.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一条DNS记录
         * Summary: 删除一条DNS记录
         */
        public DeleteDnsRecordResponse DeleteDnsRecord(DeleteDnsRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDnsRecordEx(request, headers, runtime);
        }

        /**
         * Description: 删除一条DNS记录
         * Summary: 删除一条DNS记录
         */
        public async Task<DeleteDnsRecordResponse> DeleteDnsRecordAsync(DeleteDnsRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDnsRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一条DNS记录
         * Summary: 删除一条DNS记录
         */
        public DeleteDnsRecordResponse DeleteDnsRecordEx(DeleteDnsRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDnsRecordResponse>(DoRequest("1.0", "antcloud.cas.dns.record.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一条DNS记录
         * Summary: 删除一条DNS记录
         */
        public async Task<DeleteDnsRecordResponse> DeleteDnsRecordExAsync(DeleteDnsRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDnsRecordResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.record.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前recordset
         * Summary: 查询当前recordset
         */
        public QueryDnsRecordsetResponse QueryDnsRecordset(QueryDnsRecordsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDnsRecordsetEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前recordset
         * Summary: 查询当前recordset
         */
        public async Task<QueryDnsRecordsetResponse> QueryDnsRecordsetAsync(QueryDnsRecordsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDnsRecordsetExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前recordset
         * Summary: 查询当前recordset
         */
        public QueryDnsRecordsetResponse QueryDnsRecordsetEx(QueryDnsRecordsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDnsRecordsetResponse>(DoRequest("1.0", "antcloud.cas.dns.recordset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前recordset
         * Summary: 查询当前recordset
         */
        public async Task<QueryDnsRecordsetResponse> QueryDnsRecordsetExAsync(QueryDnsRecordsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDnsRecordsetResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.recordset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace绑定指定DNS服务商
         * Summary: workspace绑定指定DNS服务商
         */
        public BindDnsProviderResponse BindDnsProvider(BindDnsProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDnsProviderEx(request, headers, runtime);
        }

        /**
         * Description: workspace绑定指定DNS服务商
         * Summary: workspace绑定指定DNS服务商
         */
        public async Task<BindDnsProviderResponse> BindDnsProviderAsync(BindDnsProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDnsProviderExAsync(request, headers, runtime);
        }

        /**
         * Description: workspace绑定指定DNS服务商
         * Summary: workspace绑定指定DNS服务商
         */
        public BindDnsProviderResponse BindDnsProviderEx(BindDnsProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDnsProviderResponse>(DoRequest("1.0", "antcloud.cas.dns.provider.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: workspace绑定指定DNS服务商
         * Summary: workspace绑定指定DNS服务商
         */
        public async Task<BindDnsProviderResponse> BindDnsProviderExAsync(BindDnsProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDnsProviderResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.provider.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境的DNS provider
         * Summary: 获取当前环境的DNS provider
         */
        public ListDnsProviderResponse ListDnsProvider(ListDnsProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDnsProviderEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境的DNS provider
         * Summary: 获取当前环境的DNS provider
         */
        public async Task<ListDnsProviderResponse> ListDnsProviderAsync(ListDnsProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDnsProviderExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境的DNS provider
         * Summary: 获取当前环境的DNS provider
         */
        public ListDnsProviderResponse ListDnsProviderEx(ListDnsProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDnsProviderResponse>(DoRequest("1.0", "antcloud.cas.dns.provider.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境的DNS provider
         * Summary: 获取当前环境的DNS provider
         */
        public async Task<ListDnsProviderResponse> ListDnsProviderExAsync(ListDnsProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDnsProviderResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.provider.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前环境资源供应商信息
         * Summary: 查询当前环境资源供应商信息
         */
        public QueryProviderResponse QueryProvider(QueryProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProviderEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前环境资源供应商信息
         * Summary: 查询当前环境资源供应商信息
         */
        public async Task<QueryProviderResponse> QueryProviderAsync(QueryProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProviderExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前环境资源供应商信息
         * Summary: 查询当前环境资源供应商信息
         */
        public QueryProviderResponse QueryProviderEx(QueryProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProviderResponse>(DoRequest("1.0", "antcloud.cas.provider.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前环境资源供应商信息
         * Summary: 查询当前环境资源供应商信息
         */
        public async Task<QueryProviderResponse> QueryProviderExAsync(QueryProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProviderResponse>(await DoRequestAsync("1.0", "antcloud.cas.provider.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前工作空间的DNSProvider
         * Summary: 获取当前工作空间的DNSProvider
         */
        public GetDnsWorkspaceproviderResponse GetDnsWorkspaceprovider(GetDnsWorkspaceproviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDnsWorkspaceproviderEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前工作空间的DNSProvider
         * Summary: 获取当前工作空间的DNSProvider
         */
        public async Task<GetDnsWorkspaceproviderResponse> GetDnsWorkspaceproviderAsync(GetDnsWorkspaceproviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDnsWorkspaceproviderExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前工作空间的DNSProvider
         * Summary: 获取当前工作空间的DNSProvider
         */
        public GetDnsWorkspaceproviderResponse GetDnsWorkspaceproviderEx(GetDnsWorkspaceproviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDnsWorkspaceproviderResponse>(DoRequest("1.0", "antcloud.cas.dns.workspaceprovider.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前工作空间的DNSProvider
         * Summary: 获取当前工作空间的DNSProvider
         */
        public async Task<GetDnsWorkspaceproviderResponse> GetDnsWorkspaceproviderExAsync(GetDnsWorkspaceproviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDnsWorkspaceproviderResponse>(await DoRequestAsync("1.0", "antcloud.cas.dns.workspaceprovider.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
         * Summary: [异步]创建工作空间组
         */
        public CreateUniworkspacegroupResponse CreateUniworkspacegroup(CreateUniworkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUniworkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
         * Summary: [异步]创建工作空间组
         */
        public async Task<CreateUniworkspacegroupResponse> CreateUniworkspacegroupAsync(CreateUniworkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUniworkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
         * Summary: [异步]创建工作空间组
         */
        public CreateUniworkspacegroupResponse CreateUniworkspacegroupEx(CreateUniworkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniworkspacegroupResponse>(DoRequest("1.0", "antcloud.cas.uniworkspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
         * Summary: [异步]创建工作空间组
         */
        public async Task<CreateUniworkspacegroupResponse> CreateUniworkspacegroupExAsync(CreateUniworkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniworkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.cas.uniworkspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入一个中间件集群
         * Summary: 导入一个中间件集群
         */
        public ImportMiddlewareclusterResponse ImportMiddlewarecluster(ImportMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportMiddlewareclusterEx(request, headers, runtime);
        }

        /**
         * Description: 导入一个中间件集群
         * Summary: 导入一个中间件集群
         */
        public async Task<ImportMiddlewareclusterResponse> ImportMiddlewareclusterAsync(ImportMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportMiddlewareclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入一个中间件集群
         * Summary: 导入一个中间件集群
         */
        public ImportMiddlewareclusterResponse ImportMiddlewareclusterEx(ImportMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMiddlewareclusterResponse>(DoRequest("1.0", "antcloud.cas.middlewarecluster.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入一个中间件集群
         * Summary: 导入一个中间件集群
         */
        public async Task<ImportMiddlewareclusterResponse> ImportMiddlewareclusterExAsync(ImportMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMiddlewareclusterResponse>(await DoRequestAsync("1.0", "antcloud.cas.middlewarecluster.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前工作空间中间件集群
         * Summary: 查询当前工作空间中间件集群
         */
        public QueryMiddlewareclusterResponse QueryMiddlewarecluster(QueryMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMiddlewareclusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前工作空间中间件集群
         * Summary: 查询当前工作空间中间件集群
         */
        public async Task<QueryMiddlewareclusterResponse> QueryMiddlewareclusterAsync(QueryMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMiddlewareclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前工作空间中间件集群
         * Summary: 查询当前工作空间中间件集群
         */
        public QueryMiddlewareclusterResponse QueryMiddlewareclusterEx(QueryMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareclusterResponse>(DoRequest("1.0", "antcloud.cas.middlewarecluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前工作空间中间件集群
         * Summary: 查询当前工作空间中间件集群
         */
        public async Task<QueryMiddlewareclusterResponse> QueryMiddlewareclusterExAsync(QueryMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareclusterResponse>(await DoRequestAsync("1.0", "antcloud.cas.middlewarecluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除一个中间件集群
         * Summary: 移除一个中间件集群
         */
        public RemoveMiddlewareclusterResponse RemoveMiddlewarecluster(RemoveMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveMiddlewareclusterEx(request, headers, runtime);
        }

        /**
         * Description: 移除一个中间件集群
         * Summary: 移除一个中间件集群
         */
        public async Task<RemoveMiddlewareclusterResponse> RemoveMiddlewareclusterAsync(RemoveMiddlewareclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveMiddlewareclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除一个中间件集群
         * Summary: 移除一个中间件集群
         */
        public RemoveMiddlewareclusterResponse RemoveMiddlewareclusterEx(RemoveMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveMiddlewareclusterResponse>(DoRequest("1.0", "antcloud.cas.middlewarecluster.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除一个中间件集群
         * Summary: 移除一个中间件集群
         */
        public async Task<RemoveMiddlewareclusterResponse> RemoveMiddlewareclusterExAsync(RemoveMiddlewareclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveMiddlewareclusterResponse>(await DoRequestAsync("1.0", "antcloud.cas.middlewarecluster.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
