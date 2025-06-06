// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.IAM.Models;

namespace AntChain.SDK.IAM
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
                        {"sdk_version", "3.13.1"},
                        {"_prod_code", "IAM"},
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
                        {"sdk_version", "3.13.1"},
                        {"_prod_code", "IAM"},
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
         * Description: 获取Role
         * Summary: 获取角色
         */
        public GetRoleResponse GetRole(GetRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRoleEx(request, headers, runtime);
        }

        /**
         * Description: 获取Role
         * Summary: 获取角色
         */
        public async Task<GetRoleResponse> GetRoleAsync(GetRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取Role
         * Summary: 获取角色
         */
        public GetRoleResponse GetRoleEx(GetRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRoleResponse>(DoRequest("1.0", "antcloud.iam.role.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取Role
         * Summary: 获取角色
         */
        public async Task<GetRoleResponse> GetRoleExAsync(GetRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRoleResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略
         * Summary: 查询授权
         */
        public QueryPolicyResponse QueryPolicy(QueryPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略
         * Summary: 查询授权
         */
        public async Task<QueryPolicyResponse> QueryPolicyAsync(QueryPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略
         * Summary: 查询授权
         */
        public QueryPolicyResponse QueryPolicyEx(QueryPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略
         * Summary: 查询授权
         */
        public async Task<QueryPolicyResponse> QueryPolicyExAsync(QueryPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户下的权限组
         * Summary: 查询授权组
         */
        public QueryGroupResponse QueryGroup(QueryGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户下的权限组
         * Summary: 查询授权组
         */
        public async Task<QueryGroupResponse> QueryGroupAsync(QueryGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户下的权限组
         * Summary: 查询授权组
         */
        public QueryGroupResponse QueryGroupEx(QueryGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGroupResponse>(DoRequest("1.0", "antcloud.iam.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户下的权限组
         * Summary: 查询授权组
         */
        public async Task<QueryGroupResponse> QueryGroupExAsync(QueryGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建授权策略
         * Summary: 创建授权策略
         */
        public CreatePolicyResponse CreatePolicy(CreatePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 创建授权策略
         * Summary: 创建授权策略
         */
        public async Task<CreatePolicyResponse> CreatePolicyAsync(CreatePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建授权策略
         * Summary: 创建授权策略
         */
        public CreatePolicyResponse CreatePolicyEx(CreatePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建授权策略
         * Summary: 创建授权策略
         */
        public async Task<CreatePolicyResponse> CreatePolicyExAsync(CreatePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除授权策略
         * Summary: 删除授权策略
         */
        public DeletePolicyResponse DeletePolicy(DeletePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeletePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 删除授权策略
         * Summary: 删除授权策略
         */
        public async Task<DeletePolicyResponse> DeletePolicyAsync(DeletePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeletePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除授权策略
         * Summary: 删除授权策略
         */
        public DeletePolicyResponse DeletePolicyEx(DeletePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除授权策略
         * Summary: 删除授权策略
         */
        public async Task<DeletePolicyResponse> DeletePolicyExAsync(DeletePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权策略赋予某个对象
         * Summary: 添加授权
         */
        public AttachPolicyResponse AttachPolicy(AttachPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AttachPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 授权策略赋予某个对象
         * Summary: 添加授权
         */
        public async Task<AttachPolicyResponse> AttachPolicyAsync(AttachPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AttachPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权策略赋予某个对象
         * Summary: 添加授权
         */
        public AttachPolicyResponse AttachPolicyEx(AttachPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AttachPolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.attach", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权策略赋予某个对象
         * Summary: 添加授权
         */
        public async Task<AttachPolicyResponse> AttachPolicyExAsync(AttachPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AttachPolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.attach", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解除授权对象的授权策略
         * Summary: 解除授权
         */
        public DetachPolicyResponse DetachPolicy(DetachPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetachPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 解除授权对象的授权策略
         * Summary: 解除授权
         */
        public async Task<DetachPolicyResponse> DetachPolicyAsync(DetachPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetachPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 解除授权对象的授权策略
         * Summary: 解除授权
         */
        public DetachPolicyResponse DetachPolicyEx(DetachPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetachPolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.detach", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解除授权对象的授权策略
         * Summary: 解除授权
         */
        public async Task<DetachPolicyResponse> DetachPolicyExAsync(DetachPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetachPolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.detach", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
         * Summary: 查询授权
         */
        public ListPolicyResponse ListPolicy(ListPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
         * Summary: 查询授权
         */
        public async Task<ListPolicyResponse> ListPolicyAsync(ListPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
         * Summary: 查询授权
         */
        public ListPolicyResponse ListPolicyEx(ListPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPolicyResponse>(DoRequest("1.0", "antcloud.iam.policy.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
         * Summary: 查询授权
         */
        public async Task<ListPolicyResponse> ListPolicyExAsync(ListPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPolicyResponse>(await DoRequestAsync("1.0", "antcloud.iam.policy.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权对象的权限校验
         * Summary: 校验权限
         */
        public JudgeAuthorityResponse JudgeAuthority(JudgeAuthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return JudgeAuthorityEx(request, headers, runtime);
        }

        /**
         * Description: 授权对象的权限校验
         * Summary: 校验权限
         */
        public async Task<JudgeAuthorityResponse> JudgeAuthorityAsync(JudgeAuthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await JudgeAuthorityExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权对象的权限校验
         * Summary: 校验权限
         */
        public JudgeAuthorityResponse JudgeAuthorityEx(JudgeAuthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAuthorityResponse>(DoRequest("1.0", "antcloud.iam.authority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权对象的权限校验
         * Summary: 校验权限
         */
        public async Task<JudgeAuthorityResponse> JudgeAuthorityExAsync(JudgeAuthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAuthorityResponse>(await DoRequestAsync("1.0", "antcloud.iam.authority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加产品操作元数据
         * Summary: 创建产品操作点
         */
        public CreateProductActionResponse CreateProductAction(CreateProductActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProductActionEx(request, headers, runtime);
        }

        /**
         * Description: 添加产品操作元数据
         * Summary: 创建产品操作点
         */
        public async Task<CreateProductActionResponse> CreateProductActionAsync(CreateProductActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProductActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加产品操作元数据
         * Summary: 创建产品操作点
         */
        public CreateProductActionResponse CreateProductActionEx(CreateProductActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProductActionResponse>(DoRequest("1.0", "antcloud.iam.product.action.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加产品操作元数据
         * Summary: 创建产品操作点
         */
        public async Task<CreateProductActionResponse> CreateProductActionExAsync(CreateProductActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProductActionResponse>(await DoRequestAsync("1.0", "antcloud.iam.product.action.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验token合法性
         * Summary: 校验token合法性
         */
        public VerifyOauthTokenResponse VerifyOauthToken(VerifyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 校验token合法性
         * Summary: 校验token合法性
         */
        public async Task<VerifyOauthTokenResponse> VerifyOauthTokenAsync(VerifyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验token合法性
         * Summary: 校验token合法性
         */
        public VerifyOauthTokenResponse VerifyOauthTokenEx(VerifyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyOauthTokenResponse>(DoRequest("1.0", "antcloud.iam.oauth.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验token合法性
         * Summary: 校验token合法性
         */
        public async Task<VerifyOauthTokenResponse> VerifyOauthTokenExAsync(VerifyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyOauthTokenResponse>(await DoRequestAsync("1.0", "antcloud.iam.oauth.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验中枢登录态合法性
         * Summary: 校验中枢登录态合法性
         */
        public VerifySessionTokenResponse VerifySessionToken(VerifySessionTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifySessionTokenEx(request, headers, runtime);
        }

        /**
         * Description: 校验中枢登录态合法性
         * Summary: 校验中枢登录态合法性
         */
        public async Task<VerifySessionTokenResponse> VerifySessionTokenAsync(VerifySessionTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifySessionTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验中枢登录态合法性
         * Summary: 校验中枢登录态合法性
         */
        public VerifySessionTokenResponse VerifySessionTokenEx(VerifySessionTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySessionTokenResponse>(DoRequest("1.0", "antcloud.iam.session.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验中枢登录态合法性
         * Summary: 校验中枢登录态合法性
         */
        public async Task<VerifySessionTokenResponse> VerifySessionTokenExAsync(VerifySessionTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySessionTokenResponse>(await DoRequestAsync("1.0", "antcloud.iam.session.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授予角色的操作员列表
         * Summary: 授予角色的操作员列表
         */
        public ListRoleOperatorResponse ListRoleOperator(ListRoleOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRoleOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 获取授予角色的操作员列表
         * Summary: 授予角色的操作员列表
         */
        public async Task<ListRoleOperatorResponse> ListRoleOperatorAsync(ListRoleOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRoleOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授予角色的操作员列表
         * Summary: 授予角色的操作员列表
         */
        public ListRoleOperatorResponse ListRoleOperatorEx(ListRoleOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRoleOperatorResponse>(DoRequest("1.0", "antcloud.iam.role.operator.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授予角色的操作员列表
         * Summary: 授予角色的操作员列表
         */
        public async Task<ListRoleOperatorResponse> ListRoleOperatorExAsync(ListRoleOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRoleOperatorResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.operator.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请信任登录URL
         * Summary: 申请信任登录URL
         */
        public ApplyTrustloginUrlResponse ApplyTrustloginUrl(ApplyTrustloginUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTrustloginUrlEx(request, headers, runtime);
        }

        /**
         * Description: 申请信任登录URL
         * Summary: 申请信任登录URL
         */
        public async Task<ApplyTrustloginUrlResponse> ApplyTrustloginUrlAsync(ApplyTrustloginUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTrustloginUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请信任登录URL
         * Summary: 申请信任登录URL
         */
        public ApplyTrustloginUrlResponse ApplyTrustloginUrlEx(ApplyTrustloginUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTrustloginUrlResponse>(DoRequest("1.0", "antcloud.iam.trustlogin.url.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请信任登录URL
         * Summary: 申请信任登录URL
         */
        public async Task<ApplyTrustloginUrlResponse> ApplyTrustloginUrlExAsync(ApplyTrustloginUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTrustloginUrlResponse>(await DoRequestAsync("1.0", "antcloud.iam.trustlogin.url.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扮演虚拟身份，获取安全令牌
         * Summary: 扮演虚拟身份，获取安全令牌
         */
        public AssumeStsResponse AssumeSts(AssumeStsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AssumeStsEx(request, headers, runtime);
        }

        /**
         * Description: 扮演虚拟身份，获取安全令牌
         * Summary: 扮演虚拟身份，获取安全令牌
         */
        public async Task<AssumeStsResponse> AssumeStsAsync(AssumeStsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AssumeStsExAsync(request, headers, runtime);
        }

        /**
         * Description: 扮演虚拟身份，获取安全令牌
         * Summary: 扮演虚拟身份，获取安全令牌
         */
        public AssumeStsResponse AssumeStsEx(AssumeStsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeStsResponse>(DoRequest("1.0", "antcloud.iam.sts.assume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扮演虚拟身份，获取安全令牌
         * Summary: 扮演虚拟身份，获取安全令牌
         */
        public async Task<AssumeStsResponse> AssumeStsExAsync(AssumeStsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeStsResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.assume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建虚拟身份
         * Summary: 创建虚拟身份
         */
        public CreateStsActorResponse CreateStsActor(CreateStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStsActorEx(request, headers, runtime);
        }

        /**
         * Description: 创建虚拟身份
         * Summary: 创建虚拟身份
         */
        public async Task<CreateStsActorResponse> CreateStsActorAsync(CreateStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStsActorExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建虚拟身份
         * Summary: 创建虚拟身份
         */
        public CreateStsActorResponse CreateStsActorEx(CreateStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStsActorResponse>(DoRequest("1.0", "antcloud.iam.sts.actor.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建虚拟身份
         * Summary: 创建虚拟身份
         */
        public async Task<CreateStsActorResponse> CreateStsActorExAsync(CreateStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStsActorResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.actor.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除虚拟身份
         * Summary: 删除虚拟身份
         */
        public DeleteStsActorResponse DeleteStsActor(DeleteStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteStsActorEx(request, headers, runtime);
        }

        /**
         * Description: 删除虚拟身份
         * Summary: 删除虚拟身份
         */
        public async Task<DeleteStsActorResponse> DeleteStsActorAsync(DeleteStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteStsActorExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除虚拟身份
         * Summary: 删除虚拟身份
         */
        public DeleteStsActorResponse DeleteStsActorEx(DeleteStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStsActorResponse>(DoRequest("1.0", "antcloud.iam.sts.actor.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除虚拟身份
         * Summary: 删除虚拟身份
         */
        public async Task<DeleteStsActorResponse> DeleteStsActorExAsync(DeleteStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStsActorResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.actor.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一查询虚拟身份
         * Summary: 唯一查询虚拟身份
         */
        public GetStsActorResponse GetStsActor(GetStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetStsActorEx(request, headers, runtime);
        }

        /**
         * Description: 唯一查询虚拟身份
         * Summary: 唯一查询虚拟身份
         */
        public async Task<GetStsActorResponse> GetStsActorAsync(GetStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetStsActorExAsync(request, headers, runtime);
        }

        /**
         * Description: 唯一查询虚拟身份
         * Summary: 唯一查询虚拟身份
         */
        public GetStsActorResponse GetStsActorEx(GetStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStsActorResponse>(DoRequest("1.0", "antcloud.iam.sts.actor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一查询虚拟身份
         * Summary: 唯一查询虚拟身份
         */
        public async Task<GetStsActorResponse> GetStsActorExAsync(GetStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStsActorResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.actor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户内的虚拟身份
         * Summary: 获取租户内的虚拟身份
         */
        public ListStsActorResponse ListStsActor(ListStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListStsActorEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户内的虚拟身份
         * Summary: 获取租户内的虚拟身份
         */
        public async Task<ListStsActorResponse> ListStsActorAsync(ListStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListStsActorExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户内的虚拟身份
         * Summary: 获取租户内的虚拟身份
         */
        public ListStsActorResponse ListStsActorEx(ListStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStsActorResponse>(DoRequest("1.0", "antcloud.iam.sts.actor.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户内的虚拟身份
         * Summary: 获取租户内的虚拟身份
         */
        public async Task<ListStsActorResponse> ListStsActorExAsync(ListStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStsActorResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.actor.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新虚拟身份
         * Summary: 更新虚拟身份
         */
        public UpdateStsActorResponse UpdateStsActor(UpdateStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateStsActorEx(request, headers, runtime);
        }

        /**
         * Description: 更新虚拟身份
         * Summary: 更新虚拟身份
         */
        public async Task<UpdateStsActorResponse> UpdateStsActorAsync(UpdateStsActorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateStsActorExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新虚拟身份
         * Summary: 更新虚拟身份
         */
        public UpdateStsActorResponse UpdateStsActorEx(UpdateStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStsActorResponse>(DoRequest("1.0", "antcloud.iam.sts.actor.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新虚拟身份
         * Summary: 更新虚拟身份
         */
        public async Task<UpdateStsActorResponse> UpdateStsActorExAsync(UpdateStsActorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStsActorResponse>(await DoRequestAsync("1.0", "antcloud.iam.sts.actor.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户内可见的角色
         * Summary: 角色查询
         */
        public QueryRoleResponse QueryRole(QueryRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRoleEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户内可见的角色
         * Summary: 角色查询
         */
        public async Task<QueryRoleResponse> QueryRoleAsync(QueryRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户内可见的角色
         * Summary: 角色查询
         */
        public QueryRoleResponse QueryRoleEx(QueryRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleResponse>(DoRequest("1.0", "antcloud.iam.role.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户内可见的角色
         * Summary: 角色查询
         */
        public async Task<QueryRoleResponse> QueryRoleExAsync(QueryRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户Iaas账号基本信息
         * Summary: 获取租户Iaas账号基本信息
         */
        public GetIaasaccountBaseinfoResponse GetIaasaccountBaseinfo(GetIaasaccountBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetIaasaccountBaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户Iaas账号基本信息
         * Summary: 获取租户Iaas账号基本信息
         */
        public async Task<GetIaasaccountBaseinfoResponse> GetIaasaccountBaseinfoAsync(GetIaasaccountBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetIaasaccountBaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户Iaas账号基本信息
         * Summary: 获取租户Iaas账号基本信息
         */
        public GetIaasaccountBaseinfoResponse GetIaasaccountBaseinfoEx(GetIaasaccountBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIaasaccountBaseinfoResponse>(DoRequest("1.0", "antcloud.iam.iaasaccount.baseinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户Iaas账号基本信息
         * Summary: 获取租户Iaas账号基本信息
         */
        public async Task<GetIaasaccountBaseinfoResponse> GetIaasaccountBaseinfoExAsync(GetIaasaccountBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIaasaccountBaseinfoResponse>(await DoRequestAsync("1.0", "antcloud.iam.iaasaccount.baseinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
         * Summary: 校验密码是否正确
         */
        public VerifyPasswordResponse VerifyPassword(VerifyPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyPasswordEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
         * Summary: 校验密码是否正确
         */
        public async Task<VerifyPasswordResponse> VerifyPasswordAsync(VerifyPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyPasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
         * Summary: 校验密码是否正确
         */
        public VerifyPasswordResponse VerifyPasswordEx(VerifyPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPasswordResponse>(DoRequest("1.0", "antcloud.iam.password.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
         * Summary: 校验密码是否正确
         */
        public async Task<VerifyPasswordResponse> VerifyPasswordExAsync(VerifyPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPasswordResponse>(await DoRequestAsync("1.0", "antcloud.iam.password.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
         * Summary: 更新操作员状态
         */
        public UpdateOperatorStatusResponse UpdateOperatorStatus(UpdateOperatorStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOperatorStatusEx(request, headers, runtime);
        }

        /**
         * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
         * Summary: 更新操作员状态
         */
        public async Task<UpdateOperatorStatusResponse> UpdateOperatorStatusAsync(UpdateOperatorStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOperatorStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
         * Summary: 更新操作员状态
         */
        public UpdateOperatorStatusResponse UpdateOperatorStatusEx(UpdateOperatorStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorStatusResponse>(DoRequest("1.0", "antcloud.iam.operator.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
         * Summary: 更新操作员状态
         */
        public async Task<UpdateOperatorStatusResponse> UpdateOperatorStatusExAsync(UpdateOperatorStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorStatusResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 冻结操作员
         * Summary: 冻结操作员
         */
        public FreezeOperatorResponse FreezeOperator(FreezeOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 冻结操作员
         * Summary: 冻结操作员
         */
        public async Task<FreezeOperatorResponse> FreezeOperatorAsync(FreezeOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 冻结操作员
         * Summary: 冻结操作员
         */
        public FreezeOperatorResponse FreezeOperatorEx(FreezeOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeOperatorResponse>(DoRequest("1.0", "antcloud.iam.operator.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 冻结操作员
         * Summary: 冻结操作员
         */
        public async Task<FreezeOperatorResponse> FreezeOperatorExAsync(FreezeOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeOperatorResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解冻操作员
         * Summary: 解冻操作员
         */
        public UnfreezeOperatorResponse UnfreezeOperator(UnfreezeOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 解冻操作员
         * Summary: 解冻操作员
         */
        public async Task<UnfreezeOperatorResponse> UnfreezeOperatorAsync(UnfreezeOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 解冻操作员
         * Summary: 解冻操作员
         */
        public UnfreezeOperatorResponse UnfreezeOperatorEx(UnfreezeOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeOperatorResponse>(DoRequest("1.0", "antcloud.iam.operator.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解冻操作员
         * Summary: 解冻操作员
         */
        public async Task<UnfreezeOperatorResponse> UnfreezeOperatorExAsync(UnfreezeOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeOperatorResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取主账号信息
         * Summary: 获取主账号信息
         */
        public GetInternalMasterResponse GetInternalMaster(GetInternalMasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInternalMasterEx(request, headers, runtime);
        }

        /**
         * Description: 获取主账号信息
         * Summary: 获取主账号信息
         */
        public async Task<GetInternalMasterResponse> GetInternalMasterAsync(GetInternalMasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInternalMasterExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取主账号信息
         * Summary: 获取主账号信息
         */
        public GetInternalMasterResponse GetInternalMasterEx(GetInternalMasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalMasterResponse>(DoRequest("1.0", "antcloud.iam.internal.master.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取主账号信息
         * Summary: 获取主账号信息
         */
        public async Task<GetInternalMasterResponse> GetInternalMasterExAsync(GetInternalMasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalMasterResponse>(await DoRequestAsync("1.0", "antcloud.iam.internal.master.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
         * Summary: 获取阿里云用户信息
         */
        public GetAliyunUserResponse GetAliyunUser(GetAliyunUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAliyunUserEx(request, headers, runtime);
        }

        /**
         * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
         * Summary: 获取阿里云用户信息
         */
        public async Task<GetAliyunUserResponse> GetAliyunUserAsync(GetAliyunUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAliyunUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
         * Summary: 获取阿里云用户信息
         */
        public GetAliyunUserResponse GetAliyunUserEx(GetAliyunUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAliyunUserResponse>(DoRequest("1.0", "antcloud.iam.aliyun.user.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
         * Summary: 获取阿里云用户信息
         */
        public async Task<GetAliyunUserResponse> GetAliyunUserExAsync(GetAliyunUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAliyunUserResponse>(await DoRequestAsync("1.0", "antcloud.iam.aliyun.user.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云RAM权限校验
         * Summary: 阿里云RAM权限校验
         */
        public JudgeAliyunAuthorityResponse JudgeAliyunAuthority(JudgeAliyunAuthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return JudgeAliyunAuthorityEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云RAM权限校验
         * Summary: 阿里云RAM权限校验
         */
        public async Task<JudgeAliyunAuthorityResponse> JudgeAliyunAuthorityAsync(JudgeAliyunAuthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await JudgeAliyunAuthorityExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云RAM权限校验
         * Summary: 阿里云RAM权限校验
         */
        public JudgeAliyunAuthorityResponse JudgeAliyunAuthorityEx(JudgeAliyunAuthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAliyunAuthorityResponse>(DoRequest("1.0", "antcloud.iam.aliyun.authority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云RAM权限校验
         * Summary: 阿里云RAM权限校验
         */
        public async Task<JudgeAliyunAuthorityResponse> JudgeAliyunAuthorityExAsync(JudgeAliyunAuthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAliyunAuthorityResponse>(await DoRequestAsync("1.0", "antcloud.iam.aliyun.authority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据登录态获取ak
         * Summary: 根据登录态获取ak
         */
        public GetSessionAccessorResponse GetSessionAccessor(GetSessionAccessorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSessionAccessorEx(request, headers, runtime);
        }

        /**
         * Description: 根据登录态获取ak
         * Summary: 根据登录态获取ak
         */
        public async Task<GetSessionAccessorResponse> GetSessionAccessorAsync(GetSessionAccessorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSessionAccessorExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据登录态获取ak
         * Summary: 根据登录态获取ak
         */
        public GetSessionAccessorResponse GetSessionAccessorEx(GetSessionAccessorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSessionAccessorResponse>(DoRequest("1.0", "antcloud.iam.session.accessor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据登录态获取ak
         * Summary: 根据登录态获取ak
         */
        public async Task<GetSessionAccessorResponse> GetSessionAccessorExAsync(GetSessionAccessorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSessionAccessorResponse>(await DoRequestAsync("1.0", "antcloud.iam.session.accessor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public UpdatePasswordResponse UpdatePassword(UpdatePasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdatePasswordEx(request, headers, runtime);
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public async Task<UpdatePasswordResponse> UpdatePasswordAsync(UpdatePasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdatePasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public UpdatePasswordResponse UpdatePasswordEx(UpdatePasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePasswordResponse>(DoRequest("1.0", "antcloud.iam.password.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public async Task<UpdatePasswordResponse> UpdatePasswordExAsync(UpdatePasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePasswordResponse>(await DoRequestAsync("1.0", "antcloud.iam.password.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁侧批量鉴权
         * Summary: 蚂蚁侧批量鉴权
         */
        public JudgeMultiauthorityResponse JudgeMultiauthority(JudgeMultiauthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return JudgeMultiauthorityEx(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁侧批量鉴权
         * Summary: 蚂蚁侧批量鉴权
         */
        public async Task<JudgeMultiauthorityResponse> JudgeMultiauthorityAsync(JudgeMultiauthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await JudgeMultiauthorityExAsync(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁侧批量鉴权
         * Summary: 蚂蚁侧批量鉴权
         */
        public JudgeMultiauthorityResponse JudgeMultiauthorityEx(JudgeMultiauthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeMultiauthorityResponse>(DoRequest("1.0", "antcloud.iam.multiauthority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁侧批量鉴权
         * Summary: 蚂蚁侧批量鉴权
         */
        public async Task<JudgeMultiauthorityResponse> JudgeMultiauthorityExAsync(JudgeMultiauthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeMultiauthorityResponse>(await DoRequestAsync("1.0", "antcloud.iam.multiauthority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云批量鉴权
         * Summary: 阿里云批量鉴权
         */
        public JudgeAliyunMultiauthorityResponse JudgeAliyunMultiauthority(JudgeAliyunMultiauthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return JudgeAliyunMultiauthorityEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云批量鉴权
         * Summary: 阿里云批量鉴权
         */
        public async Task<JudgeAliyunMultiauthorityResponse> JudgeAliyunMultiauthorityAsync(JudgeAliyunMultiauthorityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await JudgeAliyunMultiauthorityExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云批量鉴权
         * Summary: 阿里云批量鉴权
         */
        public JudgeAliyunMultiauthorityResponse JudgeAliyunMultiauthorityEx(JudgeAliyunMultiauthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAliyunMultiauthorityResponse>(DoRequest("1.0", "antcloud.iam.aliyun.multiauthority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云批量鉴权
         * Summary: 阿里云批量鉴权
         */
        public async Task<JudgeAliyunMultiauthorityResponse> JudgeAliyunMultiauthorityExAsync(JudgeAliyunMultiauthorityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeAliyunMultiauthorityResponse>(await DoRequestAsync("1.0", "antcloud.iam.aliyun.multiauthority.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 辰霖
         * Summary: 获取当前AK关联的用户实体信息
         */
        public GetAccessorCurrentResponse GetAccessorCurrent(GetAccessorCurrentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAccessorCurrentEx(request, headers, runtime);
        }

        /**
         * Description: 辰霖
         * Summary: 获取当前AK关联的用户实体信息
         */
        public async Task<GetAccessorCurrentResponse> GetAccessorCurrentAsync(GetAccessorCurrentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAccessorCurrentExAsync(request, headers, runtime);
        }

        /**
         * Description: 辰霖
         * Summary: 获取当前AK关联的用户实体信息
         */
        public GetAccessorCurrentResponse GetAccessorCurrentEx(GetAccessorCurrentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccessorCurrentResponse>(DoRequest("1.0", "antcloud.iam.accessor.current.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 辰霖
         * Summary: 获取当前AK关联的用户实体信息
         */
        public async Task<GetAccessorCurrentResponse> GetAccessorCurrentExAsync(GetAccessorCurrentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccessorCurrentResponse>(await DoRequestAsync("1.0", "antcloud.iam.accessor.current.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个服务账号信息
         * Summary: 获取单个服务账号信息
         */
        public GetServiceaccountResponse GetServiceaccount(GetServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetServiceaccountEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个服务账号信息
         * Summary: 获取单个服务账号信息
         */
        public async Task<GetServiceaccountResponse> GetServiceaccountAsync(GetServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetServiceaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个服务账号信息
         * Summary: 获取单个服务账号信息
         */
        public GetServiceaccountResponse GetServiceaccountEx(GetServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceaccountResponse>(DoRequest("1.0", "antcloud.iam.serviceaccount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个服务账号信息
         * Summary: 获取单个服务账号信息
         */
        public async Task<GetServiceaccountResponse> GetServiceaccountExAsync(GetServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceaccountResponse>(await DoRequestAsync("1.0", "antcloud.iam.serviceaccount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建服务账号
         * Summary: 创建服务账号
         */
        public CreateServiceaccountResponse CreateServiceaccount(CreateServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateServiceaccountEx(request, headers, runtime);
        }

        /**
         * Description: 创建服务账号
         * Summary: 创建服务账号
         */
        public async Task<CreateServiceaccountResponse> CreateServiceaccountAsync(CreateServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateServiceaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建服务账号
         * Summary: 创建服务账号
         */
        public CreateServiceaccountResponse CreateServiceaccountEx(CreateServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServiceaccountResponse>(DoRequest("1.0", "antcloud.iam.serviceaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建服务账号
         * Summary: 创建服务账号
         */
        public async Task<CreateServiceaccountResponse> CreateServiceaccountExAsync(CreateServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServiceaccountResponse>(await DoRequestAsync("1.0", "antcloud.iam.serviceaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除服务账号
         * Summary: 删除服务账号
         */
        public DeleteServiceaccountResponse DeleteServiceaccount(DeleteServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteServiceaccountEx(request, headers, runtime);
        }

        /**
         * Description: 删除服务账号
         * Summary: 删除服务账号
         */
        public async Task<DeleteServiceaccountResponse> DeleteServiceaccountAsync(DeleteServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteServiceaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除服务账号
         * Summary: 删除服务账号
         */
        public DeleteServiceaccountResponse DeleteServiceaccountEx(DeleteServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServiceaccountResponse>(DoRequest("1.0", "antcloud.iam.serviceaccount.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除服务账号
         * Summary: 删除服务账号
         */
        public async Task<DeleteServiceaccountResponse> DeleteServiceaccountExAsync(DeleteServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServiceaccountResponse>(await DoRequestAsync("1.0", "antcloud.iam.serviceaccount.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务账号信息
         * Summary: 更新服务账号信息
         */
        public UpdateServiceaccountResponse UpdateServiceaccount(UpdateServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateServiceaccountEx(request, headers, runtime);
        }

        /**
         * Description: 更新服务账号信息
         * Summary: 更新服务账号信息
         */
        public async Task<UpdateServiceaccountResponse> UpdateServiceaccountAsync(UpdateServiceaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateServiceaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新服务账号信息
         * Summary: 更新服务账号信息
         */
        public UpdateServiceaccountResponse UpdateServiceaccountEx(UpdateServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceaccountResponse>(DoRequest("1.0", "antcloud.iam.serviceaccount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务账号信息
         * Summary: 更新服务账号信息
         */
        public async Task<UpdateServiceaccountResponse> UpdateServiceaccountExAsync(UpdateServiceaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceaccountResponse>(await DoRequestAsync("1.0", "antcloud.iam.serviceaccount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除租户成员
         * Summary: 移除租户成员
         */
        public RemoveTenantMemberResponse RemoveTenantMember(RemoveTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveTenantMemberEx(request, headers, runtime);
        }

        /**
         * Description: 移除租户成员
         * Summary: 移除租户成员
         */
        public async Task<RemoveTenantMemberResponse> RemoveTenantMemberAsync(RemoveTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveTenantMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除租户成员
         * Summary: 移除租户成员
         */
        public RemoveTenantMemberResponse RemoveTenantMemberEx(RemoveTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveTenantMemberResponse>(DoRequest("1.0", "antcloud.iam.tenant.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除租户成员
         * Summary: 移除租户成员
         */
        public async Task<RemoveTenantMemberResponse> RemoveTenantMemberExAsync(RemoveTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveTenantMemberResponse>(await DoRequestAsync("1.0", "antcloud.iam.tenant.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建成员组
         * Summary: 创建成员组
         */
        public CreateGroupResponse CreateGroup(CreateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建成员组
         * Summary: 创建成员组
         */
        public async Task<CreateGroupResponse> CreateGroupAsync(CreateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建成员组
         * Summary: 创建成员组
         */
        public CreateGroupResponse CreateGroupEx(CreateGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGroupResponse>(DoRequest("1.0", "antcloud.iam.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建成员组
         * Summary: 创建成员组
         */
        public async Task<CreateGroupResponse> CreateGroupExAsync(CreateGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除成员组
         * Summary: 删除成员组
         */
        public DeleteGroupResponse DeleteGroup(DeleteGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteGroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除成员组
         * Summary: 删除成员组
         */
        public async Task<DeleteGroupResponse> DeleteGroupAsync(DeleteGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除成员组
         * Summary: 删除成员组
         */
        public DeleteGroupResponse DeleteGroupEx(DeleteGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGroupResponse>(DoRequest("1.0", "antcloud.iam.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除成员组
         * Summary: 删除成员组
         */
        public async Task<DeleteGroupResponse> DeleteGroupExAsync(DeleteGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新成员组
         * Summary: 更新成员组
         */
        public UpdateGroupResponse UpdateGroup(UpdateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新成员组
         * Summary: 更新成员组
         */
        public async Task<UpdateGroupResponse> UpdateGroupAsync(UpdateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新成员组
         * Summary: 更新成员组
         */
        public UpdateGroupResponse UpdateGroupEx(UpdateGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGroupResponse>(DoRequest("1.0", "antcloud.iam.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新成员组
         * Summary: 更新成员组
         */
        public async Task<UpdateGroupResponse> UpdateGroupExAsync(UpdateGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加成员组成员
         * Summary: 添加成员组成员
         */
        public AddGroupMemberResponse AddGroupMember(AddGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddGroupMemberEx(request, headers, runtime);
        }

        /**
         * Description: 添加成员组成员
         * Summary: 添加成员组成员
         */
        public async Task<AddGroupMemberResponse> AddGroupMemberAsync(AddGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddGroupMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加成员组成员
         * Summary: 添加成员组成员
         */
        public AddGroupMemberResponse AddGroupMemberEx(AddGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGroupMemberResponse>(DoRequest("1.0", "antcloud.iam.group.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加成员组成员
         * Summary: 添加成员组成员
         */
        public async Task<AddGroupMemberResponse> AddGroupMemberExAsync(AddGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGroupMemberResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除成员组成员
         * Summary: 移除成员组成员
         */
        public RemoveGroupMemberResponse RemoveGroupMember(RemoveGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveGroupMemberEx(request, headers, runtime);
        }

        /**
         * Description: 移除成员组成员
         * Summary: 移除成员组成员
         */
        public async Task<RemoveGroupMemberResponse> RemoveGroupMemberAsync(RemoveGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveGroupMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除成员组成员
         * Summary: 移除成员组成员
         */
        public RemoveGroupMemberResponse RemoveGroupMemberEx(RemoveGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveGroupMemberResponse>(DoRequest("1.0", "antcloud.iam.group.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除成员组成员
         * Summary: 移除成员组成员
         */
        public async Task<RemoveGroupMemberResponse> RemoveGroupMemberExAsync(RemoveGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveGroupMemberResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员组基本信息查询
         * Summary: 成员组基本信息查询
         */
        public GetGroupResponse GetGroup(GetGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGroupEx(request, headers, runtime);
        }

        /**
         * Description: 成员组基本信息查询
         * Summary: 成员组基本信息查询
         */
        public async Task<GetGroupResponse> GetGroupAsync(GetGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 成员组基本信息查询
         * Summary: 成员组基本信息查询
         */
        public GetGroupResponse GetGroupEx(GetGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGroupResponse>(DoRequest("1.0", "antcloud.iam.group.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员组基本信息查询
         * Summary: 成员组基本信息查询
         */
        public async Task<GetGroupResponse> GetGroupExAsync(GetGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员组成员查询
         * Summary: 成员组成员查询
         */
        public QueryGroupMemberResponse QueryGroupMember(QueryGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGroupMemberEx(request, headers, runtime);
        }

        /**
         * Description: 成员组成员查询
         * Summary: 成员组成员查询
         */
        public async Task<QueryGroupMemberResponse> QueryGroupMemberAsync(QueryGroupMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGroupMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 成员组成员查询
         * Summary: 成员组成员查询
         */
        public QueryGroupMemberResponse QueryGroupMemberEx(QueryGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGroupMemberResponse>(DoRequest("1.0", "antcloud.iam.group.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员组成员查询
         * Summary: 成员组成员查询
         */
        public async Task<QueryGroupMemberResponse> QueryGroupMemberExAsync(QueryGroupMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGroupMemberResponse>(await DoRequestAsync("1.0", "antcloud.iam.group.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户所在成员组
         * Summary: 获取用户所在成员组
         */
        public ListOperatorGroupResponse ListOperatorGroup(ListOperatorGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListOperatorGroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户所在成员组
         * Summary: 获取用户所在成员组
         */
        public async Task<ListOperatorGroupResponse> ListOperatorGroupAsync(ListOperatorGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListOperatorGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户所在成员组
         * Summary: 获取用户所在成员组
         */
        public ListOperatorGroupResponse ListOperatorGroupEx(ListOperatorGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOperatorGroupResponse>(DoRequest("1.0", "antcloud.iam.operator.group.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户所在成员组
         * Summary: 获取用户所在成员组
         */
        public async Task<ListOperatorGroupResponse> ListOperatorGroupExAsync(ListOperatorGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOperatorGroupResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.group.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为角色添加权限码
         * Summary: 为角色添加权限码
         */
        public AddRoleActionResponse AddRoleAction(AddRoleActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddRoleActionEx(request, headers, runtime);
        }

        /**
         * Description: 为角色添加权限码
         * Summary: 为角色添加权限码
         */
        public async Task<AddRoleActionResponse> AddRoleActionAsync(AddRoleActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddRoleActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 为角色添加权限码
         * Summary: 为角色添加权限码
         */
        public AddRoleActionResponse AddRoleActionEx(AddRoleActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRoleActionResponse>(DoRequest("1.0", "antcloud.iam.role.action.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为角色添加权限码
         * Summary: 为角色添加权限码
         */
        public async Task<AddRoleActionResponse> AddRoleActionExAsync(AddRoleActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRoleActionResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.action.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除角色权限
         * Summary: 移除角色权限
         */
        public RemoveRoleActionResponse RemoveRoleAction(RemoveRoleActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveRoleActionEx(request, headers, runtime);
        }

        /**
         * Description: 移除角色权限
         * Summary: 移除角色权限
         */
        public async Task<RemoveRoleActionResponse> RemoveRoleActionAsync(RemoveRoleActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveRoleActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除角色权限
         * Summary: 移除角色权限
         */
        public RemoveRoleActionResponse RemoveRoleActionEx(RemoveRoleActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveRoleActionResponse>(DoRequest("1.0", "antcloud.iam.role.action.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除角色权限
         * Summary: 移除角色权限
         */
        public async Task<RemoveRoleActionResponse> RemoveRoleActionExAsync(RemoveRoleActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveRoleActionResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.action.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义角色
         * Summary: 创建自定义角色
         */
        public CreateRoleResponse CreateRole(CreateRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRoleEx(request, headers, runtime);
        }

        /**
         * Description: 创建自定义角色
         * Summary: 创建自定义角色
         */
        public async Task<CreateRoleResponse> CreateRoleAsync(CreateRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建自定义角色
         * Summary: 创建自定义角色
         */
        public CreateRoleResponse CreateRoleEx(CreateRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRoleResponse>(DoRequest("1.0", "antcloud.iam.role.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义角色
         * Summary: 创建自定义角色
         */
        public async Task<CreateRoleResponse> CreateRoleExAsync(CreateRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRoleResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除角色
         * Summary: 删除角色
         */
        public DeleteRoleResponse DeleteRole(DeleteRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRoleEx(request, headers, runtime);
        }

        /**
         * Description: 删除角色
         * Summary: 删除角色
         */
        public async Task<DeleteRoleResponse> DeleteRoleAsync(DeleteRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除角色
         * Summary: 删除角色
         */
        public DeleteRoleResponse DeleteRoleEx(DeleteRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRoleResponse>(DoRequest("1.0", "antcloud.iam.role.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除角色
         * Summary: 删除角色
         */
        public async Task<DeleteRoleResponse> DeleteRoleExAsync(DeleteRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRoleResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新角色
         * Summary: 更新角色
         */
        public UpdateRoleResponse UpdateRole(UpdateRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRoleEx(request, headers, runtime);
        }

        /**
         * Description: 更新角色
         * Summary: 更新角色
         */
        public async Task<UpdateRoleResponse> UpdateRoleAsync(UpdateRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新角色
         * Summary: 更新角色
         */
        public UpdateRoleResponse UpdateRoleEx(UpdateRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRoleResponse>(DoRequest("1.0", "antcloud.iam.role.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新角色
         * Summary: 更新角色
         */
        public async Task<UpdateRoleResponse> UpdateRoleExAsync(UpdateRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRoleResponse>(await DoRequestAsync("1.0", "antcloud.iam.role.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个部门信息
         * Summary: 获取单个部门信息
         */
        public GetDepartmentResponse GetDepartment(GetDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个部门信息
         * Summary: 获取单个部门信息
         */
        public async Task<GetDepartmentResponse> GetDepartmentAsync(GetDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个部门信息
         * Summary: 获取单个部门信息
         */
        public GetDepartmentResponse GetDepartmentEx(GetDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个部门信息
         * Summary: 获取单个部门信息
         */
        public async Task<GetDepartmentResponse> GetDepartmentExAsync(GetDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部门
         * Summary: 创建部门
         */
        public CreateDepartmentResponse CreateDepartment(CreateDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 创建部门
         * Summary: 创建部门
         */
        public async Task<CreateDepartmentResponse> CreateDepartmentAsync(CreateDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建部门
         * Summary: 创建部门
         */
        public CreateDepartmentResponse CreateDepartmentEx(CreateDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部门
         * Summary: 创建部门
         */
        public async Task<CreateDepartmentResponse> CreateDepartmentExAsync(CreateDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部门信息
         * Summary: 更新部门信息
         */
        public UpdateDepartmentResponse UpdateDepartment(UpdateDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 更新部门信息
         * Summary: 更新部门信息
         */
        public async Task<UpdateDepartmentResponse> UpdateDepartmentAsync(UpdateDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新部门信息
         * Summary: 更新部门信息
         */
        public UpdateDepartmentResponse UpdateDepartmentEx(UpdateDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部门信息
         * Summary: 更新部门信息
         */
        public async Task<UpdateDepartmentResponse> UpdateDepartmentExAsync(UpdateDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部门
         * Summary: 删除部门
         */
        public DeleteDepartmentResponse DeleteDepartment(DeleteDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 删除部门
         * Summary: 删除部门
         */
        public async Task<DeleteDepartmentResponse> DeleteDepartmentAsync(DeleteDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除部门
         * Summary: 删除部门
         */
        public DeleteDepartmentResponse DeleteDepartmentEx(DeleteDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部门
         * Summary: 删除部门
         */
        public async Task<DeleteDepartmentResponse> DeleteDepartmentExAsync(DeleteDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询部门信息
         * Summary: 分页查询部门信息
         */
        public PagequeryDepartmentResponse PagequeryDepartment(PagequeryDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询部门信息
         * Summary: 分页查询部门信息
         */
        public async Task<PagequeryDepartmentResponse> PagequeryDepartmentAsync(PagequeryDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询部门信息
         * Summary: 分页查询部门信息
         */
        public PagequeryDepartmentResponse PagequeryDepartmentEx(PagequeryDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询部门信息
         * Summary: 分页查询部门信息
         */
        public async Task<PagequeryDepartmentResponse> PagequeryDepartmentExAsync(PagequeryDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询部门
         * Summary: 批量查询部门
         */
        public BatchqueryDepartmentResponse BatchqueryDepartment(BatchqueryDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryDepartmentEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询部门
         * Summary: 批量查询部门
         */
        public async Task<BatchqueryDepartmentResponse> BatchqueryDepartmentAsync(BatchqueryDepartmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryDepartmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询部门
         * Summary: 批量查询部门
         */
        public BatchqueryDepartmentResponse BatchqueryDepartmentEx(BatchqueryDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryDepartmentResponse>(DoRequest("1.0", "antcloud.iam.department.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询部门
         * Summary: 批量查询部门
         */
        public async Task<BatchqueryDepartmentResponse> BatchqueryDepartmentExAsync(BatchqueryDepartmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryDepartmentResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加或更新部门成员
         * Summary: 添加或更新部门成员
         */
        public SaveDepartmentUserResponse SaveDepartmentUser(SaveDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveDepartmentUserEx(request, headers, runtime);
        }

        /**
         * Description: 添加或更新部门成员
         * Summary: 添加或更新部门成员
         */
        public async Task<SaveDepartmentUserResponse> SaveDepartmentUserAsync(SaveDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveDepartmentUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加或更新部门成员
         * Summary: 添加或更新部门成员
         */
        public SaveDepartmentUserResponse SaveDepartmentUserEx(SaveDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveDepartmentUserResponse>(DoRequest("1.0", "antcloud.iam.department.user.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加或更新部门成员
         * Summary: 添加或更新部门成员
         */
        public async Task<SaveDepartmentUserResponse> SaveDepartmentUserExAsync(SaveDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveDepartmentUserResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.user.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除部门成员
         * Summary: 移除部门成员
         */
        public RemoveDepartmentUserResponse RemoveDepartmentUser(RemoveDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveDepartmentUserEx(request, headers, runtime);
        }

        /**
         * Description: 移除部门成员
         * Summary: 移除部门成员
         */
        public async Task<RemoveDepartmentUserResponse> RemoveDepartmentUserAsync(RemoveDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveDepartmentUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除部门成员
         * Summary: 移除部门成员
         */
        public RemoveDepartmentUserResponse RemoveDepartmentUserEx(RemoveDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDepartmentUserResponse>(DoRequest("1.0", "antcloud.iam.department.user.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除部门成员
         * Summary: 移除部门成员
         */
        public async Task<RemoveDepartmentUserResponse> RemoveDepartmentUserExAsync(RemoveDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDepartmentUserResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.user.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询部门成员信息
         * Summary: 分页查询部门成员信息
         */
        public QueryDepartmentUserResponse QueryDepartmentUser(QueryDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDepartmentUserEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询部门成员信息
         * Summary: 分页查询部门成员信息
         */
        public async Task<QueryDepartmentUserResponse> QueryDepartmentUserAsync(QueryDepartmentUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDepartmentUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询部门成员信息
         * Summary: 分页查询部门成员信息
         */
        public QueryDepartmentUserResponse QueryDepartmentUserEx(QueryDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepartmentUserResponse>(DoRequest("1.0", "antcloud.iam.department.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询部门成员信息
         * Summary: 分页查询部门成员信息
         */
        public async Task<QueryDepartmentUserResponse> QueryDepartmentUserExAsync(QueryDepartmentUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDepartmentUserResponse>(await DoRequestAsync("1.0", "antcloud.iam.department.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户级安全设置
         * Summary: 获取租户级安全设置
         */
        public GetLoginconfigResponse GetLoginconfig(GetLoginconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLoginconfigEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户级安全设置
         * Summary: 获取租户级安全设置
         */
        public async Task<GetLoginconfigResponse> GetLoginconfigAsync(GetLoginconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLoginconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户级安全设置
         * Summary: 获取租户级安全设置
         */
        public GetLoginconfigResponse GetLoginconfigEx(GetLoginconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoginconfigResponse>(DoRequest("1.0", "antcloud.iam.loginconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户级安全设置
         * Summary: 获取租户级安全设置
         */
        public async Task<GetLoginconfigResponse> GetLoginconfigExAsync(GetLoginconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLoginconfigResponse>(await DoRequestAsync("1.0", "antcloud.iam.loginconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户级安全设置
         * Summary: 更新租户级安全设置
         */
        public UpdateLoginconfigResponse UpdateLoginconfig(UpdateLoginconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLoginconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新租户级安全设置
         * Summary: 更新租户级安全设置
         */
        public async Task<UpdateLoginconfigResponse> UpdateLoginconfigAsync(UpdateLoginconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLoginconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新租户级安全设置
         * Summary: 更新租户级安全设置
         */
        public UpdateLoginconfigResponse UpdateLoginconfigEx(UpdateLoginconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoginconfigResponse>(DoRequest("1.0", "antcloud.iam.loginconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户级安全设置
         * Summary: 更新租户级安全设置
         */
        public async Task<UpdateLoginconfigResponse> UpdateLoginconfigExAsync(UpdateLoginconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLoginconfigResponse>(await DoRequestAsync("1.0", "antcloud.iam.loginconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一条件查询MFA状态
         * Summary: 唯一条件查询MFA状态
         */
        public GetMfaStatusResponse GetMfaStatus(GetMfaStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMfaStatusEx(request, headers, runtime);
        }

        /**
         * Description: 唯一条件查询MFA状态
         * Summary: 唯一条件查询MFA状态
         */
        public async Task<GetMfaStatusResponse> GetMfaStatusAsync(GetMfaStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMfaStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 唯一条件查询MFA状态
         * Summary: 唯一条件查询MFA状态
         */
        public GetMfaStatusResponse GetMfaStatusEx(GetMfaStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMfaStatusResponse>(DoRequest("1.0", "antcloud.iam.mfa.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一条件查询MFA状态
         * Summary: 唯一条件查询MFA状态
         */
        public async Task<GetMfaStatusResponse> GetMfaStatusExAsync(GetMfaStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMfaStatusResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启MFA
         * Summary: 开启MFA
         */
        public EnableMfaResponse EnableMfa(EnableMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableMfaEx(request, headers, runtime);
        }

        /**
         * Description: 开启MFA
         * Summary: 开启MFA
         */
        public async Task<EnableMfaResponse> EnableMfaAsync(EnableMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableMfaExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启MFA
         * Summary: 开启MFA
         */
        public EnableMfaResponse EnableMfaEx(EnableMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableMfaResponse>(DoRequest("1.0", "antcloud.iam.mfa.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启MFA
         * Summary: 开启MFA
         */
        public async Task<EnableMfaResponse> EnableMfaExAsync(EnableMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableMfaResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭MFA
         * Summary: 关闭MFA
         */
        public DisableMfaResponse DisableMfa(DisableMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableMfaEx(request, headers, runtime);
        }

        /**
         * Description: 关闭MFA
         * Summary: 关闭MFA
         */
        public async Task<DisableMfaResponse> DisableMfaAsync(DisableMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableMfaExAsync(request, headers, runtime);
        }

        /**
         * Description: 关闭MFA
         * Summary: 关闭MFA
         */
        public DisableMfaResponse DisableMfaEx(DisableMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableMfaResponse>(DoRequest("1.0", "antcloud.iam.mfa.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭MFA
         * Summary: 关闭MFA
         */
        public async Task<DisableMfaResponse> DisableMfaExAsync(DisableMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableMfaResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化MFA
         * Summary: 初始化MFA
         */
        public InitMfaResponse InitMfa(InitMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitMfaEx(request, headers, runtime);
        }

        /**
         * Description: 初始化MFA
         * Summary: 初始化MFA
         */
        public async Task<InitMfaResponse> InitMfaAsync(InitMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitMfaExAsync(request, headers, runtime);
        }

        /**
         * Description: 初始化MFA
         * Summary: 初始化MFA
         */
        public InitMfaResponse InitMfaEx(InitMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitMfaResponse>(DoRequest("1.0", "antcloud.iam.mfa.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化MFA
         * Summary: 初始化MFA
         */
        public async Task<InitMfaResponse> InitMfaExAsync(InitMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitMfaResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验 MFA
         * Summary: 校验 MFA
         */
        public VerifyMfaResponse VerifyMfa(VerifyMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyMfaEx(request, headers, runtime);
        }

        /**
         * Description: 校验 MFA
         * Summary: 校验 MFA
         */
        public async Task<VerifyMfaResponse> VerifyMfaAsync(VerifyMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyMfaExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验 MFA
         * Summary: 校验 MFA
         */
        public VerifyMfaResponse VerifyMfaEx(VerifyMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMfaResponse>(DoRequest("1.0", "antcloud.iam.mfa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验 MFA
         * Summary: 校验 MFA
         */
        public async Task<VerifyMfaResponse> VerifyMfaExAsync(VerifyMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMfaResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一条件查询MFA配置
         * Summary: 唯一条件查询MFA配置
         */
        public GetMfaResponse GetMfa(GetMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMfaEx(request, headers, runtime);
        }

        /**
         * Description: 唯一条件查询MFA配置
         * Summary: 唯一条件查询MFA配置
         */
        public async Task<GetMfaResponse> GetMfaAsync(GetMfaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMfaExAsync(request, headers, runtime);
        }

        /**
         * Description: 唯一条件查询MFA配置
         * Summary: 唯一条件查询MFA配置
         */
        public GetMfaResponse GetMfaEx(GetMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMfaResponse>(DoRequest("1.0", "antcloud.iam.mfa.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一条件查询MFA配置
         * Summary: 唯一条件查询MFA配置
         */
        public async Task<GetMfaResponse> GetMfaExAsync(GetMfaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMfaResponse>(await DoRequestAsync("1.0", "antcloud.iam.mfa.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public UpdateOperatorPasswordResponse UpdateOperatorPassword(UpdateOperatorPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOperatorPasswordEx(request, headers, runtime);
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public async Task<UpdateOperatorPasswordResponse> UpdateOperatorPasswordAsync(UpdateOperatorPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOperatorPasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public UpdateOperatorPasswordResponse UpdateOperatorPasswordEx(UpdateOperatorPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorPasswordResponse>(DoRequest("1.0", "antcloud.iam.operator.password.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新密码
         * Summary: 更新密码
         */
        public async Task<UpdateOperatorPasswordResponse> UpdateOperatorPasswordExAsync(UpdateOperatorPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorPasswordResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.password.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置账号密码
         * Summary: 重置账号密码
         */
        public ResetOperatorPasswordResponse ResetOperatorPassword(ResetOperatorPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetOperatorPasswordEx(request, headers, runtime);
        }

        /**
         * Description: 重置账号密码
         * Summary: 重置账号密码
         */
        public async Task<ResetOperatorPasswordResponse> ResetOperatorPasswordAsync(ResetOperatorPasswordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetOperatorPasswordExAsync(request, headers, runtime);
        }

        /**
         * Description: 重置账号密码
         * Summary: 重置账号密码
         */
        public ResetOperatorPasswordResponse ResetOperatorPasswordEx(ResetOperatorPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetOperatorPasswordResponse>(DoRequest("1.0", "antcloud.iam.operator.password.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置账号密码
         * Summary: 重置账号密码
         */
        public async Task<ResetOperatorPasswordResponse> ResetOperatorPasswordExAsync(ResetOperatorPasswordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetOperatorPasswordResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.password.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询操作员
         * Summary: 批量查询操作员
         */
        public BatchqueryOperatorResponse BatchqueryOperator(BatchqueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询操作员
         * Summary: 批量查询操作员
         */
        public async Task<BatchqueryOperatorResponse> BatchqueryOperatorAsync(BatchqueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询操作员
         * Summary: 批量查询操作员
         */
        public BatchqueryOperatorResponse BatchqueryOperatorEx(BatchqueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryOperatorResponse>(DoRequest("1.0", "antcloud.iam.operator.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询操作员
         * Summary: 批量查询操作员
         */
        public async Task<BatchqueryOperatorResponse> BatchqueryOperatorExAsync(BatchqueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryOperatorResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送操作事件，事件需要事先定义
         * Summary: 推送操作事件
         */
        public PushOperationResponse PushOperation(PushOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushOperationEx(request, headers, runtime);
        }

        /**
         * Description: 推送操作事件，事件需要事先定义
         * Summary: 推送操作事件
         */
        public async Task<PushOperationResponse> PushOperationAsync(PushOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送操作事件，事件需要事先定义
         * Summary: 推送操作事件
         */
        public PushOperationResponse PushOperationEx(PushOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushOperationResponse>(DoRequest("1.0", "antcloud.iam.operation.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送操作事件，事件需要事先定义
         * Summary: 推送操作事件
         */
        public async Task<PushOperationResponse> PushOperationExAsync(PushOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushOperationResponse>(await DoRequestAsync("1.0", "antcloud.iam.operation.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作类型
         * Summary: 查询操作类型
         */
        public QueryOperationtypeResponse QueryOperationtype(QueryOperationtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOperationtypeEx(request, headers, runtime);
        }

        /**
         * Description: 查询操作类型
         * Summary: 查询操作类型
         */
        public async Task<QueryOperationtypeResponse> QueryOperationtypeAsync(QueryOperationtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOperationtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询操作类型
         * Summary: 查询操作类型
         */
        public QueryOperationtypeResponse QueryOperationtypeEx(QueryOperationtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationtypeResponse>(DoRequest("1.0", "antcloud.iam.operationtype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作类型
         * Summary: 查询操作类型
         */
        public async Task<QueryOperationtypeResponse> QueryOperationtypeExAsync(QueryOperationtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationtypeResponse>(await DoRequestAsync("1.0", "antcloud.iam.operationtype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一查询操作类型
         * Summary: 唯一查询操作类型
         */
        public GetOperationtypeResponse GetOperationtype(GetOperationtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOperationtypeEx(request, headers, runtime);
        }

        /**
         * Description: 唯一查询操作类型
         * Summary: 唯一查询操作类型
         */
        public async Task<GetOperationtypeResponse> GetOperationtypeAsync(GetOperationtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOperationtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 唯一查询操作类型
         * Summary: 唯一查询操作类型
         */
        public GetOperationtypeResponse GetOperationtypeEx(GetOperationtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperationtypeResponse>(DoRequest("1.0", "antcloud.iam.operationtype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 唯一查询操作类型
         * Summary: 唯一查询操作类型
         */
        public async Task<GetOperationtypeResponse> GetOperationtypeExAsync(GetOperationtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperationtypeResponse>(await DoRequestAsync("1.0", "antcloud.iam.operationtype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public AddTenantMemberResponse AddTenantMember(AddTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTenantMemberEx(request, headers, runtime);
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public async Task<AddTenantMemberResponse> AddTenantMemberAsync(AddTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTenantMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public AddTenantMemberResponse AddTenantMemberEx(AddTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantMemberResponse>(DoRequest("1.0", "antcloud.iam.tenant.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public async Task<AddTenantMemberResponse> AddTenantMemberExAsync(AddTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantMemberResponse>(await DoRequestAsync("1.0", "antcloud.iam.tenant.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
         * Summary: 获取操作员 signtoken
         */
        public GetOperatorLogintokenResponse GetOperatorLogintoken(GetOperatorLogintokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOperatorLogintokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
         * Summary: 获取操作员 signtoken
         */
        public async Task<GetOperatorLogintokenResponse> GetOperatorLogintokenAsync(GetOperatorLogintokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOperatorLogintokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
         * Summary: 获取操作员 signtoken
         */
        public GetOperatorLogintokenResponse GetOperatorLogintokenEx(GetOperatorLogintokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperatorLogintokenResponse>(DoRequest("1.0", "antcloud.iam.operator.logintoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
         * Summary: 获取操作员 signtoken
         */
        public async Task<GetOperatorLogintokenResponse> GetOperatorLogintokenExAsync(GetOperatorLogintokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperatorLogintokenResponse>(await DoRequestAsync("1.0", "antcloud.iam.operator.logintoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token用于三方会员免密登录，与数科官网token不通用
         * Summary: 三方会员免密登录token申请
         */
        public ApplyTrustloginTokenResponse ApplyTrustloginToken(ApplyTrustloginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTrustloginTokenEx(request, headers, runtime);
        }

        /**
         * Description: token用于三方会员免密登录，与数科官网token不通用
         * Summary: 三方会员免密登录token申请
         */
        public async Task<ApplyTrustloginTokenResponse> ApplyTrustloginTokenAsync(ApplyTrustloginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTrustloginTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: token用于三方会员免密登录，与数科官网token不通用
         * Summary: 三方会员免密登录token申请
         */
        public ApplyTrustloginTokenResponse ApplyTrustloginTokenEx(ApplyTrustloginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTrustloginTokenResponse>(DoRequest("1.0", "antcloud.iam.trustlogin.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token用于三方会员免密登录，与数科官网token不通用
         * Summary: 三方会员免密登录token申请
         */
        public async Task<ApplyTrustloginTokenResponse> ApplyTrustloginTokenExAsync(ApplyTrustloginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTrustloginTokenResponse>(await DoRequestAsync("1.0", "antcloud.iam.trustlogin.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方会员免密登录token校验，与数科官网token不通用
         * Summary: 三方会员免密登录token校验
         */
        public VerifyTrustloginTokenResponse VerifyTrustloginToken(VerifyTrustloginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyTrustloginTokenEx(request, headers, runtime);
        }

        /**
         * Description: 三方会员免密登录token校验，与数科官网token不通用
         * Summary: 三方会员免密登录token校验
         */
        public async Task<VerifyTrustloginTokenResponse> VerifyTrustloginTokenAsync(VerifyTrustloginTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyTrustloginTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方会员免密登录token校验，与数科官网token不通用
         * Summary: 三方会员免密登录token校验
         */
        public VerifyTrustloginTokenResponse VerifyTrustloginTokenEx(VerifyTrustloginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyTrustloginTokenResponse>(DoRequest("1.0", "antcloud.iam.trustlogin.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方会员免密登录token校验，与数科官网token不通用
         * Summary: 三方会员免密登录token校验
         */
        public async Task<VerifyTrustloginTokenResponse> VerifyTrustloginTokenExAsync(VerifyTrustloginTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyTrustloginTokenResponse>(await DoRequestAsync("1.0", "antcloud.iam.trustlogin.token.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
