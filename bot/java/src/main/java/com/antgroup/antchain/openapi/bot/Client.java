// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.bot.models.*;
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
                    new TeaPair("sdk_version", "1.5.25")
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
     * Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务
     */
    public QueryBaiOcrResponse queryBaiOcr(QueryBaiOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaiOcrEx(request, headers, runtime);
    }

    /**
     * Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务
     */
    public QueryBaiOcrResponse queryBaiOcrEx(QueryBaiOcrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.bai.ocr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaiOcrResponse());
    }

    /**
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备
     */
    public QueryIotplatformPurchaseorderResponse queryIotplatformPurchaseorder(QueryIotplatformPurchaseorderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotplatformPurchaseorderEx(request, headers, runtime);
    }

    /**
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备
     */
    public QueryIotplatformPurchaseorderResponse queryIotplatformPurchaseorderEx(QueryIotplatformPurchaseorderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplatform.purchaseorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotplatformPurchaseorderResponse());
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN
     */
    public ImportIotplatformMeshidResponse importIotplatformMeshid(ImportIotplatformMeshidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIotplatformMeshidEx(request, headers, runtime);
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN
     */
    public ImportIotplatformMeshidResponse importIotplatformMeshidEx(ImportIotplatformMeshidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplatform.meshid.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIotplatformMeshidResponse());
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型
     */
    public CreateDeviceDatamodelResponse createDeviceDatamodel(CreateDeviceDatamodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeviceDatamodelEx(request, headers, runtime);
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型
     */
    public CreateDeviceDatamodelResponse createDeviceDatamodelEx(CreateDeviceDatamodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.datamodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeviceDatamodelResponse());
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型
     */
    public GetDeviceDatamodelResponse getDeviceDatamodel(GetDeviceDatamodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceDatamodelEx(request, headers, runtime);
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型
     */
    public GetDeviceDatamodelResponse getDeviceDatamodelEx(GetDeviceDatamodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.datamodel.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceDatamodelResponse());
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备
     */
    public ImportDeviceResponse importDevice(ImportDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备
     */
    public ImportDeviceResponse importDeviceEx(ImportDeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDeviceResponse());
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情
     */
    public GetDeviceBychainidResponse getDeviceBychainid(GetDeviceBychainidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceBychainidEx(request, headers, runtime);
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情
     */
    public GetDeviceBychainidResponse getDeviceBychainidEx(GetDeviceBychainidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.bychainid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceBychainidResponse());
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情
     */
    public GetDeviceBydeviceidResponse getDeviceBydeviceid(GetDeviceBydeviceidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情
     */
    public GetDeviceBydeviceidResponse getDeviceBydeviceidEx(GetDeviceBydeviceidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.bydeviceid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceBydeviceidResponse());
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备
     */
    public ListDeviceBysceneResponse listDeviceByscene(ListDeviceBysceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeviceBysceneEx(request, headers, runtime);
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备
     */
    public ListDeviceBysceneResponse listDeviceBysceneEx(ListDeviceBysceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDeviceBysceneResponse());
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息
     */
    public UpdateDeviceInfoResponse updateDeviceInfo(UpdateDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceInfoEx(request, headers, runtime);
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息
     */
    public UpdateDeviceInfoResponse updateDeviceInfoEx(UpdateDeviceInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeviceInfoResponse());
    }

    /**
     * Description: 通过deviceId发行设备
     * Summary: 通过deviceId发行设备
     */
    public CreateDistributedeviceBydeviceidResponse createDistributedeviceBydeviceid(CreateDistributedeviceBydeviceidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * Description: 通过deviceId发行设备
     * Summary: 通过deviceId发行设备
     */
    public CreateDistributedeviceBydeviceidResponse createDistributedeviceBydeviceidEx(CreateDistributedeviceBydeviceidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydeviceidResponse());
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行
     */
    public CreateDistributedeviceBychainidResponse createDistributedeviceBychainid(CreateDistributedeviceBychainidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行
     */
    public CreateDistributedeviceBychainidResponse createDistributedeviceBychainidEx(CreateDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBychainidResponse());
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备
     */
    public ReplaceDistributedeviceBychainidResponse replaceDistributedeviceBychainid(ReplaceDistributedeviceBychainidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备
     */
    public ReplaceDistributedeviceBychainidResponse replaceDistributedeviceBychainidEx(ReplaceDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDistributedeviceBychainidResponse());
    }

    /**
     * Description: 上传单个设备所产生的设备数据 
     * Summary: 上传设备数据
     */
    public SendCollectorBychainidResponse sendCollectorBychainid(SendCollectorBychainidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorBychainidEx(request, headers, runtime);
    }

    /**
     * Description: 上传单个设备所产生的设备数据 
     * Summary: 上传设备数据
     */
    public SendCollectorBychainidResponse sendCollectorBychainidEx(SendCollectorBychainidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.bychainid.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorBychainidResponse());
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备
     */
    public GetDistributedeviceBychainidResponse getDistributedeviceBychainid(GetDistributedeviceBychainidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备
     */
    public GetDistributedeviceBychainidResponse getDistributedeviceBychainidEx(GetDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBychainidResponse());
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备
     */
    public ListDistributedeviceBysceneResponse listDistributedeviceByscene(ListDistributedeviceBysceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributedeviceBysceneEx(request, headers, runtime);
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备
     */
    public ListDistributedeviceBysceneResponse listDistributedeviceBysceneEx(ListDistributedeviceBysceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributedeviceBysceneResponse());
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者
     */
    public CreateConsumerResponse createConsumer(CreateConsumerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerEx(request, headers, runtime);
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者
     */
    public CreateConsumerResponse createConsumerEx(CreateConsumerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumerResponse());
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅
     */
    public SetConsumerSubscribeResponse setConsumerSubscribe(SetConsumerSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumerSubscribeEx(request, headers, runtime);
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅
     */
    public SetConsumerSubscribeResponse setConsumerSubscribeEx(SetConsumerSubscribeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.subscribe.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumerSubscribeResponse());
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备
     */
    public SetConsumerUnsubscribeResponse setConsumerUnsubscribe(SetConsumerUnsubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumerUnsubscribeEx(request, headers, runtime);
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备
     */
    public SetConsumerUnsubscribeResponse setConsumerUnsubscribeEx(SetConsumerUnsubscribeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.unsubscribe.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumerUnsubscribeResponse());
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据
     */
    public PullConsumerDatasourceResponse pullConsumerDatasource(PullConsumerDatasourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullConsumerDatasourceEx(request, headers, runtime);
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据
     */
    public PullConsumerDatasourceResponse pullConsumerDatasourceEx(PullConsumerDatasourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.datasource.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullConsumerDatasourceResponse());
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情
     */
    public GetDistributedeviceBydeviceidResponse getDistributedeviceBydeviceid(GetDistributedeviceBydeviceidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情
     */
    public GetDistributedeviceBydeviceidResponse getDistributedeviceBydeviceidEx(GetDistributedeviceBydeviceidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBydeviceidResponse());
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备
     */
    public GetDistributedeviceBydisidResponse getDistributedeviceBydisid(GetDistributedeviceBydisidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBydisidEx(request, headers, runtime);
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备
     */
    public GetDistributedeviceBydisidResponse getDistributedeviceBydisidEx(GetDistributedeviceBydisidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydisid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBydisidResponse());
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备
     */
    public ImportPeripheralResponse importPeripheral(ImportPeripheralRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importPeripheralEx(request, headers, runtime);
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备
     */
    public ImportPeripheralResponse importPeripheralEx(ImportPeripheralRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportPeripheralResponse());
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情
     */
    public GetPeripheralBychainperipheralidResponse getPeripheralBychainperipheralid(GetPeripheralBychainperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPeripheralBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情
     */
    public GetPeripheralBychainperipheralidResponse getPeripheralBychainperipheralidEx(GetPeripheralBychainperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.bychainperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPeripheralBychainperipheralidResponse());
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情
     */
    public GetPeripheralByperipheralidResponse getPeripheralByperipheralid(GetPeripheralByperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPeripheralByperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情
     */
    public GetPeripheralByperipheralidResponse getPeripheralByperipheralidEx(GetPeripheralByperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.byperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPeripheralByperipheralidResponse());
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备
     */
    public ListPeripheralBysceneResponse listPeripheralByscene(ListPeripheralBysceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPeripheralBysceneEx(request, headers, runtime);
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备
     */
    public ListPeripheralBysceneResponse listPeripheralBysceneEx(ListPeripheralBysceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListPeripheralBysceneResponse());
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行
     */
    public CreateDistributedeviceByperipheralidResponse createDistributedeviceByperipheralid(CreateDistributedeviceByperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceByperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行
     */
    public CreateDistributedeviceByperipheralidResponse createDistributedeviceByperipheralidEx(CreateDistributedeviceByperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceByperipheralidResponse());
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行
     */
    public CreateDistributedeviceBychainperipheralidResponse createDistributedeviceBychainperipheralid(CreateDistributedeviceBychainperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行
     */
    public CreateDistributedeviceBychainperipheralidResponse createDistributedeviceBychainperipheralidEx(CreateDistributedeviceBychainperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBychainperipheralidResponse());
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID
     */
    public ReplaceDistributedeviceBychainperipheralidResponse replaceDistributedeviceBychainperipheralid(ReplaceDistributedeviceBychainperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDistributedeviceBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID
     */
    public ReplaceDistributedeviceBychainperipheralidResponse replaceDistributedeviceBychainperipheralidEx(ReplaceDistributedeviceBychainperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDistributedeviceBychainperipheralidResponse());
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备
     */
    public ListDistributedeviceByperipheralsceneResponse listDistributedeviceByperipheralscene(ListDistributedeviceByperipheralsceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributedeviceByperipheralsceneEx(request, headers, runtime);
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备
     */
    public ListDistributedeviceByperipheralsceneResponse listDistributedeviceByperipheralsceneEx(ListDistributedeviceByperipheralsceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributedeviceByperipheralsceneResponse());
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息
     */
    public GetDistributedeviceByperipheralidResponse getDistributedeviceByperipheralid(GetDistributedeviceByperipheralidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceByperipheralidEx(request, headers, runtime);
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息
     */
    public GetDistributedeviceByperipheralidResponse getDistributedeviceByperipheralidEx(GetDistributedeviceByperipheralidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceByperipheralidResponse());
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie
     */
    public CreateDistributedeviceBydeviceResponse createDistributedeviceBydevice(CreateDistributedeviceBydeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydeviceEx(request, headers, runtime);
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie
     */
    public CreateDistributedeviceBydeviceResponse createDistributedeviceBydeviceEx(CreateDistributedeviceBydeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydevice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydeviceResponse());
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskEx(request, headers, runtime);
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建
     */
    public CreateTaskResponse createTaskEx(CreateTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTaskResponse());
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询
     */
    public QueryTaskResponse queryTask(QueryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTaskEx(request, headers, runtime);
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询
     */
    public QueryTaskResponse queryTaskEx(QueryTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTaskResponse());
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询
     */
    public QueryAnalysisResponse queryAnalysis(QueryAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAnalysisEx(request, headers, runtime);
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询
     */
    public QueryAnalysisResponse queryAnalysisEx(QueryAnalysisRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.analysis.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAnalysisResponse());
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul
     */
    public SendCollectorBychainidmulResponse sendCollectorBychainidmul(SendCollectorBychainidmulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorBychainidmulEx(request, headers, runtime);
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul
     */
    public SendCollectorBychainidmulResponse sendCollectorBychainidmulEx(SendCollectorBychainidmulRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.bychainidmul.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorBychainidmulResponse());
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据
     */
    public SendCollectorDevicebizdataResponse sendCollectorDevicebizdata(SendCollectorDevicebizdataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorDevicebizdataEx(request, headers, runtime);
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据
     */
    public SendCollectorDevicebizdataResponse sendCollectorDevicebizdataEx(SendCollectorDevicebizdataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.devicebizdata.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorDevicebizdataResponse());
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie
     */
    public UpdateDeviceInfobydeviceResponse updateDeviceInfobydevice(UpdateDeviceInfobydeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceInfobydeviceEx(request, headers, runtime);
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie
     */
    public UpdateDeviceInfobydeviceResponse updateDeviceInfobydeviceEx(UpdateDeviceInfobydeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.infobydevice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeviceInfobydeviceResponse());
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备
     */
    public OfflineDeviceResponse offlineDevice(OfflineDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备
     */
    public OfflineDeviceResponse offlineDeviceEx(OfflineDeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineDeviceResponse());
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token
     */
    public ApplyMqtokenResponse applyMqtoken(ApplyMqtokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyMqtokenEx(request, headers, runtime);
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token
     */
    public ApplyMqtokenResponse applyMqtokenEx(ApplyMqtokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.mqtoken.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyMqtokenResponse());
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息
     */
    public QueryDeviceRegistrationResponse queryDeviceRegistration(QueryDeviceRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceRegistrationEx(request, headers, runtime);
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息
     */
    public QueryDeviceRegistrationResponse queryDeviceRegistrationEx(QueryDeviceRegistrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceRegistrationResponse());
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报
     */
    public AddAbnormalResponse addAbnormal(AddAbnormalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAbnormalEx(request, headers, runtime);
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报
     */
    public AddAbnormalResponse addAbnormalEx(AddAbnormalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.abnormal.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAbnormalResponse());
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     */
    public OnlineDeviceResponse onlineDevice(OnlineDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     */
    public OnlineDeviceResponse onlineDeviceEx(OnlineDeviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineDeviceResponse());
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备
     */
    public OfflineDeviceByunregisterResponse offlineDeviceByunregister(OfflineDeviceByunregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineDeviceByunregisterEx(request, headers, runtime);
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备
     */
    public OfflineDeviceByunregisterResponse offlineDeviceByunregisterEx(OfflineDeviceByunregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.byunregister.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineDeviceByunregisterResponse());
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询
     */
    public QueryLabelTraceResponse queryLabelTrace(QueryLabelTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLabelTraceEx(request, headers, runtime);
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询
     */
    public QueryLabelTraceResponse queryLabelTraceEx(QueryLabelTraceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.trace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLabelTraceResponse());
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步
     */
    public SyncLabelTransferResponse syncLabelTransfer(SyncLabelTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLabelTransferEx(request, headers, runtime);
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步
     */
    public SyncLabelTransferResponse syncLabelTransferEx(SyncLabelTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.transfer.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLabelTransferResponse());
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定
     */
    public AddLabelAssetResponse addLabelAsset(AddLabelAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLabelAssetEx(request, headers, runtime);
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定
     */
    public AddLabelAssetResponse addLabelAssetEx(AddLabelAssetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.asset.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddLabelAssetResponse());
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询
     */
    public QueryDataBytxhashResponse queryDataBytxhash(QueryDataBytxhashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataBytxhashEx(request, headers, runtime);
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询
     */
    public QueryDataBytxhashResponse queryDataBytxhashEx(QueryDataBytxhashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.data.bytxhash.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataBytxhashResponse());
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     */
    public ExecUnprocessedTaskResponse execUnprocessedTask(ExecUnprocessedTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execUnprocessedTaskEx(request, headers, runtime);
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     */
    public ExecUnprocessedTaskResponse execUnprocessedTaskEx(ExecUnprocessedTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.unprocessed.task.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecUnprocessedTaskResponse());
    }

    /**
     * Description: 上传汇总数据
     * Summary: 上传汇总数据
     */
    public SendCollectorSummarydataResponse sendCollectorSummarydata(SendCollectorSummarydataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorSummarydataEx(request, headers, runtime);
    }

    /**
     * Description: 上传汇总数据
     * Summary: 上传汇总数据
     */
    public SendCollectorSummarydataResponse sendCollectorSummarydataEx(SendCollectorSummarydataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.summarydata.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorSummarydataResponse());
    }

    /**
     * Description: 根据请求体内容保存密钥
     * Summary: 保存公钥
     */
    public AddCertificateResponse addCertificate(AddCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCertificateEx(request, headers, runtime);
    }

    /**
     * Description: 根据请求体内容保存密钥
     * Summary: 保存公钥
     */
    public AddCertificateResponse addCertificateEx(AddCertificateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.certificate.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCertificateResponse());
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi
     */
    public ExecThingsdidOneapiResponse execThingsdidOneapi(ExecThingsdidOneapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execThingsdidOneapiEx(request, headers, runtime);
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi
     */
    public ExecThingsdidOneapiResponse execThingsdidOneapiEx(ExecThingsdidOneapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.oneapi.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecThingsdidOneapiResponse());
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     */
    public StartEvidenceStoreResponse startEvidenceStore(StartEvidenceStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startEvidenceStoreEx(request, headers, runtime);
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     */
    public StartEvidenceStoreResponse startEvidenceStoreEx(StartEvidenceStoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.evidence.store.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartEvidenceStoreResponse());
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询
     */
    public StartEvidenceQueryResponse startEvidenceQuery(StartEvidenceQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startEvidenceQueryEx(request, headers, runtime);
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询
     */
    public StartEvidenceQueryResponse startEvidenceQueryEx(StartEvidenceQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.evidence.query.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartEvidenceQueryResponse());
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册
     */
    public StartThingsdidRegisterResponse startThingsdidRegister(StartThingsdidRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startThingsdidRegisterEx(request, headers, runtime);
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册
     */
    public StartThingsdidRegisterResponse startThingsdidRegisterEx(StartThingsdidRegisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.register.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartThingsdidRegisterResponse());
    }

    /**
     * Description: 信物链异步操作查询
    智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询
     */
    public QueryThingsdidAsyncprocessResponse queryThingsdidAsyncprocess(QueryThingsdidAsyncprocessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingsdidAsyncprocessEx(request, headers, runtime);
    }

    /**
     * Description: 信物链异步操作查询
    智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询
     */
    public QueryThingsdidAsyncprocessResponse queryThingsdidAsyncprocessEx(QueryThingsdidAsyncprocessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.asyncprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingsdidAsyncprocessResponse());
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新
     */
    public UpdateThingsdidStatusResponse updateThingsdidStatus(UpdateThingsdidStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidStatusEx(request, headers, runtime);
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新
     */
    public UpdateThingsdidStatusResponse updateThingsdidStatusEx(UpdateThingsdidStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidStatusResponse());
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新
     */
    public UpdateThingsdidDevicespaceResponse updateThingsdidDevicespace(UpdateThingsdidDevicespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidDevicespaceEx(request, headers, runtime);
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新
     */
    public UpdateThingsdidDevicespaceResponse updateThingsdidDevicespaceEx(UpdateThingsdidDevicespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.devicespace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidDevicespaceResponse());
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询
     */
    public QueryThingsdidDidResponse queryThingsdidDid(QueryThingsdidDidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingsdidDidEx(request, headers, runtime);
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询
     */
    public QueryThingsdidDidResponse queryThingsdidDidEx(QueryThingsdidDidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.did.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingsdidDidResponse());
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新
     */
    public UpdateThingsdidDidResponse updateThingsdidDid(UpdateThingsdidDidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidDidEx(request, headers, runtime);
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新
     */
    public UpdateThingsdidDidResponse updateThingsdidDidEx(UpdateThingsdidDidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.did.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidDidResponse());
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联
     */
    public StartTenantBindinfoResponse startTenantBindinfo(StartTenantBindinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTenantBindinfoEx(request, headers, runtime);
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联
     */
    public StartTenantBindinfoResponse startTenantBindinfoEx(StartTenantBindinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.bindinfo.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartTenantBindinfoResponse());
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建
     */
    public CreateTenantProjectResponse createTenantProject(CreateTenantProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantProjectEx(request, headers, runtime);
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建
     */
    public CreateTenantProjectResponse createTenantProjectEx(CreateTenantProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTenantProjectResponse());
    }

    /**
     * Description: 信物链实体访问权限更新
    所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新
     */
    public UpdateThingsdidTenantResponse updateThingsdidTenant(UpdateThingsdidTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidTenantEx(request, headers, runtime);
    }

    /**
     * Description: 信物链实体访问权限更新
    所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新
     */
    public UpdateThingsdidTenantResponse updateThingsdidTenantEx(UpdateThingsdidTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.tenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidTenantResponse());
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用 
     */
    public LoadTsmCertificatetsmResponse loadTsmCertificatetsm(LoadTsmCertificatetsmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadTsmCertificatetsmEx(request, headers, runtime);
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用 
     */
    public LoadTsmCertificatetsmResponse loadTsmCertificatetsmEx(LoadTsmCertificatetsmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tsm.certificatetsm.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadTsmCertificatetsmResponse());
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile
     */
    public LoadTsmResourcefileResponse loadTsmResourcefile(LoadTsmResourcefileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadTsmResourcefileEx(request, headers, runtime);
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile
     */
    public LoadTsmResourcefileResponse loadTsmResourcefileEx(LoadTsmResourcefileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tsm.resourcefile.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadTsmResourcefileResponse());
    }
}
