// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.nftx.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Number _readTimeout;
    public Number _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Number _maxIdleConns;
    public String _securityToken;
    public Number _maxIdleTimeMillis;
    public Number _keepAliveDurationMillis;
    public Number _maxRequests;
    public Number _maxRequestsPerHost;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = com.aliyun.teautil.Common.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = com.aliyun.teautil.Common.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = com.aliyun.teautil.Common.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = com.aliyun.teautil.Common.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = com.aliyun.teautil.Common.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = com.aliyun.teautil.Common.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = com.aliyun.teautil.Common.defaultNumber(config.maxRequestsPerHost, 100);
    }

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
            new TeaPair("maxRequests", _maxRequests),
            new TeaPair("maxRequestsPerHost", _maxRequestsPerHost),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.4.5")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "openapi.antchain.antgroup.com")),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                    ),
                    headers
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.AntchainUtils.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
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
    public ImportNftCreateResponse importNftCreate(ImportNftCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importNftCreateEx(request, headers, runtime);
    }

    /**
     * Description: B端商户的NFT发行以及铸造
     * Summary: B端商户的NFT铸造 (废弃)
     */
    public ImportNftCreateResponse importNftCreateEx(ImportNftCreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.create.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportNftCreateResponse());
    }

    /**
     * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
     * Summary: B端商户的NFT发行铸造后查询
     */
    public QueryNftCreateResponse queryNftCreate(QueryNftCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNftCreateEx(request, headers, runtime);
    }

    /**
     * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
     * Summary: B端商户的NFT发行铸造后查询
     */
    public QueryNftCreateResponse queryNftCreateEx(QueryNftCreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.create.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNftCreateResponse());
    }

    /**
     * Description: 按商品编码（skuid）B2C发放NFT
     * Summary: 按商品编码B2C发放NFT
     */
    public ExecNftTransferResponse execNftTransfer(ExecNftTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: 按商品编码（skuid）B2C发放NFT
     * Summary: 按商品编码B2C发放NFT
     */
    public ExecNftTransferResponse execNftTransferEx(ExecNftTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecNftTransferResponse());
    }

    /**
     * Description: 按项目表编码B2C发放NFT
     * Summary: 按项目表编码B2C发放NFT
     */
    public SendNftTransferResponse sendNftTransfer(SendNftTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT
     * Summary: 按项目表编码B2C发放NFT
     */
    public SendNftTransferResponse sendNftTransferEx(SendNftTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.transfer.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendNftTransferResponse());
    }

    /**
     * Description: 根据nftId查询客户NFT资产
     * Summary: 根据nftId查询客户NFT资产
     */
    public QueryNftCustomerResponse queryNftCustomer(QueryNftCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNftCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 根据nftId查询客户NFT资产
     * Summary: 根据nftId查询客户NFT资产
     */
    public QueryNftCustomerResponse queryNftCustomerEx(QueryNftCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.customer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNftCustomerResponse());
    }

    /**
     * Description: 根据外部订单号查询该订单的NFT流水记录
     * Summary: 根据外部订单号查询该订单的NFT流水记录
     */
    public QueryNftOrderResponse queryNftOrder(QueryNftOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNftOrderEx(request, headers, runtime);
    }

    /**
     * Description: 根据外部订单号查询该订单的NFT流水记录
     * Summary: 根据外部订单号查询该订单的NFT流水记录
     */
    public QueryNftOrderResponse queryNftOrderEx(QueryNftOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNftOrderResponse());
    }

    /**
     * Description: NFT发行审核&铸造
     * Summary: NFT发行审核&铸造
     */
    public CreateNftIssuerResponse createNftIssuer(CreateNftIssuerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNftIssuerEx(request, headers, runtime);
    }

    /**
     * Description: NFT发行审核&铸造
     * Summary: NFT发行审核&铸造
     */
    public CreateNftIssuerResponse createNftIssuerEx(CreateNftIssuerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.issuer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNftIssuerResponse());
    }

    /**
     * Description: B端用户资产列表查询
     * Summary: 用户资产列表查询
     */
    public PagequeryNftCustomerResponse pagequeryNftCustomer(PagequeryNftCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryNftCustomerEx(request, headers, runtime);
    }

    /**
     * Description: B端用户资产列表查询
     * Summary: 用户资产列表查询
     */
    public PagequeryNftCustomerResponse pagequeryNftCustomerEx(PagequeryNftCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryNftCustomerResponse());
    }

    /**
     * Description: NFT铸造, 带监制方和渠道租户
     * Summary: NFT铸造, 带监制方和渠道租户
     */
    public CreateNftPublishResponse createNftPublish(CreateNftPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNftPublishEx(request, headers, runtime);
    }

    /**
     * Description: NFT铸造, 带监制方和渠道租户
     * Summary: NFT铸造, 带监制方和渠道租户
     */
    public CreateNftPublishResponse createNftPublishEx(CreateNftPublishRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.publish.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNftPublishResponse());
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT, (废弃)
     */
    public RunNftTransferResponse runNftTransfer(RunNftTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT, (废弃)
     */
    public RunNftTransferResponse runNftTransferEx(RunNftTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.transfer.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunNftTransferResponse());
    }

    /**
     * Description: 按商品编码B2C发放NFT 带渠道租户
     * Summary: 按商品编码B2C发放NFT 带渠道租户
     */
    public ApplyNftTransferResponse applyNftTransfer(ApplyNftTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: 按商品编码B2C发放NFT 带渠道租户
     * Summary: 按商品编码B2C发放NFT 带渠道租户
     */
    public ApplyNftTransferResponse applyNftTransferEx(ApplyNftTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyNftTransferResponse());
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT,带渠道租户
     */
    public ApplyNftTransferbyprojectwithchanneltenantResponse applyNftTransferbyprojectwithchanneltenant(ApplyNftTransferbyprojectwithchanneltenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyNftTransferbyprojectwithchanneltenantEx(request, headers, runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT,带渠道租户
     */
    public ApplyNftTransferbyprojectwithchanneltenantResponse applyNftTransferbyprojectwithchanneltenantEx(ApplyNftTransferbyprojectwithchanneltenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftx.nft.transferbyprojectwithchanneltenant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyNftTransferbyprojectwithchanneltenantResponse());
    }
}
