// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.mq.models.*;
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
                    new TeaPair("sdk_version", "3.8.22")
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
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public StatusMqMessageUndeliveryResponse statusMqMessageUndelivery(StatusMqMessageUndeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusMqMessageUndeliveryEx(request, headers, runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public StatusMqMessageUndeliveryResponse statusMqMessageUndeliveryEx(StatusMqMessageUndeliveryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "mq.message.undelivery.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusMqMessageUndeliveryResponse());
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public UndeliverMessageStatusResponse undeliverMessageStatus(UndeliverMessageStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.undeliverMessageStatusEx(request, headers, runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public UndeliverMessageStatusResponse undeliverMessageStatusEx(UndeliverMessageStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.message.status.undeliver", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UndeliverMessageStatusResponse());
    }

    /**
     * Description: Add a message type.
     * Summary: add a message type
     */
    public AddMsgtypeResponse addMsgtype(AddMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: Add a message type.
     * Summary: add a message type
     */
    public AddMsgtypeResponse addMsgtypeEx(AddMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.msgtype.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddMsgtypeResponse());
    }

    /**
     * Description: Update a message type.
     * Summary: update a message type
     */
    public UpdateMsgtypeResponse updateMsgtype(UpdateMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: Update a message type.
     * Summary: update a message type
     */
    public UpdateMsgtypeResponse updateMsgtypeEx(UpdateMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.msgtype.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMsgtypeResponse());
    }

    /**
     * Description: Delete a message type.
     * Summary: delete a message type
     */
    public DeleteMsgtypeResponse deleteMsgtype(DeleteMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: Delete a message type.
     * Summary: delete a message type
     */
    public DeleteMsgtypeResponse deleteMsgtypeEx(DeleteMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.msgtype.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMsgtypeResponse());
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type
     */
    public QueryMsgtypeResponse queryMsgtype(QueryMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type
     */
    public QueryMsgtypeResponse queryMsgtypeEx(QueryMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.msgtype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMsgtypeResponse());
    }

    /**
     * Description: Add a binding.
     * Summary: add a binding
     */
    public AddBindingResponse addBinding(AddBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBindingEx(request, headers, runtime);
    }

    /**
     * Description: Add a binding.
     * Summary: add a binding
     */
    public AddBindingResponse addBindingEx(AddBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.binding.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBindingResponse());
    }

    /**
     * Description: Update a binding.
     * Summary: update a binding
     */
    public UpdateBindingResponse updateBinding(UpdateBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBindingEx(request, headers, runtime);
    }

    /**
     * Description: Update a binding.
     * Summary: update a binding
     */
    public UpdateBindingResponse updateBindingEx(UpdateBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.binding.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBindingResponse());
    }

    /**
     * Description: Delete a binding.
     * Summary: delete a binding
     */
    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBindingEx(request, headers, runtime);
    }

    /**
     * Description: Delete a binding.
     * Summary: delete a binding
     */
    public DeleteBindingResponse deleteBindingEx(DeleteBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.binding.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBindingResponse());
    }

    /**
     * Description: Query the collection of binding.
     * Summary: query the collection of binding
     */
    public QueryBindingResponse queryBinding(QueryBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBindingEx(request, headers, runtime);
    }

    /**
     * Description: Query the collection of binding.
     * Summary: query the collection of binding
     */
    public QueryBindingResponse queryBindingEx(QueryBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.binding.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBindingResponse());
    }

    /**
     * Description: Queue switchover execute.
     * Summary: Queue switchover execute
     */
    public ExecuteSwitchoverResponse executeSwitchover(ExecuteSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: Queue switchover execute.
     * Summary: Queue switchover execute
     */
    public ExecuteSwitchoverResponse executeSwitchoverEx(ExecuteSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.switchover.execute", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecuteSwitchoverResponse());
    }

    /**
     * Description: Queue switchover cancel.
     * Summary: Queue switchover cancel
     */
    public CancelSwitchoverResponse cancelSwitchover(CancelSwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: Queue switchover cancel.
     * Summary: Queue switchover cancel
     */
    public CancelSwitchoverResponse cancelSwitchoverEx(CancelSwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.switchover.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSwitchoverResponse());
    }

    /**
     * Description: Queue switchover query.
     * Summary: Queue switchover query
     */
    public QuerySwitchoverResponse querySwitchover(QuerySwitchoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySwitchoverEx(request, headers, runtime);
    }

    /**
     * Description: Queue switchover query.
     * Summary: Queue switchover query
     */
    public QuerySwitchoverResponse querySwitchoverEx(QuerySwitchoverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "sofa.mq.switchover.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySwitchoverResponse());
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type
     */
    public GetMsgtypeResponse getMsgtype(GetMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type
     */
    public GetMsgtypeResponse getMsgtypeEx(GetMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgtype.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMsgtypeResponse());
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public UndeliveryMessageStatusResponse undeliveryMessageStatus(UndeliveryMessageStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.undeliveryMessageStatusEx(request, headers, runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status
     */
    public UndeliveryMessageStatusResponse undeliveryMessageStatusEx(UndeliveryMessageStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.message.status.undelivery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UndeliveryMessageStatusResponse());
    }

    /**
     * Description: query topics
     * Summary: query topics
     */
    public QueryTopicsResponse queryTopics(QueryTopicsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTopicsEx(request, headers, runtime);
    }

    /**
     * Description: query topics
     * Summary: query topics
     */
    public QueryTopicsResponse queryTopicsEx(QueryTopicsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.topics.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTopicsResponse());
    }

    /**
     * Description: query topic
     * Summary: query topic
     */
    public IdTopicQueryResponse idTopicQuery(IdTopicQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.idTopicQueryEx(request, headers, runtime);
    }

    /**
     * Description: query topic
     * Summary: query topic
     */
    public IdTopicQueryResponse idTopicQueryEx(IdTopicQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.topic.query.id", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IdTopicQueryResponse());
    }

    /**
     * Description: add topic
     * Summary: add topic
     */
    public AddTopicResponse addTopic(AddTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTopicEx(request, headers, runtime);
    }

    /**
     * Description: add topic
     * Summary: add topic
     */
    public AddTopicResponse addTopicEx(AddTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.topic.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTopicResponse());
    }

    /**
     * Description: update topic
     * Summary: update topic
     */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTopicEx(request, headers, runtime);
    }

    /**
     * Description: update topic
     * Summary: update topic
     */
    public UpdateTopicResponse updateTopicEx(UpdateTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.topic.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTopicResponse());
    }

    /**
     * Description: delete topic
     * Summary: delete topic
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTopicEx(request, headers, runtime);
    }

    /**
     * Description: delete topic
     * Summary: delete topic
     */
    public DeleteTopicResponse deleteTopicEx(DeleteTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.topic.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTopicResponse());
    }

    /**
     * Description: query bindings
     * Summary: query bindings
     */
    public QueryBindingsResponse queryBindings(QueryBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBindingsEx(request, headers, runtime);
    }

    /**
     * Description: query bindings
     * Summary: query bindings
     */
    public QueryBindingsResponse queryBindingsEx(QueryBindingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.bindings.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBindingsResponse());
    }

    /**
     * Description: query binding
     * Summary: query binding
     */
    public IdBindingQueryResponse idBindingQuery(IdBindingQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.idBindingQueryEx(request, headers, runtime);
    }

    /**
     * Description: query binding
     * Summary: query binding
     */
    public IdBindingQueryResponse idBindingQueryEx(IdBindingQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.binding.query.id", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IdBindingQueryResponse());
    }

    /**
     * Description: 查询指定实例下 Topic 的信息列表。
     * Summary: 查询Topic列表
     */
    public ListSofamqTopicResponse listSofamqTopic(ListSofamqTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqTopicEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定实例下 Topic 的信息列表。
     * Summary: 查询Topic列表
     */
    public ListSofamqTopicResponse listSofamqTopicEx(ListSofamqTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topic.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqTopicResponse());
    }

    /**
     * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
     * Summary: 创建Topic
     */
    public CreateSofamqTopicResponse createSofamqTopic(CreateSofamqTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqTopicEx(request, headers, runtime);
    }

    /**
     * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
     * Summary: 创建Topic
     */
    public CreateSofamqTopicResponse createSofamqTopicEx(CreateSofamqTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topic.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqTopicResponse());
    }

    /**
     * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
     * Summary: 删除Topic
     */
    public DeleteSofamqTopicResponse deleteSofamqTopic(DeleteSofamqTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqTopicEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
     * Summary: 删除Topic
     */
    public DeleteSofamqTopicResponse deleteSofamqTopicEx(DeleteSofamqTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topic.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqTopicResponse());
    }

    /**
     * Description: 更新指定 Topic 的读写权限配置。
     * Summary: 更新Topic读写权限
     */
    public UpdateSofamqTopicResponse updateSofamqTopic(UpdateSofamqTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqTopicEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定 Topic 的读写权限配置。
     * Summary: 更新Topic读写权限
     */
    public UpdateSofamqTopicResponse updateSofamqTopicEx(UpdateSofamqTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topic.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqTopicResponse());
    }

    /**
     * Description: sofamq list instance
     * Summary: sofamq list instance
     */
    public ListSofamqInstanceResponse listSofamqInstance(ListSofamqInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqInstanceEx(request, headers, runtime);
    }

    /**
     * Description: sofamq list instance
     * Summary: sofamq list instance
     */
    public ListSofamqInstanceResponse listSofamqInstanceEx(ListSofamqInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.instance.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqInstanceResponse());
    }

    /**
     * Description: sofamq instance create
     * Summary: instance create
     */
    public CreateSofamqInstanceResponse createSofamqInstance(CreateSofamqInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqInstanceEx(request, headers, runtime);
    }

    /**
     * Description: sofamq instance create
     * Summary: instance create
     */
    public CreateSofamqInstanceResponse createSofamqInstanceEx(CreateSofamqInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.instance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqInstanceResponse());
    }

    /**
     * Description: instance delete
     * Summary: instance delete
     */
    public DeleteSofamqInstanceResponse deleteSofamqInstance(DeleteSofamqInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqInstanceEx(request, headers, runtime);
    }

    /**
     * Description: instance delete
     * Summary: instance delete
     */
    public DeleteSofamqInstanceResponse deleteSofamqInstanceEx(DeleteSofamqInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.instance.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqInstanceResponse());
    }

    /**
     * Description: 使用 InstanceUpdate 更新实例名称和描述
     * Summary: instance update
     */
    public UpdateSofamqInstanceResponse updateSofamqInstance(UpdateSofamqInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 使用 InstanceUpdate 更新实例名称和描述
     * Summary: instance update
     */
    public UpdateSofamqInstanceResponse updateSofamqInstanceEx(UpdateSofamqInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.instance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqInstanceResponse());
    }

    /**
     * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
     * Summary: 创建Group
     */
    public CreateSofamqGroupResponse createSofamqGroup(CreateSofamqGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqGroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
     * Summary: 创建Group
     */
    public CreateSofamqGroupResponse createSofamqGroupEx(CreateSofamqGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.group.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqGroupResponse());
    }

    /**
     * Description: 查询指定环境实例下 Group ID 资源的信息列表。
     * Summary: 查询Group列表
     */
    public ListSofamqGroupResponse listSofamqGroup(ListSofamqGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqGroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定环境实例下 Group ID 资源的信息列表。
     * Summary: 查询Group列表
     */
    public ListSofamqGroupResponse listSofamqGroupEx(ListSofamqGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.group.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqGroupResponse());
    }

    /**
     * Description: 删除指定的 Group。
     * Summary: 删除Group
     */
    public DeleteSofamqGroupResponse deleteSofamqGroup(DeleteSofamqGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqGroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定的 Group。
     * Summary: 删除Group
     */
    public DeleteSofamqGroupResponse deleteSofamqGroupEx(DeleteSofamqGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.group.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqGroupResponse());
    }

    /**
     * Description: 更新指定 Group 的读权限配置。
     * Summary: 更新Group读权限
     */
    public UpdateSofamqGroupResponse updateSofamqGroup(UpdateSofamqGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqGroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定 Group 的读权限配置。
     * Summary: 更新Group读权限
     */
    public UpdateSofamqGroupResponse updateSofamqGroupEx(UpdateSofamqGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.group.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqGroupResponse());
    }

    /**
     * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
     * Summary: 查询Topic状态
     */
    public QuerySofamqTopicstatusResponse querySofamqTopicstatus(QuerySofamqTopicstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTopicstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
     * Summary: 查询Topic状态
     */
    public QuerySofamqTopicstatusResponse querySofamqTopicstatusEx(QuerySofamqTopicstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topicstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTopicstatusResponse());
    }

    /**
     * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
     * Summary: 查看在线订阅组
     */
    public QuerySofamqTopicsubdetailResponse querySofamqTopicsubdetail(QuerySofamqTopicsubdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTopicsubdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
     * Summary: 查看在线订阅组
     */
    public QuerySofamqTopicsubdetailResponse querySofamqTopicsubdetailEx(QuerySofamqTopicsubdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topicsubdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTopicsubdetailResponse());
    }

    /**
     * Description: node list
     * Summary: node list
     */
    public ListSofamqNodeResponse listSofamqNode(ListSofamqNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqNodeEx(request, headers, runtime);
    }

    /**
     * Description: node list
     * Summary: node list
     */
    public ListSofamqNodeResponse listSofamqNodeEx(ListSofamqNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.node.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqNodeResponse());
    }

    /**
     * Description: create node
     * Summary: create node
     */
    public CreateSofamqNodeResponse createSofamqNode(CreateSofamqNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqNodeEx(request, headers, runtime);
    }

    /**
     * Description: create node
     * Summary: create node
     */
    public CreateSofamqNodeResponse createSofamqNodeEx(CreateSofamqNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.node.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqNodeResponse());
    }

    /**
     * Description: room create
     * Summary: room create
     */
    public CreateSofamqRoomResponse createSofamqRoom(CreateSofamqRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqRoomEx(request, headers, runtime);
    }

    /**
     * Description: room create
     * Summary: room create
     */
    public CreateSofamqRoomResponse createSofamqRoomEx(CreateSofamqRoomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.room.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqRoomResponse());
    }

    /**
     * Description: create cell
     * Summary: create cell
     */
    public CreateSofamqCellResponse createSofamqCell(CreateSofamqCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqCellEx(request, headers, runtime);
    }

    /**
     * Description: create cell
     * Summary: create cell
     */
    public CreateSofamqCellResponse createSofamqCellEx(CreateSofamqCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cell.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqCellResponse());
    }

    /**
     * Description: create cluster
     * Summary: create cluster
     */
    public CreateSofamqClusterResponse createSofamqCluster(CreateSofamqClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqClusterEx(request, headers, runtime);
    }

    /**
     * Description: create cluster
     * Summary: create cluster
     */
    public CreateSofamqClusterResponse createSofamqClusterEx(CreateSofamqClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cluster.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqClusterResponse());
    }

    /**
     * Description: create namespace
     * Summary: create namespace
     */
    public CreateSofamqNamespaceResponse createSofamqNamespace(CreateSofamqNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: create namespace
     * Summary: create namespace
     */
    public CreateSofamqNamespaceResponse createSofamqNamespaceEx(CreateSofamqNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.namespace.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqNamespaceResponse());
    }

    /**
     * Description: room list
     * Summary: room list
     */
    public ListSofamqRoomResponse listSofamqRoom(ListSofamqRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqRoomEx(request, headers, runtime);
    }

    /**
     * Description: room list
     * Summary: room list
     */
    public ListSofamqRoomResponse listSofamqRoomEx(ListSofamqRoomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.room.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqRoomResponse());
    }

    /**
     * Description: 查询cell列表
     * Summary: 查询cell列表
     */
    public ListSofamqCellResponse listSofamqCell(ListSofamqCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqCellEx(request, headers, runtime);
    }

    /**
     * Description: 查询cell列表
     * Summary: 查询cell列表
     */
    public ListSofamqCellResponse listSofamqCellEx(ListSofamqCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cell.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqCellResponse());
    }

    /**
     * Description: list cluster
     * Summary: list cluster
     */
    public ListSofamqClusterResponse listSofamqCluster(ListSofamqClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqClusterEx(request, headers, runtime);
    }

    /**
     * Description: list cluster
     * Summary: list cluster
     */
    public ListSofamqClusterResponse listSofamqClusterEx(ListSofamqClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cluster.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqClusterResponse());
    }

    /**
     * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
     * Summary: 查看在线订阅组
     */
    public QuerySofamqGroupsubdetailResponse querySofamqGroupsubdetail(QuerySofamqGroupsubdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqGroupsubdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
     * Summary: 查看在线订阅组
     */
    public QuerySofamqGroupsubdetailResponse querySofamqGroupsubdetailEx(QuerySofamqGroupsubdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.groupsubdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqGroupsubdetailResponse());
    }

    /**
     * Description: 查询实例基本信息和收发消息的接入点
     * Summary: 查询实例基本信息
     */
    public GetSofamqInstancebaseinfoResponse getSofamqInstancebaseinfo(GetSofamqInstancebaseinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqInstancebaseinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询实例基本信息和收发消息的接入点
     * Summary: 查询实例基本信息
     */
    public GetSofamqInstancebaseinfoResponse getSofamqInstancebaseinfoEx(GetSofamqInstancebaseinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.instancebaseinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqInstancebaseinfoResponse());
    }

    /**
     * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
     * Summary: 重置消费位点
     */
    public ExecSofamqConsumerresetoffsetResponse execSofamqConsumerresetoffset(ExecSofamqConsumerresetoffsetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSofamqConsumerresetoffsetEx(request, headers, runtime);
    }

    /**
     * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
     * Summary: 重置消费位点
     */
    public ExecSofamqConsumerresetoffsetResponse execSofamqConsumerresetoffsetEx(ExecSofamqConsumerresetoffsetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumerresetoffset.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSofamqConsumerresetoffsetResponse());
    }

    /**
     * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
     * Summary: 消费者堆积查询
     */
    public QuerySofamqConsumeraccumulateResponse querySofamqConsumeraccumulate(QuerySofamqConsumeraccumulateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConsumeraccumulateEx(request, headers, runtime);
    }

    /**
     * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
     * Summary: 消费者堆积查询
     */
    public QuerySofamqConsumeraccumulateResponse querySofamqConsumeraccumulateEx(QuerySofamqConsumeraccumulateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumeraccumulate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConsumeraccumulateResponse());
    }

    /**
     * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
     * Summary: 查询指定当前客户端的连接情况。
     */
    public QuerySofamqConsumerconnectionResponse querySofamqConsumerconnection(QuerySofamqConsumerconnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConsumerconnectionEx(request, headers, runtime);
    }

    /**
     * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
     * Summary: 查询指定当前客户端的连接情况。
     */
    public QuerySofamqConsumerconnectionResponse querySofamqConsumerconnectionEx(QuerySofamqConsumerconnectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumerconnection.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConsumerconnectionResponse());
    }

    /**
     * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
     * Summary: 查询时间跨度
     */
    public QuerySofamqConsumertimespanResponse querySofamqConsumertimespan(QuerySofamqConsumertimespanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConsumertimespanEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
     * Summary: 查询时间跨度
     */
    public QuerySofamqConsumertimespanResponse querySofamqConsumertimespanEx(QuerySofamqConsumertimespanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumertimespan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConsumertimespanResponse());
    }

    /**
     * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
     * Summary: 判断目标消息是否曾被消费过
     */
    public QuerySofamqMessagetraceResponse querySofamqMessagetrace(QuerySofamqMessagetraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqMessagetraceEx(request, headers, runtime);
    }

    /**
     * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
     * Summary: 判断目标消息是否曾被消费过
     */
    public QuerySofamqMessagetraceResponse querySofamqMessagetraceEx(QuerySofamqMessagetraceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.messagetrace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqMessagetraceResponse());
    }

    /**
     * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
     * Summary: 按Message ID查询消息
     */
    public GetSofamqMessagebymsgidResponse getSofamqMessagebymsgid(GetSofamqMessagebymsgidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqMessagebymsgidEx(request, headers, runtime);
    }

    /**
     * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
     * Summary: 按Message ID查询消息
     */
    public GetSofamqMessagebymsgidResponse getSofamqMessagebymsgidEx(GetSofamqMessagebymsgidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.messagebymsgid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqMessagebymsgidResponse());
    }

    /**
     * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
     * Summary: 按Message Key查询消息
     */
    public QuerySofamqMessagebykeyResponse querySofamqMessagebykey(QuerySofamqMessagebykeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqMessagebykeyEx(request, headers, runtime);
    }

    /**
     * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
     * Summary: 按Message Key查询消息
     */
    public QuerySofamqMessagebykeyResponse querySofamqMessagebykeyEx(QuerySofamqMessagebykeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.messagebykey.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqMessagebykeyResponse());
    }

    /**
     * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
     * Summary: 通过MsgId创建轨迹查询任务
     */
    public GetSofamqTracebymsgidResponse getSofamqTracebymsgid(GetSofamqTracebymsgidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqTracebymsgidEx(request, headers, runtime);
    }

    /**
     * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
     * Summary: 通过MsgId创建轨迹查询任务
     */
    public GetSofamqTracebymsgidResponse getSofamqTracebymsgidEx(GetSofamqTracebymsgidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.tracebymsgid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqTracebymsgidResponse());
    }

    /**
     * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
     * Summary: 通过MsgKey创建轨迹查询任务
     */
    public QuerySofamqTracebymsgkeyResponse querySofamqTracebymsgkey(QuerySofamqTracebymsgkeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTracebymsgkeyEx(request, headers, runtime);
    }

    /**
     * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
     * Summary: 通过MsgKey创建轨迹查询任务
     */
    public QuerySofamqTracebymsgkeyResponse querySofamqTracebymsgkeyEx(QuerySofamqTracebymsgkeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.tracebymsgkey.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTracebymsgkeyResponse());
    }

    /**
     * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
     * Summary: 获取轨迹查询结果
     */
    public GetSofamqTraceresultResponse getSofamqTraceresult(GetSofamqTraceresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqTraceresultEx(request, headers, runtime);
    }

    /**
     * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
     * Summary: 获取轨迹查询结果
     */
    public GetSofamqTraceresultResponse getSofamqTraceresultEx(GetSofamqTraceresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.traceresult.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqTraceresultResponse());
    }

    /**
     * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
     * Summary: 查询一段时间写入报表数据
     */
    public QuerySofamqInputtpsResponse querySofamqInputtps(QuerySofamqInputtpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqInputtpsEx(request, headers, runtime);
    }

    /**
     * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
     * Summary: 查询一段时间写入报表数据
     */
    public QuerySofamqInputtpsResponse querySofamqInputtpsEx(QuerySofamqInputtpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.inputtps.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqInputtpsResponse());
    }

    /**
     * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
    
    消费消息总量的统计曲线
    消费消息 TPS 的统计曲线
     * Summary: 查询一段时间内消费消息统计信息
     */
    public QuerySofamqOutputtpsResponse querySofamqOutputtps(QuerySofamqOutputtpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqOutputtpsEx(request, headers, runtime);
    }

    /**
     * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
    
    消费消息总量的统计曲线
    消费消息 TPS 的统计曲线
     * Summary: 查询一段时间内消费消息统计信息
     */
    public QuerySofamqOutputtpsResponse querySofamqOutputtpsEx(QuerySofamqOutputtpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.outputtps.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqOutputtpsResponse());
    }

    /**
     * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
     * Summary: 按Message ID查询死信消息
     */
    public GetSofamqDlqbyidResponse getSofamqDlqbyid(GetSofamqDlqbyidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqDlqbyidEx(request, headers, runtime);
    }

    /**
     * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
     * Summary: 按Message ID查询死信消息
     */
    public GetSofamqDlqbyidResponse getSofamqDlqbyidEx(GetSofamqDlqbyidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.dlqbyid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqDlqbyidResponse());
    }

    /**
     * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
    
    死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
     * Summary: 重新发送死信消息
     */
    public ExecSofamqDlqresendbyidResponse execSofamqDlqresendbyid(ExecSofamqDlqresendbyidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSofamqDlqresendbyidEx(request, headers, runtime);
    }

    /**
     * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
    
    死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
     * Summary: 重新发送死信消息
     */
    public ExecSofamqDlqresendbyidResponse execSofamqDlqresendbyidEx(ExecSofamqDlqresendbyidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.dlqresendbyid.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSofamqDlqresendbyidResponse());
    }

    /**
     * Description: list ns
     * Summary: list ns
     */
    public ListSofamqNamespaceResponse listSofamqNamespace(ListSofamqNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: list ns
     * Summary: list ns
     */
    public ListSofamqNamespaceResponse listSofamqNamespaceEx(ListSofamqNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.namespace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqNamespaceResponse());
    }

    /**
     * Description: 发送测试消息
     * Summary: 发送测试信息
     */
    public SendSofamqMessageResponse sendSofamqMessage(SendSofamqMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSofamqMessageEx(request, headers, runtime);
    }

    /**
     * Description: 发送测试消息
     * Summary: 发送测试信息
     */
    public SendSofamqMessageResponse sendSofamqMessageEx(SendSofamqMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.message.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendSofamqMessageResponse());
    }

    /**
     * Description: 消费验证
     * Summary: 消费验证
     */
    public PushSofamqMessageResponse pushSofamqMessage(PushSofamqMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushSofamqMessageEx(request, headers, runtime);
    }

    /**
     * Description: 消费验证
     * Summary: 消费验证
     */
    public PushSofamqMessageResponse pushSofamqMessageEx(PushSofamqMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.message.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushSofamqMessageResponse());
    }

    /**
     * Description: getNodesByNamespaceId
     * Summary: get nodes by ns id
     */
    public QuerySofamqNodebynamespaceidResponse querySofamqNodebynamespaceid(QuerySofamqNodebynamespaceidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqNodebynamespaceidEx(request, headers, runtime);
    }

    /**
     * Description: getNodesByNamespaceId
     * Summary: get nodes by ns id
     */
    public QuerySofamqNodebynamespaceidResponse querySofamqNodebynamespaceidEx(QuerySofamqNodebynamespaceidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.nodebynamespaceid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqNodebynamespaceidResponse());
    }

    /**
     * Description: query room by ns
     * Summary: query room by ns
     */
    public QuerySofamqRoombynamespaceidResponse querySofamqRoombynamespaceid(QuerySofamqRoombynamespaceidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqRoombynamespaceidEx(request, headers, runtime);
    }

    /**
     * Description: query room by ns
     * Summary: query room by ns
     */
    public QuerySofamqRoombynamespaceidResponse querySofamqRoombynamespaceidEx(QuerySofamqRoombynamespaceidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.roombynamespaceid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqRoombynamespaceidResponse());
    }

    /**
     * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
     * Summary: 按Topic查询消息
     */
    public QuerySofamqMessagebytopicResponse querySofamqMessagebytopic(QuerySofamqMessagebytopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqMessagebytopicEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
     * Summary: 按Topic查询消息
     */
    public QuerySofamqMessagebytopicResponse querySofamqMessagebytopicEx(QuerySofamqMessagebytopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.messagebytopic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqMessagebytopicResponse());
    }

    /**
     * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
     * Summary: 按Group ID查询死信消息
     */
    public QuerySofamqDlqbygroupidResponse querySofamqDlqbygroupid(QuerySofamqDlqbygroupidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqDlqbygroupidEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
     * Summary: 按Group ID查询死信消息
     */
    public QuerySofamqDlqbygroupidResponse querySofamqDlqbygroupidEx(QuerySofamqDlqbygroupidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.dlqbygroupid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqDlqbygroupidResponse());
    }

    /**
     * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
     * Summary: 查询消费状态
     */
    public GetSofamqConsumerstatusResponse getSofamqConsumerstatus(GetSofamqConsumerstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqConsumerstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
     * Summary: 查询消费状态
     */
    public GetSofamqConsumerstatusResponse getSofamqConsumerstatusEx(GetSofamqConsumerstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumerstatus.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqConsumerstatusResponse());
    }

    /**
     * Description: 更新指定 Topic 的描述信息。
     * Summary: 更新Topic的描述
     */
    public UpdateSofamqTopicremarkResponse updateSofamqTopicremark(UpdateSofamqTopicremarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqTopicremarkEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定 Topic 的描述信息。
     * Summary: 更新Topic的描述
     */
    public UpdateSofamqTopicremarkResponse updateSofamqTopicremarkEx(UpdateSofamqTopicremarkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topicremark.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqTopicremarkResponse());
    }

    /**
     * Description: datacenter list
     * Summary: datacenter
     */
    public CreateSofamqDatacenterResponse createSofamqDatacenter(CreateSofamqDatacenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqDatacenterEx(request, headers, runtime);
    }

    /**
     * Description: datacenter list
     * Summary: datacenter
     */
    public CreateSofamqDatacenterResponse createSofamqDatacenterEx(CreateSofamqDatacenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.datacenter.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqDatacenterResponse());
    }

    /**
     * Description: datacenter list
     * Summary: datacenter list
     */
    public ListSofamqDatacenterResponse listSofamqDatacenter(ListSofamqDatacenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqDatacenterEx(request, headers, runtime);
    }

    /**
     * Description: datacenter list
     * Summary: datacenter list
     */
    public ListSofamqDatacenterResponse listSofamqDatacenterEx(ListSofamqDatacenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.datacenter.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqDatacenterResponse());
    }

    /**
     * Description: config list
     * Summary: config list
     */
    public ListSofamqConfigResponse listSofamqConfig(ListSofamqConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqConfigEx(request, headers, runtime);
    }

    /**
     * Description: config list
     * Summary: config list
     */
    public ListSofamqConfigResponse listSofamqConfigEx(ListSofamqConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.config.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqConfigResponse());
    }

    /**
     * Description: 更新指定 Group 的描述信息。
     * Summary: 更新Group的描述
     */
    public UpdateSofamqGroupremarkResponse updateSofamqGroupremark(UpdateSofamqGroupremarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqGroupremarkEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定 Group 的描述信息。
     * Summary: 更新Group的描述
     */
    public UpdateSofamqGroupremarkResponse updateSofamqGroupremarkEx(UpdateSofamqGroupremarkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.groupremark.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqGroupremarkResponse());
    }

    /**
     * Description: 下载消息
     * Summary: 下载消息
     */
    public DownloadSofamqMessageResponse downloadSofamqMessage(DownloadSofamqMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadSofamqMessageEx(request, headers, runtime);
    }

    /**
     * Description: 下载消息
     * Summary: 下载消息
     */
    public DownloadSofamqMessageResponse downloadSofamqMessageEx(DownloadSofamqMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.message.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadSofamqMessageResponse());
    }

    /**
     * Description: 获取指定或全部的 Topic 资源监控统计信息。
     * Summary: 获取 topic 统计信息
     */
    public QueryMetricsTopicResponse queryMetricsTopic(QueryMetricsTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsTopicEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定或全部的 Topic 资源监控统计信息。
     * Summary: 获取 topic 统计信息
     */
    public QueryMetricsTopicResponse queryMetricsTopicEx(QueryMetricsTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.topic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsTopicResponse());
    }

    /**
     * Description: 查询指定时间范围内的积压数据。
     * Summary: 查看积压数据
     */
    public QueryMetricsBacklogResponse queryMetricsBacklog(QueryMetricsBacklogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsBacklogEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定时间范围内的积压数据。
     * Summary: 查看积压数据
     */
    public QueryMetricsBacklogResponse queryMetricsBacklogEx(QueryMetricsBacklogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.backlog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsBacklogResponse());
    }

    /**
     * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
     * Summary: 监控数据概览
     */
    public QueryMetricsOverviewResponse queryMetricsOverview(QueryMetricsOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsOverviewEx(request, headers, runtime);
    }

    /**
     * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
     * Summary: 监控数据概览
     */
    public QueryMetricsOverviewResponse queryMetricsOverviewEx(QueryMetricsOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.overview.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsOverviewResponse());
    }

    /**
     * Description: 查询消息路由列表信息。
     * Summary: 查询路由列表
     */
    public ListSofamqRouterResponse listSofamqRouter(ListSofamqRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqRouterEx(request, headers, runtime);
    }

    /**
     * Description: 查询消息路由列表信息。
     * Summary: 查询路由列表
     */
    public ListSofamqRouterResponse listSofamqRouterEx(ListSofamqRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.router.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqRouterResponse());
    }

    /**
     * Description: 创建一个消息路由任务。
     * Summary: 创建路由
     */
    public CreateSofamqRouterResponse createSofamqRouter(CreateSofamqRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqRouterEx(request, headers, runtime);
    }

    /**
     * Description: 创建一个消息路由任务。
     * Summary: 创建路由
     */
    public CreateSofamqRouterResponse createSofamqRouterEx(CreateSofamqRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.router.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqRouterResponse());
    }

    /**
     * Description: delete node
     * Summary: delete node
     */
    public DeleteSofamqNodeResponse deleteSofamqNode(DeleteSofamqNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqNodeEx(request, headers, runtime);
    }

    /**
     * Description: delete node
     * Summary: delete node
     */
    public DeleteSofamqNodeResponse deleteSofamqNodeEx(DeleteSofamqNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.node.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqNodeResponse());
    }

    /**
     * Description: delete room
     * Summary: delete room
     */
    public DeleteSofamqRoomResponse deleteSofamqRoom(DeleteSofamqRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqRoomEx(request, headers, runtime);
    }

    /**
     * Description: delete room
     * Summary: delete room
     */
    public DeleteSofamqRoomResponse deleteSofamqRoomEx(DeleteSofamqRoomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.room.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqRoomResponse());
    }

    /**
     * Description: del cell
     * Summary: del cell
     */
    public DeleteSofamqCellResponse deleteSofamqCell(DeleteSofamqCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqCellEx(request, headers, runtime);
    }

    /**
     * Description: del cell
     * Summary: del cell
     */
    public DeleteSofamqCellResponse deleteSofamqCellEx(DeleteSofamqCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cell.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqCellResponse());
    }

    /**
     * Description: del cluster
     * Summary: del cluster
     */
    public DeleteSofamqClusterResponse deleteSofamqCluster(DeleteSofamqClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqClusterEx(request, headers, runtime);
    }

    /**
     * Description: del cluster
     * Summary: del cluster
     */
    public DeleteSofamqClusterResponse deleteSofamqClusterEx(DeleteSofamqClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cluster.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqClusterResponse());
    }

    /**
     * Description: del ns
     * Summary: del ns
     */
    public DeleteSofamqNamespaceResponse deleteSofamqNamespace(DeleteSofamqNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqNamespaceEx(request, headers, runtime);
    }

    /**
     * Description: del ns
     * Summary: del ns
     */
    public DeleteSofamqNamespaceResponse deleteSofamqNamespaceEx(DeleteSofamqNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.namespace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqNamespaceResponse());
    }

    /**
     * Description: del dc
     * Summary: del dc
     */
    public DeleteSofamqDatacenterResponse deleteSofamqDatacenter(DeleteSofamqDatacenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqDatacenterEx(request, headers, runtime);
    }

    /**
     * Description: del dc
     * Summary: del dc
     */
    public DeleteSofamqDatacenterResponse deleteSofamqDatacenterEx(DeleteSofamqDatacenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.datacenter.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqDatacenterResponse());
    }

    /**
     * Description: 删除指定的消息路由任务。
     * Summary: 删除路由
     */
    public DeleteSofamqRouterResponse deleteSofamqRouter(DeleteSofamqRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqRouterEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定的消息路由任务。
     * Summary: 删除路由
     */
    public DeleteSofamqRouterResponse deleteSofamqRouterEx(DeleteSofamqRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.router.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqRouterResponse());
    }

    /**
     * Description: create config
     * Summary: create config
     */
    public CreateSofamqConfigResponse createSofamqConfig(CreateSofamqConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqConfigEx(request, headers, runtime);
    }

    /**
     * Description: create config
     * Summary: create config
     */
    public CreateSofamqConfigResponse createSofamqConfigEx(CreateSofamqConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.config.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqConfigResponse());
    }

    /**
     * Description: query cells
     * Summary: query cells
     */
    public QuerySofamqCellResponse querySofamqCell(QuerySofamqCellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqCellEx(request, headers, runtime);
    }

    /**
     * Description: query cells
     * Summary: query cells
     */
    public QuerySofamqCellResponse querySofamqCellEx(QuerySofamqCellRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cell.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqCellResponse());
    }

    /**
     * Description: 查询路由
     * Summary: 查询路由
     */
    public QuerySofamqRouterResponse querySofamqRouter(QuerySofamqRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqRouterEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由
     * Summary: 查询路由
     */
    public QuerySofamqRouterResponse querySofamqRouterEx(QuerySofamqRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.router.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqRouterResponse());
    }

    /**
     * Description: get instance
     * Summary: get instance
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstance(GetMiddlewareInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMiddlewareInstanceEx(request, headers, runtime);
    }

    /**
     * Description: get instance
     * Summary: get instance
     */
    public GetMiddlewareInstanceResponse getMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.middleware.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMiddlewareInstanceResponse());
    }

    /**
     * Description: get endpoint
     * Summary: get endpoint
     */
    public GetMiddlewareEndpointResponse getMiddlewareEndpoint(GetMiddlewareEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMiddlewareEndpointEx(request, headers, runtime);
    }

    /**
     * Description: get endpoint
     * Summary: get endpoint
     */
    public GetMiddlewareEndpointResponse getMiddlewareEndpointEx(GetMiddlewareEndpointRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.middleware.endpoint.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMiddlewareEndpointResponse());
    }

    /**
     * Description: cellbytype
     * Summary: cellbytype
     */
    public QuerySofamqCellbytypeResponse querySofamqCellbytype(QuerySofamqCellbytypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqCellbytypeEx(request, headers, runtime);
    }

    /**
     * Description: cellbytype
     * Summary: cellbytype
     */
    public QuerySofamqCellbytypeResponse querySofamqCellbytypeEx(QuerySofamqCellbytypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cellbytype.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqCellbytypeResponse());
    }

    /**
     * Description: 查询指定实例下的消息轨迹查询任务列表信息。
     * Summary: 查询trace请求列表
     */
    public ListSofamqTraceResponse listSofamqTrace(ListSofamqTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqTraceEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定实例下的消息轨迹查询任务列表信息。
     * Summary: 查询trace请求列表
     */
    public ListSofamqTraceResponse listSofamqTraceEx(ListSofamqTraceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.trace.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqTraceResponse());
    }

    /**
     * Description: 删除指定的消息轨迹查询任务。
     * Summary: 删除trace查询任务
     */
    public DeleteSofamqTraceResponse deleteSofamqTrace(DeleteSofamqTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqTraceEx(request, headers, runtime);
    }

    /**
     * Description: 删除指定的消息轨迹查询任务。
     * Summary: 删除trace查询任务
     */
    public DeleteSofamqTraceResponse deleteSofamqTraceEx(DeleteSofamqTraceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.trace.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqTraceResponse());
    }

    /**
     * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
     * Summary: 通过Topic创建轨迹查询任务
     */
    public QuerySofamqTracebytopicResponse querySofamqTracebytopic(QuerySofamqTracebytopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTracebytopicEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
     * Summary: 通过Topic创建轨迹查询任务
     */
    public QuerySofamqTracebytopicResponse querySofamqTracebytopicEx(QuerySofamqTracebytopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.tracebytopic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTracebytopicResponse());
    }

    /**
     * Description: sofamq 支付后回调
     * Summary: sofamq 支付后回调
     */
    public PushSpiPaycallbackResponse pushSpiPaycallback(PushSpiPaycallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushSpiPaycallbackEx(request, headers, runtime);
    }

    /**
     * Description: sofamq 支付后回调
     * Summary: sofamq 支付后回调
     */
    public PushSpiPaycallbackResponse pushSpiPaycallbackEx(PushSpiPaycallbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.spi.paycallback.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushSpiPaycallbackResponse());
    }

    /**
     * Description: 补全商品信息
     * Summary: 补全商品信息
     */
    public PushSpiCompletecommodityResponse pushSpiCompletecommodity(PushSpiCompletecommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushSpiCompletecommodityEx(request, headers, runtime);
    }

    /**
     * Description: 补全商品信息
     * Summary: 补全商品信息
     */
    public PushSpiCompletecommodityResponse pushSpiCompletecommodityEx(PushSpiCompletecommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.spi.completecommodity.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushSpiCompletecommodityResponse());
    }

    /**
     * Description: 订单校验
     * Summary: 订单校验
     */
    public PushSpiOrderverifyResponse pushSpiOrderverify(PushSpiOrderverifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushSpiOrderverifyEx(request, headers, runtime);
    }

    /**
     * Description: 订单校验
     * Summary: 订单校验
     */
    public PushSpiOrderverifyResponse pushSpiOrderverifyEx(PushSpiOrderverifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.spi.orderverify.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushSpiOrderverifyResponse());
    }

    /**
     * Description: 生命周期回调
     * Summary: 生命周期回调
     */
    public PushSpiOpencallbackResponse pushSpiOpencallback(PushSpiOpencallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushSpiOpencallbackEx(request, headers, runtime);
    }

    /**
     * Description: 生命周期回调
     * Summary: 生命周期回调
     */
    public PushSpiOpencallbackResponse pushSpiOpencallbackEx(PushSpiOpencallbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.spi.opencallback.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushSpiOpencallbackResponse());
    }

    /**
     * Description: getldcbynamespace
     * Summary: getldcbynamespace
     */
    public GetSofamqLdcbynamespaceResponse getSofamqLdcbynamespace(GetSofamqLdcbynamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqLdcbynamespaceEx(request, headers, runtime);
    }

    /**
     * Description: getldcbynamespace
     * Summary: getldcbynamespace
     */
    public GetSofamqLdcbynamespaceResponse getSofamqLdcbynamespaceEx(GetSofamqLdcbynamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.ldcbynamespace.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqLdcbynamespaceResponse());
    }

    /**
     * Description: 更新指定的消息路由任务的配置信息。
     * Summary: 更新路由配置
     */
    public UpdateSofamqRouterResponse updateSofamqRouter(UpdateSofamqRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqRouterEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定的消息路由任务的配置信息。
     * Summary: 更新路由配置
     */
    public UpdateSofamqRouterResponse updateSofamqRouterEx(UpdateSofamqRouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.router.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqRouterResponse());
    }

    /**
     * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
     * Summary: 批量重发死信消息
     */
    public ExecSofamqDlqresendbatchResponse execSofamqDlqresendbatch(ExecSofamqDlqresendbatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSofamqDlqresendbatchEx(request, headers, runtime);
    }

    /**
     * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
     * Summary: 批量重发死信消息
     */
    public ExecSofamqDlqresendbatchResponse execSofamqDlqresendbatchEx(ExecSofamqDlqresendbatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.dlqresendbatch.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSofamqDlqresendbatchResponse());
    }

    /**
     * Description: 获取报警规则列表信息。
     * Summary: 获取告警列表
     */
    public ListSofamqWarnResponse listSofamqWarn(ListSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 获取报警规则列表信息。
     * Summary: 获取告警列表
     */
    public ListSofamqWarnResponse listSofamqWarnEx(ListSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqWarnResponse());
    }

    /**
     * Description: 创建一条报警规则。
     * Summary: 创建告警规则
     */
    public CreateSofamqWarnResponse createSofamqWarn(CreateSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 创建一条报警规则。
     * Summary: 创建告警规则
     */
    public CreateSofamqWarnResponse createSofamqWarnEx(CreateSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqWarnResponse());
    }

    /**
     * Description: 通过传入报警规则 ID，删除指定的报警规则。
     * Summary: 删除告警规则
     */
    public DeleteSofamqWarnResponse deleteSofamqWarn(DeleteSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，删除指定的报警规则。
     * Summary: 删除告警规则
     */
    public DeleteSofamqWarnResponse deleteSofamqWarnEx(DeleteSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqWarnResponse());
    }

    /**
     * Description: 更新指定报警规则的配置信息。
     * Summary: 更新告警规则
     */
    public UpdateSofamqWarnResponse updateSofamqWarn(UpdateSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 更新指定报警规则的配置信息。
     * Summary: 更新告警规则
     */
    public UpdateSofamqWarnResponse updateSofamqWarnEx(UpdateSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqWarnResponse());
    }

    /**
     * Description: 通过传入报警规则 ID，启用指定的报警规则。
     * Summary: 打开告警开关
     */
    public EnableSofamqWarnResponse enableSofamqWarn(EnableSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，启用指定的报警规则。
     * Summary: 打开告警开关
     */
    public EnableSofamqWarnResponse enableSofamqWarnEx(EnableSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSofamqWarnResponse());
    }

    /**
     * Description: 通过传入报警规则 ID，禁用指定的报警规则。
     * Summary: 关闭告警开关
     */
    public DisableSofamqWarnResponse disableSofamqWarn(DisableSofamqWarnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSofamqWarnEx(request, headers, runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，禁用指定的报警规则。
     * Summary: 关闭告警开关
     */
    public DisableSofamqWarnResponse disableSofamqWarnEx(DisableSofamqWarnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warn.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSofamqWarnResponse());
    }

    /**
     * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
     * Summary: 查询告警日志
     */
    public ListSofamqWarnlogResponse listSofamqWarnlog(ListSofamqWarnlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqWarnlogEx(request, headers, runtime);
    }

    /**
     * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
     * Summary: 查询告警日志
     */
    public ListSofamqWarnlogResponse listSofamqWarnlogEx(ListSofamqWarnlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.warnlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqWarnlogResponse());
    }

    /**
     * Description: 管理员查看topic
     * Summary: 管理员查看topic
     */
    public ListSofamqAdmintopicResponse listSofamqAdmintopic(ListSofamqAdmintopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqAdmintopicEx(request, headers, runtime);
    }

    /**
     * Description: 管理员查看topic
     * Summary: 管理员查看topic
     */
    public ListSofamqAdmintopicResponse listSofamqAdmintopicEx(ListSofamqAdmintopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admintopic.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqAdmintopicResponse());
    }

    /**
     * Description: 查询 Topic、Group 实时的发送消费速度。
     * Summary: topicgroup实时的发送消费速度
     */
    public QueryMetricsTginstantResponse queryMetricsTginstant(QueryMetricsTginstantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsTginstantEx(request, headers, runtime);
    }

    /**
     * Description: 查询 Topic、Group 实时的发送消费速度。
     * Summary: topicgroup实时的发送消费速度
     */
    public QueryMetricsTginstantResponse queryMetricsTginstantEx(QueryMetricsTginstantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.tginstant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsTginstantResponse());
    }

    /**
     * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
     * Summary: 获取 topic、group 的历史数据
     */
    public QueryMetricsTghistoryResponse queryMetricsTghistory(QueryMetricsTghistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsTghistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
     * Summary: 获取 topic、group 的历史数据
     */
    public QueryMetricsTghistoryResponse queryMetricsTghistoryEx(QueryMetricsTghistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.tghistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsTghistoryResponse());
    }

    /**
     * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
     * Summary: 获取实例的基本信息
     */
    public QueryMetricsInstanceResponse queryMetricsInstance(QueryMetricsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
     * Summary: 获取实例的基本信息
     */
    public QueryMetricsInstanceResponse queryMetricsInstanceEx(QueryMetricsInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.instance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsInstanceResponse());
    }

    /**
     * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
     * Summary: 获取实例的历史统计数据
     */
    public QueryMetricsInstancehistoryResponse queryMetricsInstancehistory(QueryMetricsInstancehistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMetricsInstancehistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
     * Summary: 获取实例的历史统计数据
     */
    public QueryMetricsInstancehistoryResponse queryMetricsInstancehistoryEx(QueryMetricsInstancehistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.metrics.instancehistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMetricsInstancehistoryResponse());
    }

    /**
     * Description: 查询指定实例下 Topic 的统计列表信息。
     * Summary: 查询 topic 统计列表
     */
    public QueryStatsTopicResponse queryStatsTopic(QueryStatsTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStatsTopicEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定实例下 Topic 的统计列表信息。
     * Summary: 查询 topic 统计列表
     */
    public QueryStatsTopicResponse queryStatsTopicEx(QueryStatsTopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.stats.topic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStatsTopicResponse());
    }

    /**
     * Description: 获取指定实例下 Group 的统计信息。
     * Summary: 获取当前实例的 group 统计信息
     */
    public QueryStatsGroupResponse queryStatsGroup(QueryStatsGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStatsGroupEx(request, headers, runtime);
    }

    /**
     * Description: 获取指定实例下 Group 的统计信息。
     * Summary: 获取当前实例的 group 统计信息
     */
    public QueryStatsGroupResponse queryStatsGroupEx(QueryStatsGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.stats.group.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStatsGroupResponse());
    }

    /**
     * Description: 管理员查看group
     * Summary: 管理员查看group
     */
    public ListSofamqAdmingroupResponse listSofamqAdmingroup(ListSofamqAdmingroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqAdmingroupEx(request, headers, runtime);
    }

    /**
     * Description: 管理员查看group
     * Summary: 管理员查看group
     */
    public ListSofamqAdmingroupResponse listSofamqAdmingroupEx(ListSofamqAdmingroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admingroup.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqAdmingroupResponse());
    }

    /**
     * Description: 查询kv配置
     * Summary: 查询kv配置
     */
    public ListSofamqKvconfigResponse listSofamqKvconfig(ListSofamqKvconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqKvconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询kv配置
     * Summary: 查询kv配置
     */
    public ListSofamqKvconfigResponse listSofamqKvconfigEx(ListSofamqKvconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqKvconfigResponse());
    }

    /**
     * Description: 创建kvconfig
     * Summary: 创建kvconfig
     */
    public CreateSofamqKvconfigResponse createSofamqKvconfig(CreateSofamqKvconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqKvconfigEx(request, headers, runtime);
    }

    /**
     * Description: 创建kvconfig
     * Summary: 创建kvconfig
     */
    public CreateSofamqKvconfigResponse createSofamqKvconfigEx(CreateSofamqKvconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqKvconfigResponse());
    }

    /**
     * Description: 删除kvconfig
     * Summary: 删除kvconfig
     */
    public DeleteSofamqKvconfigResponse deleteSofamqKvconfig(DeleteSofamqKvconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqKvconfigEx(request, headers, runtime);
    }

    /**
     * Description: 删除kvconfig
     * Summary: 删除kvconfig
     */
    public DeleteSofamqKvconfigResponse deleteSofamqKvconfigEx(DeleteSofamqKvconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqKvconfigResponse());
    }

    /**
     * Description: 修改kvconfig值
     * Summary: 修改kvconfig值
     */
    public UpdateSofamqKvconfigResponse updateSofamqKvconfig(UpdateSofamqKvconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqKvconfigEx(request, headers, runtime);
    }

    /**
     * Description: 修改kvconfig值
     * Summary: 修改kvconfig值
     */
    public UpdateSofamqKvconfigResponse updateSofamqKvconfigEx(UpdateSofamqKvconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqKvconfigResponse());
    }

    /**
     * Description: 删除config配置
     * Summary: 删除config配置
     */
    public DeleteSofamqConfigResponse deleteSofamqConfig(DeleteSofamqConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqConfigEx(request, headers, runtime);
    }

    /**
     * Description: 删除config配置
     * Summary: 删除config配置
     */
    public DeleteSofamqConfigResponse deleteSofamqConfigEx(DeleteSofamqConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.config.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqConfigResponse());
    }

    /**
     * Description: 更新config配置
     * Summary: 更新config配置
     */
    public UpdateSofamqConfigResponse updateSofamqConfig(UpdateSofamqConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqConfigEx(request, headers, runtime);
    }

    /**
     * Description: 更新config配置
     * Summary: 更新config配置
     */
    public UpdateSofamqConfigResponse updateSofamqConfigEx(UpdateSofamqConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.config.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqConfigResponse());
    }

    /**
     * Description: update cluster
     * Summary: update cluster
     */
    public UpdateSofamqClusterResponse updateSofamqCluster(UpdateSofamqClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqClusterEx(request, headers, runtime);
    }

    /**
     * Description: update cluster
     * Summary: update cluster
     */
    public UpdateSofamqClusterResponse updateSofamqClusterEx(UpdateSofamqClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.cluster.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqClusterResponse());
    }

    /**
     * Description: update dc
     * Summary: update dc
     */
    public UpdateSofamqDatacenterResponse updateSofamqDatacenter(UpdateSofamqDatacenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqDatacenterEx(request, headers, runtime);
    }

    /**
     * Description: update dc
     * Summary: update dc
     */
    public UpdateSofamqDatacenterResponse updateSofamqDatacenterEx(UpdateSofamqDatacenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.datacenter.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqDatacenterResponse());
    }

    /**
     * Description: update room
     * Summary: update room
     */
    public UpdateSofamqRoomResponse updateSofamqRoom(UpdateSofamqRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqRoomEx(request, headers, runtime);
    }

    /**
     * Description: update room
     * Summary: update room
     */
    public UpdateSofamqRoomResponse updateSofamqRoomEx(UpdateSofamqRoomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.room.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqRoomResponse());
    }

    /**
     * Description: update node
     * Summary: update node
     */
    public UpdateSofamqNodeResponse updateSofamqNode(UpdateSofamqNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqNodeEx(request, headers, runtime);
    }

    /**
     * Description: update node
     * Summary: update node
     */
    public UpdateSofamqNodeResponse updateSofamqNodeEx(UpdateSofamqNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.node.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqNodeResponse());
    }

    /**
     * Description: 查询指定的 Topic 的队列信息。
     * Summary: 查询topic的队列信息
     */
    public QuerySofamqTopicqueueResponse querySofamqTopicqueue(QuerySofamqTopicqueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTopicqueueEx(request, headers, runtime);
    }

    /**
     * Description: 查询指定的 Topic 的队列信息。
     * Summary: 查询topic的队列信息
     */
    public QuerySofamqTopicqueueResponse querySofamqTopicqueueEx(QuerySofamqTopicqueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topicqueue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTopicqueueResponse());
    }

    /**
     * Description: 查看在线订阅topic
     * Summary: 查看在线订阅topic
     */
    public QuerySofamqAdmingroupsubdetailResponse querySofamqAdmingroupsubdetail(QuerySofamqAdmingroupsubdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqAdmingroupsubdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查看在线订阅topic
     * Summary: 查看在线订阅topic
     */
    public QuerySofamqAdmingroupsubdetailResponse querySofamqAdmingroupsubdetailEx(QuerySofamqAdmingroupsubdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admingroupsubdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqAdmingroupsubdetailResponse());
    }

    /**
     * Description: 管理员列表
     * Summary: 管理员列表
     */
    public ListSofamqAdminuserResponse listSofamqAdminuser(ListSofamqAdminuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqAdminuserEx(request, headers, runtime);
    }

    /**
     * Description: 管理员列表
     * Summary: 管理员列表
     */
    public ListSofamqAdminuserResponse listSofamqAdminuserEx(ListSofamqAdminuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.adminuser.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqAdminuserResponse());
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户
     */
    public CreateSofamqAdminuserResponse createSofamqAdminuser(CreateSofamqAdminuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqAdminuserEx(request, headers, runtime);
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户
     */
    public CreateSofamqAdminuserResponse createSofamqAdminuserEx(CreateSofamqAdminuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.adminuser.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqAdminuserResponse());
    }

    /**
     * Description: 删除管理员用户
     * Summary: 删除管理员用户
     */
    public DeleteSofamqAdminuserResponse deleteSofamqAdminuser(DeleteSofamqAdminuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqAdminuserEx(request, headers, runtime);
    }

    /**
     * Description: 删除管理员用户
     * Summary: 删除管理员用户
     */
    public DeleteSofamqAdminuserResponse deleteSofamqAdminuserEx(DeleteSofamqAdminuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.adminuser.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqAdminuserResponse());
    }

    /**
     * Description: 查询用户侧接口列表
     * Summary: 查询用户侧接口列表
     */
    public ListSofamqAdminapiResponse listSofamqAdminapi(ListSofamqAdminapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqAdminapiEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户侧接口列表
     * Summary: 查询用户侧接口列表
     */
    public ListSofamqAdminapiResponse listSofamqAdminapiEx(ListSofamqAdminapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.adminapi.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqAdminapiResponse());
    }

    /**
     * Description: api权限更新
     * Summary: api权限更新
     */
    public SwitchSofamqAdminapiResponse switchSofamqAdminapi(SwitchSofamqAdminapiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchSofamqAdminapiEx(request, headers, runtime);
    }

    /**
     * Description: api权限更新
     * Summary: api权限更新
     */
    public SwitchSofamqAdminapiResponse switchSofamqAdminapiEx(SwitchSofamqAdminapiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.adminapi.switch", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SwitchSofamqAdminapiResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public AddDmsMsgtypeResponse addDmsMsgtype(AddDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public AddDmsMsgtypeResponse addDmsMsgtypeEx(AddDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsMsgtypeResponse listDmsMsgtype(ListDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsMsgtypeResponse listDmsMsgtypeEx(ListDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public CreateDmsBindingResponse createDmsBinding(CreateDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public CreateDmsBindingResponse createDmsBindingEx(CreateDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsBindingResponse listDmsBinding(ListDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsBindingResponse listDmsBindingEx(ListDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsMsgtypeResponse deleteDmsMsgtype(DeleteDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsMsgtypeResponse deleteDmsMsgtypeEx(DeleteDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsBindingResponse deleteDmsBinding(DeleteDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsBindingResponse deleteDmsBindingEx(DeleteDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public UpdateDmsMsgtypeResponse updateDmsMsgtype(UpdateDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public UpdateDmsMsgtypeResponse updateDmsMsgtypeEx(UpdateDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public UpdateDmsBindingResponse updateDmsBinding(UpdateDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public UpdateDmsBindingResponse updateDmsBindingEx(UpdateDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public QueryDmsMsgResponse queryDmsMsg(QueryDmsMsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDmsMsgEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public QueryDmsMsgResponse queryDmsMsgEx(QueryDmsMsgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msg.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDmsMsgResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public BatchqueryDmsMsgResponse batchqueryDmsMsg(BatchqueryDmsMsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryDmsMsgEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public BatchqueryDmsMsgResponse batchqueryDmsMsgEx(BatchqueryDmsMsgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msg.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryDmsMsgResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsMsgResponse deleteDmsMsg(DeleteDmsMsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDmsMsgEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsMsgResponse deleteDmsMsgEx(DeleteDmsMsgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msg.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDmsMsgResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public BatchdeleteDmsMsgResponse batchdeleteDmsMsg(BatchdeleteDmsMsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchdeleteDmsMsgEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public BatchdeleteDmsMsgResponse batchdeleteDmsMsgEx(BatchdeleteDmsMsgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msg.batchdelete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchdeleteDmsMsgResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ExportDmsMsgtypeResponse exportDmsMsgtype(ExportDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ExportDmsMsgtypeResponse exportDmsMsgtypeEx(ExportDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ImportDmsMsgtypeResponse importDmsMsgtype(ImportDmsMsgtypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDmsMsgtypeEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ImportDmsMsgtypeResponse importDmsMsgtypeEx(ImportDmsMsgtypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtype.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDmsMsgtypeResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ExportDmsBindingResponse exportDmsBinding(ExportDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ExportDmsBindingResponse exportDmsBindingEx(ExportDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ImportDmsBindingResponse importDmsBinding(ImportDmsBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDmsBindingEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ImportDmsBindingResponse importDmsBindingEx(ImportDmsBindingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.binding.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDmsBindingResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsWhitelistResponse listDmsWhitelist(ListDmsWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDmsWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public ListDmsWhitelistResponse listDmsWhitelistEx(ListDmsWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.whitelist.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDmsWhitelistResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public AddDmsWhitelistResponse addDmsWhitelist(AddDmsWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDmsWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public AddDmsWhitelistResponse addDmsWhitelistEx(AddDmsWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.whitelist.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDmsWhitelistResponse());
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsWhitelistResponse deleteDmsWhitelist(DeleteDmsWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDmsWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: dms
     * Summary: dms
     */
    public DeleteDmsWhitelistResponse deleteDmsWhitelistEx(DeleteDmsWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.whitelist.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDmsWhitelistResponse());
    }

    /**
     * Description: admin
     * Summary: topics
     */
    public GetDmsTopicsResponse getDmsTopics(GetDmsTopicsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDmsTopicsEx(request, headers, runtime);
    }

    /**
     * Description: admin
     * Summary: topics
     */
    public GetDmsTopicsResponse getDmsTopicsEx(GetDmsTopicsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.topics.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDmsTopicsResponse());
    }

    /**
     * Description: 查询消费者堆栈信息，便于定位问题。
     * Summary: 查询消费者堆栈信息
     */
    public GetSofamqConsumerjstackResponse getSofamqConsumerjstack(GetSofamqConsumerjstackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqConsumerjstackEx(request, headers, runtime);
    }

    /**
     * Description: 查询消费者堆栈信息，便于定位问题。
     * Summary: 查询消费者堆栈信息
     */
    public GetSofamqConsumerjstackResponse getSofamqConsumerjstackEx(GetSofamqConsumerjstackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumerjstack.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqConsumerjstackResponse());
    }

    /**
     * Description: uploadurl
     * Summary: uploadurl
     */
    public QueryDmsUploadurlResponse queryDmsUploadurl(QueryDmsUploadurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDmsUploadurlEx(request, headers, runtime);
    }

    /**
     * Description: uploadurl
     * Summary: uploadurl
     */
    public QueryDmsUploadurlResponse queryDmsUploadurlEx(QueryDmsUploadurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.uploadurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDmsUploadurlResponse());
    }

    /**
     * Description: msgtypetemplate
     * Summary: msgtypetemplate
     */
    public GetDmsMsgtypetemplateResponse getDmsMsgtypetemplate(GetDmsMsgtypetemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDmsMsgtypetemplateEx(request, headers, runtime);
    }

    /**
     * Description: msgtypetemplate
     * Summary: msgtypetemplate
     */
    public GetDmsMsgtypetemplateResponse getDmsMsgtypetemplateEx(GetDmsMsgtypetemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.msgtypetemplate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDmsMsgtypetemplateResponse());
    }

    /**
     * Description: template
     * Summary: template
     */
    public GetDmsBindingtemplateResponse getDmsBindingtemplate(GetDmsBindingtemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDmsBindingtemplateEx(request, headers, runtime);
    }

    /**
     * Description: template
     * Summary: template
     */
    public GetDmsBindingtemplateResponse getDmsBindingtemplateEx(GetDmsBindingtemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.bindingtemplate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDmsBindingtemplateResponse());
    }

    /**
     * Description: 查询msgdump消息同步任务源端资源
     * Summary: 查询msgdump消息同步任务源端资源
     */
    public QueryMsgdumpSourceResponse queryMsgdumpSource(QueryMsgdumpSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsgdumpSourceEx(request, headers, runtime);
    }

    /**
     * Description: 查询msgdump消息同步任务源端资源
     * Summary: 查询msgdump消息同步任务源端资源
     */
    public QueryMsgdumpSourceResponse queryMsgdumpSourceEx(QueryMsgdumpSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgdump.source.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMsgdumpSourceResponse());
    }

    /**
     * Description: 创建 msgdump 同步任务
     * Summary: 创建同步任务
     */
    public CreateMsgdumpTaskResponse createMsgdumpTask(CreateMsgdumpTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMsgdumpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 创建 msgdump 同步任务
     * Summary: 创建同步任务
     */
    public CreateMsgdumpTaskResponse createMsgdumpTaskEx(CreateMsgdumpTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgdump.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMsgdumpTaskResponse());
    }

    /**
     * Description: 查询消息同步任务
     * Summary: 查询消息同步任务
     */
    public QueryMsgdumpTaskResponse queryMsgdumpTask(QueryMsgdumpTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMsgdumpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 查询消息同步任务
     * Summary: 查询消息同步任务
     */
    public QueryMsgdumpTaskResponse queryMsgdumpTaskEx(QueryMsgdumpTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgdump.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMsgdumpTaskResponse());
    }

    /**
     * Description: 删除 msgdump 任务
     * Summary: 删除 msgdump 任务
     */
    public DeleteMsgdumpTaskResponse deleteMsgdumpTask(DeleteMsgdumpTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMsgdumpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 删除 msgdump 任务
     * Summary: 删除 msgdump 任务
     */
    public DeleteMsgdumpTaskResponse deleteMsgdumpTaskEx(DeleteMsgdumpTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgdump.task.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMsgdumpTaskResponse());
    }

    /**
     * Description: 更新msgdump任务状态
     * Summary: 更新msgdump任务状态
     */
    public EnableMsgdumpTaskResponse enableMsgdumpTask(EnableMsgdumpTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableMsgdumpTaskEx(request, headers, runtime);
    }

    /**
     * Description: 更新msgdump任务状态
     * Summary: 更新msgdump任务状态
     */
    public EnableMsgdumpTaskResponse enableMsgdumpTaskEx(EnableMsgdumpTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.msgdump.task.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableMsgdumpTaskResponse());
    }

    /**
     * Description: schema metadata 分页查询
     * Summary: schema metadata 分页查询
     */
    public ListSchemaAdminmetadataResponse listSchemaAdminmetadata(ListSchemaAdminmetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSchemaAdminmetadataEx(request, headers, runtime);
    }

    /**
     * Description: schema metadata 分页查询
     * Summary: schema metadata 分页查询
     */
    public ListSchemaAdminmetadataResponse listSchemaAdminmetadataEx(ListSchemaAdminmetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminmetadata.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSchemaAdminmetadataResponse());
    }

    /**
     * Description: 新增schema的metadata信息
     * Summary: 新增schema的metadata信息
     */
    public CreateSchemaAdminmetadataResponse createSchemaAdminmetadata(CreateSchemaAdminmetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSchemaAdminmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 新增schema的metadata信息
     * Summary: 新增schema的metadata信息
     */
    public CreateSchemaAdminmetadataResponse createSchemaAdminmetadataEx(CreateSchemaAdminmetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminmetadata.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSchemaAdminmetadataResponse());
    }

    /**
     * Description: 更新schema元信息
     * Summary: 更新schema元信息
     */
    public UpdateSchemaAdminmetadataResponse updateSchemaAdminmetadata(UpdateSchemaAdminmetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSchemaAdminmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 更新schema元信息
     * Summary: 更新schema元信息
     */
    public UpdateSchemaAdminmetadataResponse updateSchemaAdminmetadataEx(UpdateSchemaAdminmetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminmetadata.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSchemaAdminmetadataResponse());
    }

    /**
     * Description: 删除schema元信息
     * Summary: 删除schema元信息
     */
    public DeleteSchemaAdminmetadataResponse deleteSchemaAdminmetadata(DeleteSchemaAdminmetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSchemaAdminmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 删除schema元信息
     * Summary: 删除schema元信息
     */
    public DeleteSchemaAdminmetadataResponse deleteSchemaAdminmetadataEx(DeleteSchemaAdminmetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminmetadata.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSchemaAdminmetadataResponse());
    }

    /**
     * Description: 分页查看schema详情
     * Summary: 分页查看schema详情
     */
    public ListSchemaAdmindetailResponse listSchemaAdmindetail(ListSchemaAdmindetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSchemaAdmindetailEx(request, headers, runtime);
    }

    /**
     * Description: 分页查看schema详情
     * Summary: 分页查看schema详情
     */
    public ListSchemaAdmindetailResponse listSchemaAdmindetailEx(ListSchemaAdmindetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.admindetail.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSchemaAdmindetailResponse());
    }

    /**
     * Description: 新增schema详情
     * Summary: 新增schema详情
     */
    public CreateSchemaAdmindetailResponse createSchemaAdmindetail(CreateSchemaAdmindetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSchemaAdmindetailEx(request, headers, runtime);
    }

    /**
     * Description: 新增schema详情
     * Summary: 新增schema详情
     */
    public CreateSchemaAdmindetailResponse createSchemaAdmindetailEx(CreateSchemaAdmindetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.admindetail.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSchemaAdmindetailResponse());
    }

    /**
     * Description: admindetail
     * Summary: 删除schema详情
     */
    public DeleteSchemaAdmindetailResponse deleteSchemaAdmindetail(DeleteSchemaAdmindetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSchemaAdmindetailEx(request, headers, runtime);
    }

    /**
     * Description: admindetail
     * Summary: 删除schema详情
     */
    public DeleteSchemaAdmindetailResponse deleteSchemaAdmindetailEx(DeleteSchemaAdmindetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.admindetail.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSchemaAdmindetailResponse());
    }

    /**
     * Description: 查询endpoint
     * Summary: 查询endpoint
     */
    public QuerySofamqEndpointResponse querySofamqEndpoint(QuerySofamqEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqEndpointEx(request, headers, runtime);
    }

    /**
     * Description: 查询endpoint
     * Summary: 查询endpoint
     */
    public QuerySofamqEndpointResponse querySofamqEndpointEx(QuerySofamqEndpointRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.endpoint.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqEndpointResponse());
    }

    /**
     * Description: 按照条件查看schema元数据
     * Summary: 按照条件查看schema元数据
     */
    public QuerySchemaAdminmetadataResponse querySchemaAdminmetadata(QuerySchemaAdminmetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySchemaAdminmetadataEx(request, headers, runtime);
    }

    /**
     * Description: 按照条件查看schema元数据
     * Summary: 按照条件查看schema元数据
     */
    public QuerySchemaAdminmetadataResponse querySchemaAdminmetadataEx(QuerySchemaAdminmetadataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminmetadata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySchemaAdminmetadataResponse());
    }

    /**
     * Description: 查询schema的config配置
     * Summary: 查询schema的config配置
     */
    public QuerySchemaAdminconfigResponse querySchemaAdminconfig(QuerySchemaAdminconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySchemaAdminconfigEx(request, headers, runtime);
    }

    /**
     * Description: 查询schema的config配置
     * Summary: 查询schema的config配置
     */
    public QuerySchemaAdminconfigResponse querySchemaAdminconfigEx(QuerySchemaAdminconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.schema.adminconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySchemaAdminconfigResponse());
    }

    /**
     * Description: 查询console页面的链接
     * Summary: 查询console页面的链接
     */
    public QuerySofamqLinkResponse querySofamqLink(QuerySofamqLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqLinkEx(request, headers, runtime);
    }

    /**
     * Description: 查询console页面的链接
     * Summary: 查询console页面的链接
     */
    public QuerySofamqLinkResponse querySofamqLinkEx(QuerySofamqLinkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.link.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqLinkResponse());
    }

    /**
     * Description: 查询全部topic名字
     * Summary: 查询全部topic名字
     */
    public QuerySofamqTopicnameResponse querySofamqTopicname(QuerySofamqTopicnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqTopicnameEx(request, headers, runtime);
    }

    /**
     * Description: 查询全部topic名字
     * Summary: 查询全部topic名字
     */
    public QuerySofamqTopicnameResponse querySofamqTopicnameEx(QuerySofamqTopicnameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.topicname.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqTopicnameResponse());
    }

    /**
     * Description: 查询全部group名字
     * Summary: 查询全部group名字
     */
    public QuerySofamqGroupnameResponse querySofamqGroupname(QuerySofamqGroupnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqGroupnameEx(request, headers, runtime);
    }

    /**
     * Description: 查询全部group名字
     * Summary: 查询全部group名字
     */
    public QuerySofamqGroupnameResponse querySofamqGroupnameEx(QuerySofamqGroupnameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.groupname.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqGroupnameResponse());
    }

    /**
     * Description: 管理员创建topic
     * Summary: 管理员创建topic
     */
    public CreateSofamqAdmintopicResponse createSofamqAdmintopic(CreateSofamqAdmintopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqAdmintopicEx(request, headers, runtime);
    }

    /**
     * Description: 管理员创建topic
     * Summary: 管理员创建topic
     */
    public CreateSofamqAdmintopicResponse createSofamqAdmintopicEx(CreateSofamqAdmintopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admintopic.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqAdmintopicResponse());
    }

    /**
     * Description: 管理员创建group
     * Summary: 管理员创建group
     */
    public CreateSofamqAdmingroupResponse createSofamqAdmingroup(CreateSofamqAdmingroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqAdmingroupEx(request, headers, runtime);
    }

    /**
     * Description: 管理员创建group
     * Summary: 管理员创建group
     */
    public CreateSofamqAdmingroupResponse createSofamqAdmingroupEx(CreateSofamqAdmingroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admingroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqAdmingroupResponse());
    }

    /**
     * Description: 查询特定的连接任务详情
     * Summary: 查询特定的连接任务详情
     */
    public QuerySofamqConnectorResponse querySofamqConnector(QuerySofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 查询特定的连接任务详情
     * Summary: 查询特定的连接任务详情
     */
    public QuerySofamqConnectorResponse querySofamqConnectorEx(QuerySofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorResponse());
    }

    /**
     * Description: 新增一个连接器任务
     * Summary: 新增一个连接器任务
     */
    public CreateSofamqConnectorResponse createSofamqConnector(CreateSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 新增一个连接器任务
     * Summary: 新增一个连接器任务
     */
    public CreateSofamqConnectorResponse createSofamqConnectorEx(CreateSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqConnectorResponse());
    }

    /**
     * Description: 查询所有的连接任务，允许携带查询条件
     * Summary: 查询连接任务
     */
    public ListSofamqConnectorResponse listSofamqConnector(ListSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 查询所有的连接任务，允许携带查询条件
     * Summary: 查询连接任务
     */
    public ListSofamqConnectorResponse listSofamqConnectorEx(ListSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqConnectorResponse());
    }

    /**
     * Description: 删除一个连接器任务
     * Summary: 删除一个连接器任务
     */
    public DeleteSofamqConnectorResponse deleteSofamqConnector(DeleteSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 删除一个连接器任务
     * Summary: 删除一个连接器任务
     */
    public DeleteSofamqConnectorResponse deleteSofamqConnectorEx(DeleteSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqConnectorResponse());
    }

    /**
     * Description: 启动一个连接器的任务
     * Summary: 启动一个连接器的任务
     */
    public EnableSofamqConnectorResponse enableSofamqConnector(EnableSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 启动一个连接器的任务
     * Summary: 启动一个连接器的任务
     */
    public EnableSofamqConnectorResponse enableSofamqConnectorEx(EnableSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableSofamqConnectorResponse());
    }

    /**
     * Description: 停止一个连接器任务
     * Summary: 停止一个连接器任务
     */
    public DisableSofamqConnectorResponse disableSofamqConnector(DisableSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 停止一个连接器任务
     * Summary: 停止一个连接器任务
     */
    public DisableSofamqConnectorResponse disableSofamqConnectorEx(DisableSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableSofamqConnectorResponse());
    }

    /**
     * Description: 列出所有任务的调度类型
     * Summary: 列出所有任务的调度类型
     */
    public ListSofamqConnectorscheuletypeResponse listSofamqConnectorscheuletype(ListSofamqConnectorscheuletypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqConnectorscheuletypeEx(request, headers, runtime);
    }

    /**
     * Description: 列出所有任务的调度类型
     * Summary: 列出所有任务的调度类型
     */
    public ListSofamqConnectorscheuletypeResponse listSofamqConnectorscheuletypeEx(ListSofamqConnectorscheuletypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorscheuletype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqConnectorscheuletypeResponse());
    }

    /**
     * Description: 列出所有支持的来源类型
     * Summary: 列出所有支持的来源类型
     */
    public ListSofamqConnectorsourcetypeResponse listSofamqConnectorsourcetype(ListSofamqConnectorsourcetypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqConnectorsourcetypeEx(request, headers, runtime);
    }

    /**
     * Description: 列出所有支持的来源类型
     * Summary: 列出所有支持的来源类型
     */
    public ListSofamqConnectorsourcetypeResponse listSofamqConnectorsourcetypeEx(ListSofamqConnectorsourcetypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorsourcetype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqConnectorsourcetypeResponse());
    }

    /**
     * Description: 列出所有支持的去向类型
     * Summary: 列出所有支持的去向类型
     */
    public ListSofamqConnectorsinktypeResponse listSofamqConnectorsinktype(ListSofamqConnectorsinktypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqConnectorsinktypeEx(request, headers, runtime);
    }

    /**
     * Description: 列出所有支持的去向类型
     * Summary: 列出所有支持的去向类型
     */
    public ListSofamqConnectorsinktypeResponse listSofamqConnectorsinktypeEx(ListSofamqConnectorsinktypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorsinktype.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqConnectorsinktypeResponse());
    }

    /**
     * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
     * Summary: 加载不同数据来源和去向对应的前端配置
     */
    public LoadSofamqConnectorconfigsResponse loadSofamqConnectorconfigs(LoadSofamqConnectorconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadSofamqConnectorconfigsEx(request, headers, runtime);
    }

    /**
     * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
     * Summary: 加载不同数据来源和去向对应的前端配置
     */
    public LoadSofamqConnectorconfigsResponse loadSofamqConnectorconfigsEx(LoadSofamqConnectorconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorconfigs.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadSofamqConnectorconfigsResponse());
    }

    /**
     * Description: connect按照时间段返回当前任务的执行记录
     * Summary: connect执行记录查询
     */
    public QuerySofamqConnectordateResponse querySofamqConnectordate(QuerySofamqConnectordateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectordateEx(request, headers, runtime);
    }

    /**
     * Description: connect按照时间段返回当前任务的执行记录
     * Summary: connect执行记录查询
     */
    public QuerySofamqConnectordateResponse querySofamqConnectordateEx(QuerySofamqConnectordateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectordate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectordateResponse());
    }

    /**
     * Description: 根据执行时间返回当前的任务记录执行详情
     * Summary: 根据执行时间返回当前的任务记录执行详情
     */
    public QuerySofamqConnectorrecordResponse querySofamqConnectorrecord(QuerySofamqConnectorrecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorrecordEx(request, headers, runtime);
    }

    /**
     * Description: 根据执行时间返回当前的任务记录执行详情
     * Summary: 根据执行时间返回当前的任务记录执行详情
     */
    public QuerySofamqConnectorrecordResponse querySofamqConnectorrecordEx(QuerySofamqConnectorrecordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorrecord.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorrecordResponse());
    }

    /**
     * Description: 加载数据源对应的结构信息
     * Summary: 加载数据源对应的结构信息
     */
    public LoadSofamqConnectorsourceResponse loadSofamqConnectorsource(LoadSofamqConnectorsourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadSofamqConnectorsourceEx(request, headers, runtime);
    }

    /**
     * Description: 加载数据源对应的结构信息
     * Summary: 加载数据源对应的结构信息
     */
    public LoadSofamqConnectorsourceResponse loadSofamqConnectorsourceEx(LoadSofamqConnectorsourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorsource.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadSofamqConnectorsourceResponse());
    }

    /**
     * Description: 查询队列详情信息以及分页信息
     * Summary: 查询队列详情
     */
    public QueryMeshQueueResponse queryMeshQueue(QueryMeshQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueueEx(request, headers, runtime);
    }

    /**
     * Description: 查询队列详情信息以及分页信息
     * Summary: 查询队列详情
     */
    public QueryMeshQueueResponse queryMeshQueueEx(QueryMeshQueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueueResponse());
    }

    /**
     * Description: 新增队列
     * Summary: 新增队列
     */
    public ImportMeshQueueResponse importMeshQueue(ImportMeshQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importMeshQueueEx(request, headers, runtime);
    }

    /**
     * Description: 新增队列
     * Summary: 新增队列
     */
    public ImportMeshQueueResponse importMeshQueueEx(ImportMeshQueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queue.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportMeshQueueResponse());
    }

    /**
     * Description: 删除队列
     * Summary: 删除队列
     */
    public DeleteMeshQueueResponse deleteMeshQueue(DeleteMeshQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshQueueEx(request, headers, runtime);
    }

    /**
     * Description: 删除队列
     * Summary: 删除队列
     */
    public DeleteMeshQueueResponse deleteMeshQueueEx(DeleteMeshQueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queue.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshQueueResponse());
    }

    /**
     * Description: 更新队列
     * Summary: 更新队列
     */
    public UpdateMeshQueueResponse updateMeshQueue(UpdateMeshQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueueEx(request, headers, runtime);
    }

    /**
     * Description: 更新队列
     * Summary: 更新队列
     */
    public UpdateMeshQueueResponse updateMeshQueueEx(UpdateMeshQueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queue.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueueResponse());
    }

    /**
     * Description: 查询限流规则
     * Summary: 查询限流规则
     */
    public QueryMeshQueuelimitrulesResponse queryMeshQueuelimitrules(QueryMeshQueuelimitrulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuelimitrulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询限流规则
     * Summary: 查询限流规则
     */
    public QueryMeshQueuelimitrulesResponse queryMeshQueuelimitrulesEx(QueryMeshQueuelimitrulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimitrules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuelimitrulesResponse());
    }

    /**
     * Description: 修改一个连接器任务
     * Summary: 修改一个连接器任务
     */
    public UpdateSofamqConnectorResponse updateSofamqConnector(UpdateSofamqConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqConnectorEx(request, headers, runtime);
    }

    /**
     * Description: 修改一个连接器任务
     * Summary: 修改一个连接器任务
     */
    public UpdateSofamqConnectorResponse updateSofamqConnectorEx(UpdateSofamqConnectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connector.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqConnectorResponse());
    }

    /**
     * Description: 查询限流规则域值
     * Summary: 查询限流规则域值
     */
    public QueryMeshQueuelimitvalueResponse queryMeshQueuelimitvalue(QueryMeshQueuelimitvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuelimitvalueEx(request, headers, runtime);
    }

    /**
     * Description: 查询限流规则域值
     * Summary: 查询限流规则域值
     */
    public QueryMeshQueuelimitvalueResponse queryMeshQueuelimitvalueEx(QueryMeshQueuelimitvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimitvalue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuelimitvalueResponse());
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则
     */
    public UpdateMeshQueuelimitResponse updateMeshQueuelimit(UpdateMeshQueuelimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueuelimitEx(request, headers, runtime);
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则
     */
    public UpdateMeshQueuelimitResponse updateMeshQueuelimitEx(UpdateMeshQueuelimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueuelimitResponse());
    }

    /**
     * Description: 添加限流规则
     * Summary: 添加限流规则
     */
    public ImportMeshQueuelimitResponse importMeshQueuelimit(ImportMeshQueuelimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importMeshQueuelimitEx(request, headers, runtime);
    }

    /**
     * Description: 添加限流规则
     * Summary: 添加限流规则
     */
    public ImportMeshQueuelimitResponse importMeshQueuelimitEx(ImportMeshQueuelimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimit.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportMeshQueuelimitResponse());
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteMeshQueuelimitResponse deleteMeshQueuelimit(DeleteMeshQueuelimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshQueuelimitEx(request, headers, runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteMeshQueuelimitResponse deleteMeshQueuelimitEx(DeleteMeshQueuelimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimit.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshQueuelimitResponse());
    }

    /**
     * Description: 删除限流域值
     * Summary: 删除规则的限流域值
     */
    public DeleteMeshQueuelimitvalueResponse deleteMeshQueuelimitvalue(DeleteMeshQueuelimitvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshQueuelimitvalueEx(request, headers, runtime);
    }

    /**
     * Description: 删除限流域值
     * Summary: 删除规则的限流域值
     */
    public DeleteMeshQueuelimitvalueResponse deleteMeshQueuelimitvalueEx(DeleteMeshQueuelimitvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimitvalue.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshQueuelimitvalueResponse());
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则
     */
    public QueryMeshQueuerouterulesResponse queryMeshQueuerouterules(QueryMeshQueuerouterulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuerouterulesEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则
     */
    public QueryMeshQueuerouterulesResponse queryMeshQueuerouterulesEx(QueryMeshQueuerouterulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuerouterules.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuerouterulesResponse());
    }

    /**
     * Description: 查询路由版本
     * Summary: 查询路由版本
     */
    public QueryMeshQueuerouteeditionResponse queryMeshQueuerouteedition(QueryMeshQueuerouteeditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuerouteeditionEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由版本
     * Summary: 查询路由版本
     */
    public QueryMeshQueuerouteeditionResponse queryMeshQueuerouteeditionEx(QueryMeshQueuerouteeditionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuerouteedition.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuerouteeditionResponse());
    }

    /**
     * Description: 添加路由规则
     * Summary: 添加路由规则
     */
    public ImportMeshQueuerouteResponse importMeshQueueroute(ImportMeshQueuerouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importMeshQueuerouteEx(request, headers, runtime);
    }

    /**
     * Description: 添加路由规则
     * Summary: 添加路由规则
     */
    public ImportMeshQueuerouteResponse importMeshQueuerouteEx(ImportMeshQueuerouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queueroute.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportMeshQueuerouteResponse());
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则
     */
    public UpdateMeshQueuerouteResponse updateMeshQueueroute(UpdateMeshQueuerouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueuerouteEx(request, headers, runtime);
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则
     */
    public UpdateMeshQueuerouteResponse updateMeshQueuerouteEx(UpdateMeshQueuerouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queueroute.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueuerouteResponse());
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteMeshQueuerouteResponse deleteMeshQueueroute(DeleteMeshQueuerouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshQueuerouteEx(request, headers, runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteMeshQueuerouteResponse deleteMeshQueuerouteEx(DeleteMeshQueuerouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queueroute.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshQueuerouteResponse());
    }

    /**
     * Description: 删除路由版本
     * Summary: 删除路由版本
     */
    public DeleteMeshQueuerouteeditionResponse deleteMeshQueuerouteedition(DeleteMeshQueuerouteeditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshQueuerouteeditionEx(request, headers, runtime);
    }

    /**
     * Description: 删除路由版本
     * Summary: 删除路由版本
     */
    public DeleteMeshQueuerouteeditionResponse deleteMeshQueuerouteeditionEx(DeleteMeshQueuerouteeditionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuerouteedition.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshQueuerouteeditionResponse());
    }

    /**
     * Description: 查询路由规则应用
     * Summary: 查询路由规则应用
     */
    public QueryMeshQueuerouteappResponse queryMeshQueuerouteapp(QueryMeshQueuerouteappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuerouteappEx(request, headers, runtime);
    }

    /**
     * Description: 查询路由规则应用
     * Summary: 查询路由规则应用
     */
    public QueryMeshQueuerouteappResponse queryMeshQueuerouteappEx(QueryMeshQueuerouteappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuerouteapp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuerouteappResponse());
    }

    /**
     * Description: 根据队列id查询队列详情
     * Summary: 根据队列id查询队列详情
     */
    public QueryMeshQueuebyidResponse queryMeshQueuebyid(QueryMeshQueuebyidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshQueuebyidEx(request, headers, runtime);
    }

    /**
     * Description: 根据队列id查询队列详情
     * Summary: 根据队列id查询队列详情
     */
    public QueryMeshQueuebyidResponse queryMeshQueuebyidEx(QueryMeshQueuebyidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuebyid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshQueuebyidResponse());
    }

    /**
     * Description: zhaolei
     * Summary: 更新限流状态
     */
    public UpdateMeshQueuelimitstatusResponse updateMeshQueuelimitstatus(UpdateMeshQueuelimitstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueuelimitstatusEx(request, headers, runtime);
    }

    /**
     * Description: zhaolei
     * Summary: 更新限流状态
     */
    public UpdateMeshQueuelimitstatusResponse updateMeshQueuelimitstatusEx(UpdateMeshQueuelimitstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimitstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueuelimitstatusResponse());
    }

    /**
     * Description: 更新路由规则状态
     * Summary: 更新路由规则状态
     */
    public UpdateMeshQueueroutestatusResponse updateMeshQueueroutestatus(UpdateMeshQueueroutestatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueueroutestatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新路由规则状态
     * Summary: 更新路由规则状态
     */
    public UpdateMeshQueueroutestatusResponse updateMeshQueueroutestatusEx(UpdateMeshQueueroutestatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queueroutestatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueueroutestatusResponse());
    }

    /**
     * Description: 管理员更新topic
     * Summary: 管理员更新topic
     */
    public UpdateSofamqAdmintopicResponse updateSofamqAdmintopic(UpdateSofamqAdmintopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqAdmintopicEx(request, headers, runtime);
    }

    /**
     * Description: 管理员更新topic
     * Summary: 管理员更新topic
     */
    public UpdateSofamqAdmintopicResponse updateSofamqAdmintopicEx(UpdateSofamqAdmintopicRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admintopic.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqAdmintopicResponse());
    }

    /**
     * Description: 管理员更新group
     * Summary: 管理员更新group
     */
    public UpdateSofamqAdmingroupResponse updateSofamqAdmingroup(UpdateSofamqAdmingroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqAdmingroupEx(request, headers, runtime);
    }

    /**
     * Description: 管理员更新group
     * Summary: 管理员更新group
     */
    public UpdateSofamqAdmingroupResponse updateSofamqAdmingroupEx(UpdateSofamqAdmingroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.admingroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqAdmingroupResponse());
    }

    /**
     * Description: 手动触发一次任务的执行
     * Summary: 手动触发一次任务的执行
     */
    public RunSofamqConnectorjobResponse runSofamqConnectorjob(RunSofamqConnectorjobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSofamqConnectorjobEx(request, headers, runtime);
    }

    /**
     * Description: 手动触发一次任务的执行
     * Summary: 手动触发一次任务的执行
     */
    public RunSofamqConnectorjobResponse runSofamqConnectorjobEx(RunSofamqConnectorjobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunSofamqConnectorjobResponse());
    }

    /**
     * Description: 暂停一个Connector任务
     * Summary: 暂停一个任务
     */
    public PauseSofamqConnectorjobResponse pauseSofamqConnectorjob(PauseSofamqConnectorjobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseSofamqConnectorjobEx(request, headers, runtime);
    }

    /**
     * Description: 暂停一个Connector任务
     * Summary: 暂停一个任务
     */
    public PauseSofamqConnectorjobResponse pauseSofamqConnectorjobEx(PauseSofamqConnectorjobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseSofamqConnectorjobResponse());
    }

    /**
     * Description: 恢复一个暂停的任务
     * Summary: 恢复一个暂停的任务
     */
    public ResumeSofamqConnectorjobResponse resumeSofamqConnectorjob(ResumeSofamqConnectorjobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeSofamqConnectorjobEx(request, headers, runtime);
    }

    /**
     * Description: 恢复一个暂停的任务
     * Summary: 恢复一个暂停的任务
     */
    public ResumeSofamqConnectorjobResponse resumeSofamqConnectorjobEx(ResumeSofamqConnectorjobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeSofamqConnectorjobResponse());
    }

    /**
     * Description: 确认覆盖路有规则状态
     * Summary: 确认覆盖路由规则状态
     */
    public UpdateMeshQueueroutestatusconfirmResponse updateMeshQueueroutestatusconfirm(UpdateMeshQueueroutestatusconfirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueueroutestatusconfirmEx(request, headers, runtime);
    }

    /**
     * Description: 确认覆盖路有规则状态
     * Summary: 确认覆盖路由规则状态
     */
    public UpdateMeshQueueroutestatusconfirmResponse updateMeshQueueroutestatusconfirmEx(UpdateMeshQueueroutestatusconfirmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queueroutestatusconfirm.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueueroutestatusconfirmResponse());
    }

    /**
     * Description: 更细限流状态
     * Summary: 更新限流状态
     */
    public UpdateMeshQueuelimitstatusconfirmResponse updateMeshQueuelimitstatusconfirm(UpdateMeshQueuelimitstatusconfirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshQueuelimitstatusconfirmEx(request, headers, runtime);
    }

    /**
     * Description: 更细限流状态
     * Summary: 更新限流状态
     */
    public UpdateMeshQueuelimitstatusconfirmResponse updateMeshQueuelimitstatusconfirmEx(UpdateMeshQueuelimitstatusconfirmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.queuelimitstatusconfirm.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshQueuelimitstatusconfirmResponse());
    }

    /**
     * Description: 日切检查，验证是否可以完成日切
     * Summary: 日切检查
     */
    public ExecSofamqDailycheckResponse execSofamqDailycheck(ExecSofamqDailycheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSofamqDailycheckEx(request, headers, runtime);
    }

    /**
     * Description: 日切检查，验证是否可以完成日切
     * Summary: 日切检查
     */
    public ExecSofamqDailycheckResponse execSofamqDailycheckEx(ExecSofamqDailycheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.dailycheck.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSofamqDailycheckResponse());
    }

    /**
     * Description: 查询应用详情
     * Summary: 查询应用详情
     */
    public QueryMeshApplicationResponse queryMeshApplication(QueryMeshApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用详情
     * Summary: 查询应用详情
     */
    public QueryMeshApplicationResponse queryMeshApplicationEx(QueryMeshApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.application.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshApplicationResponse());
    }

    /**
     * Description: 新增应用
     * Summary: 新增应用
     */
    public ImportMeshApplicationResponse importMeshApplication(ImportMeshApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importMeshApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 新增应用
     * Summary: 新增应用
     */
    public ImportMeshApplicationResponse importMeshApplicationEx(ImportMeshApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.application.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportMeshApplicationResponse());
    }

    /**
     * Description: 更新应用
     * Summary: 更新应用
     */
    public UpdateMeshApplicationResponse updateMeshApplication(UpdateMeshApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeshApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 更新应用
     * Summary: 更新应用
     */
    public UpdateMeshApplicationResponse updateMeshApplicationEx(UpdateMeshApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.application.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeshApplicationResponse());
    }

    /**
     * Description: 删除应用
     * Summary: 删除应用
     */
    public DeleteMeshApplicationResponse deleteMeshApplication(DeleteMeshApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMeshApplicationEx(request, headers, runtime);
    }

    /**
     * Description: 删除应用
     * Summary: 删除应用
     */
    public DeleteMeshApplicationResponse deleteMeshApplicationEx(DeleteMeshApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.application.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteMeshApplicationResponse());
    }

    /**
     * Description: 查询应用服务id
     * Summary: 查询应用服务id
     */
    public QueryMeshApplicationserviceResponse queryMeshApplicationservice(QueryMeshApplicationserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshApplicationserviceEx(request, headers, runtime);
    }

    /**
     * Description: 查询应用服务id
     * Summary: 查询应用服务id
     */
    public QueryMeshApplicationserviceResponse queryMeshApplicationserviceEx(QueryMeshApplicationserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.applicationservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshApplicationserviceResponse());
    }

    /**
     * Description: 根据应用名查应用详情
     * Summary: 根据应用名查应用详情
     */
    public QueryMeshApplicationbynameResponse queryMeshApplicationbyname(QueryMeshApplicationbynameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshApplicationbynameEx(request, headers, runtime);
    }

    /**
     * Description: 根据应用名查应用详情
     * Summary: 根据应用名查应用详情
     */
    public QueryMeshApplicationbynameResponse queryMeshApplicationbynameEx(QueryMeshApplicationbynameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.applicationbyname.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshApplicationbynameResponse());
    }

    /**
     * Description: 查询队列的应用列表
     * Summary: 查询队列的应用列表
     */
    public QueryMeshApplicationlistResponse queryMeshApplicationlist(QueryMeshApplicationlistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshApplicationlistEx(request, headers, runtime);
    }

    /**
     * Description: 查询队列的应用列表
     * Summary: 查询队列的应用列表
     */
    public QueryMeshApplicationlistResponse queryMeshApplicationlistEx(QueryMeshApplicationlistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.applicationlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshApplicationlistResponse());
    }

    /**
     * Description: 应用队列下拉框
     * Summary: 应用队列下拉框
     */
    public QueryMeshApplicationqueuenamesResponse queryMeshApplicationqueuenames(QueryMeshApplicationqueuenamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeshApplicationqueuenamesEx(request, headers, runtime);
    }

    /**
     * Description: 应用队列下拉框
     * Summary: 应用队列下拉框
     */
    public QueryMeshApplicationqueuenamesResponse queryMeshApplicationqueuenamesEx(QueryMeshApplicationqueuenamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.mesh.applicationqueuenames.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeshApplicationqueuenamesResponse());
    }

    /**
     * Description: 暂停一个Connector执行计划
     * Summary: 暂停一个Connector执行计划
     */
    public PauseSofamqConnectorplanResponse pauseSofamqConnectorplan(PauseSofamqConnectorplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseSofamqConnectorplanEx(request, headers, runtime);
    }

    /**
     * Description: 暂停一个Connector执行计划
     * Summary: 暂停一个Connector执行计划
     */
    public PauseSofamqConnectorplanResponse pauseSofamqConnectorplanEx(PauseSofamqConnectorplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseSofamqConnectorplanResponse());
    }

    /**
     * Description: 恢复一个connector执行计划
     * Summary: 恢复一个connector执行计划
     */
    public ResumeSofamqConnectorplanResponse resumeSofamqConnectorplan(ResumeSofamqConnectorplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeSofamqConnectorplanEx(request, headers, runtime);
    }

    /**
     * Description: 恢复一个connector执行计划
     * Summary: 恢复一个connector执行计划
     */
    public ResumeSofamqConnectorplanResponse resumeSofamqConnectorplanEx(ResumeSofamqConnectorplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeSofamqConnectorplanResponse());
    }

    /**
     * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
     * Summary: 重启一个已有的connector任务计划
     */
    public RetrySofamqConnectorplanResponse retrySofamqConnectorplan(RetrySofamqConnectorplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrySofamqConnectorplanEx(request, headers, runtime);
    }

    /**
     * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
     * Summary: 重启一个已有的connector任务计划
     */
    public RetrySofamqConnectorplanResponse retrySofamqConnectorplanEx(RetrySofamqConnectorplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetrySofamqConnectorplanResponse());
    }

    /**
     * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
     * Summary: 查询任务不同来源去向的配置
     */
    public QuerySofamqConnectorconfigsResponse querySofamqConnectorconfigs(QuerySofamqConnectorconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorconfigsEx(request, headers, runtime);
    }

    /**
     * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
     * Summary: 查询任务不同来源去向的配置
     */
    public QuerySofamqConnectorconfigsResponse querySofamqConnectorconfigsEx(QuerySofamqConnectorconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorconfigs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorconfigsResponse());
    }

    /**
     * Description: 创建消费限流规则
     * Summary: 创建消费限流规则
     */
    public CreateSofamqConsumelimiterResponse createSofamqConsumelimiter(CreateSofamqConsumelimiterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqConsumelimiterEx(request, headers, runtime);
    }

    /**
     * Description: 创建消费限流规则
     * Summary: 创建消费限流规则
     */
    public CreateSofamqConsumelimiterResponse createSofamqConsumelimiterEx(CreateSofamqConsumelimiterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqConsumelimiterResponse());
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则
     */
    public UpdateSofamqConsumelimiterResponse updateSofamqConsumelimiter(UpdateSofamqConsumelimiterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqConsumelimiterEx(request, headers, runtime);
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则
     */
    public UpdateSofamqConsumelimiterResponse updateSofamqConsumelimiterEx(UpdateSofamqConsumelimiterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqConsumelimiterResponse());
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteSofamqConsumelimiterResponse deleteSofamqConsumelimiter(DeleteSofamqConsumelimiterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqConsumelimiterEx(request, headers, runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则
     */
    public DeleteSofamqConsumelimiterResponse deleteSofamqConsumelimiterEx(DeleteSofamqConsumelimiterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqConsumelimiterResponse());
    }

    /**
     * Description: 获取限流规则
     * Summary: 限流规则获取
     */
    public QuerySofamqConsumelimiterResponse querySofamqConsumelimiter(QuerySofamqConsumelimiterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConsumelimiterEx(request, headers, runtime);
    }

    /**
     * Description: 获取限流规则
     * Summary: 限流规则获取
     */
    public QuerySofamqConsumelimiterResponse querySofamqConsumelimiterEx(QuerySofamqConsumelimiterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConsumelimiterResponse());
    }

    /**
     * Description: dd
     * Summary: dd
     */
    public GetDmsInstanceResponse getDmsInstance(GetDmsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDmsInstanceEx(request, headers, runtime);
    }

    /**
     * Description: dd
     * Summary: dd
     */
    public GetDmsInstanceResponse getDmsInstanceEx(GetDmsInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.dms.instance.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDmsInstanceResponse());
    }

    /**
     * Description: 查询标签
     * Summary: 查询标签
     */
    public QuerySofamqLabelsResponse querySofamqLabels(QuerySofamqLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 查询标签
     * Summary: 查询标签
     */
    public QuerySofamqLabelsResponse querySofamqLabelsEx(QuerySofamqLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.labels.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqLabelsResponse());
    }

    /**
     * Description: SofaMQ 创建资源标签
     * Summary: 创建资源标签
     */
    public CreateSofamqLabelsResponse createSofamqLabels(CreateSofamqLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqLabelsEx(request, headers, runtime);
    }

    /**
     * Description: SofaMQ 创建资源标签
     * Summary: 创建资源标签
     */
    public CreateSofamqLabelsResponse createSofamqLabelsEx(CreateSofamqLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.labels.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqLabelsResponse());
    }

    /**
     * Description: 删除资源标签
     * Summary: 删除资源标签
     */
    public DeleteSofamqLabelsResponse deleteSofamqLabels(DeleteSofamqLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqLabelsEx(request, headers, runtime);
    }

    /**
     * Description: 删除资源标签
     * Summary: 删除资源标签
     */
    public DeleteSofamqLabelsResponse deleteSofamqLabelsEx(DeleteSofamqLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.labels.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqLabelsResponse());
    }

    /**
     * Description: 获取特定Topic的Schema列表
     * Summary: 获取Topic的Schema列表
     */
    public ListSofamqSchemaResponse listSofamqSchema(ListSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 获取特定Topic的Schema列表
     * Summary: 获取Topic的Schema列表
     */
    public ListSofamqSchemaResponse listSofamqSchemaEx(ListSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqSchemaResponse());
    }

    /**
     * Description: 创建Topic的Schema
     * Summary: 创建Schema
     */
    public CreateSofamqSchemaResponse createSofamqSchema(CreateSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 创建Topic的Schema
     * Summary: 创建Schema
     */
    public CreateSofamqSchemaResponse createSofamqSchemaEx(CreateSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSofamqSchemaResponse());
    }

    /**
     * Description: 获取特定Topic特定版本的Schema
     * Summary: 获取Schema详情
     */
    public GetSofamqSchemaResponse getSofamqSchema(GetSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 获取特定Topic特定版本的Schema
     * Summary: 获取Schema详情
     */
    public GetSofamqSchemaResponse getSofamqSchemaEx(GetSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSofamqSchemaResponse());
    }

    /**
     * Description: 根据Schema生成对应的POJO代码
     * Summary: 获取schema对应的代码
     */
    public ExportSofamqSchemaResponse exportSofamqSchema(ExportSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 根据Schema生成对应的POJO代码
     * Summary: 获取schema对应的代码
     */
    public ExportSofamqSchemaResponse exportSofamqSchemaEx(ExportSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportSofamqSchemaResponse());
    }

    /**
     * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
     * Summary: 更新schema
     */
    public UpdateSofamqSchemaResponse updateSofamqSchema(UpdateSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
     * Summary: 更新schema
     */
    public UpdateSofamqSchemaResponse updateSofamqSchemaEx(UpdateSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSofamqSchemaResponse());
    }

    /**
     * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
     * Summary: 获取Schema的版本号列表
     */
    public AllSofamqSchemaResponse allSofamqSchema(AllSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.allSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
     * Summary: 获取Schema的版本号列表
     */
    public AllSofamqSchemaResponse allSofamqSchemaEx(AllSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.all", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AllSofamqSchemaResponse());
    }

    /**
     * Description: 根据Schema解析消息体，查看消息体的详细数据
     * Summary: 查看消息内容
     */
    public ExportSofamqMessageResponse exportSofamqMessage(ExportSofamqMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportSofamqMessageEx(request, headers, runtime);
    }

    /**
     * Description: 根据Schema解析消息体，查看消息体的详细数据
     * Summary: 查看消息内容
     */
    public ExportSofamqMessageResponse exportSofamqMessageEx(ExportSofamqMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.message.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportSofamqMessageResponse());
    }

    /**
     * Description: 获取系统支持的兼容性策略
     * Summary: 获取系统支持的兼容性策略
     */
    public ListSofamqSchemacompatibilityResponse listSofamqSchemacompatibility(ListSofamqSchemacompatibilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqSchemacompatibilityEx(request, headers, runtime);
    }

    /**
     * Description: 获取系统支持的兼容性策略
     * Summary: 获取系统支持的兼容性策略
     */
    public ListSofamqSchemacompatibilityResponse listSofamqSchemacompatibilityEx(ListSofamqSchemacompatibilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schemacompatibility.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqSchemacompatibilityResponse());
    }

    /**
     * Description: 获取系统支持的序列化方式
     * Summary: 获取系统支持的序列化方式
     */
    public ListSofamqSchemaserializationResponse listSofamqSchemaserialization(ListSofamqSchemaserializationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqSchemaserializationEx(request, headers, runtime);
    }

    /**
     * Description: 获取系统支持的序列化方式
     * Summary: 获取系统支持的序列化方式
     */
    public ListSofamqSchemaserializationResponse listSofamqSchemaserializationEx(ListSofamqSchemaserializationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schemaserialization.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqSchemaserializationResponse());
    }

    /**
     * Description: 删除特定的Schema
     * Summary: 删除特定的Schema
     */
    public DeleteSofamqSchemaResponse deleteSofamqSchema(DeleteSofamqSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqSchemaEx(request, headers, runtime);
    }

    /**
     * Description: 删除特定的Schema
     * Summary: 删除特定的Schema
     */
    public DeleteSofamqSchemaResponse deleteSofamqSchemaEx(DeleteSofamqSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.schema.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqSchemaResponse());
    }

    /**
     * Description: Connector工单查询
     * Summary: Connector工单查询
     */
    public QuerySofamqConnectorprocessResponse querySofamqConnectorprocess(QuerySofamqConnectorprocessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorprocessEx(request, headers, runtime);
    }

    /**
     * Description: Connector工单查询
     * Summary: Connector工单查询
     */
    public QuerySofamqConnectorprocessResponse querySofamqConnectorprocessEx(QuerySofamqConnectorprocessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorprocessResponse());
    }

    /**
     * Description: Connector任务撤回审批
     * Summary: Connector任务撤回审批
     */
    public CancelSofamqConnectorprocessResponse cancelSofamqConnectorprocess(CancelSofamqConnectorprocessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSofamqConnectorprocessEx(request, headers, runtime);
    }

    /**
     * Description: Connector任务撤回审批
     * Summary: Connector任务撤回审批
     */
    public CancelSofamqConnectorprocessResponse cancelSofamqConnectorprocessEx(CancelSofamqConnectorprocessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSofamqConnectorprocessResponse());
    }

    /**
     * Description: Connector重新提交工单
     * Summary: Connector重新提交工单
     */
    public ResumeSofamqConnectorprocessResponse resumeSofamqConnectorprocess(ResumeSofamqConnectorprocessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeSofamqConnectorprocessEx(request, headers, runtime);
    }

    /**
     * Description: Connector重新提交工单
     * Summary: Connector重新提交工单
     */
    public ResumeSofamqConnectorprocessResponse resumeSofamqConnectorprocessEx(ResumeSofamqConnectorprocessRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeSofamqConnectorprocessResponse());
    }

    /**
     * Description: 校验一个connector的操作是否合法
     * Summary: 校验一个connector的操作是否合法
     */
    public VerifySofamqConnectoroperationResponse verifySofamqConnectoroperation(VerifySofamqConnectoroperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifySofamqConnectoroperationEx(request, headers, runtime);
    }

    /**
     * Description: 校验一个connector的操作是否合法
     * Summary: 校验一个connector的操作是否合法
     */
    public VerifySofamqConnectoroperationResponse verifySofamqConnectoroperationEx(VerifySofamqConnectoroperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectoroperation.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifySofamqConnectoroperationResponse());
    }

    /**
     * Description: 查看操作审计
     * Summary: 查看操作审计
     */
    public ListSofamqAuditorResponse listSofamqAuditor(ListSofamqAuditorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSofamqAuditorEx(request, headers, runtime);
    }

    /**
     * Description: 查看操作审计
     * Summary: 查看操作审计
     */
    public ListSofamqAuditorResponse listSofamqAuditorEx(ListSofamqAuditorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.auditor.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSofamqAuditorResponse());
    }

    /**
     * Description: connector任务对应的应用名称查询
     * Summary: connector任务对应的应用名称查询
     */
    public QuerySofamqConnectorjobappResponse querySofamqConnectorjobapp(QuerySofamqConnectorjobappRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorjobappEx(request, headers, runtime);
    }

    /**
     * Description: connector任务对应的应用名称查询
     * Summary: connector任务对应的应用名称查询
     */
    public QuerySofamqConnectorjobappResponse querySofamqConnectorjobappEx(QuerySofamqConnectorjobappRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjobapp.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorjobappResponse());
    }

    /**
     * Description: 取消Connector运行实例
     * Summary: 取消Connector运行实例
     */
    public CancelSofamqConnectorplanResponse cancelSofamqConnectorplan(CancelSofamqConnectorplanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSofamqConnectorplanEx(request, headers, runtime);
    }

    /**
     * Description: 取消Connector运行实例
     * Summary: 取消Connector运行实例
     */
    public CancelSofamqConnectorplanResponse cancelSofamqConnectorplanEx(CancelSofamqConnectorplanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSofamqConnectorplanResponse());
    }

    /**
     * Description: 重置任务实例位点
     * Summary: 重置任务实例位点
     */
    public SetSofamqConnectorplancheckpointResponse setSofamqConnectorplancheckpoint(SetSofamqConnectorplancheckpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setSofamqConnectorplancheckpointEx(request, headers, runtime);
    }

    /**
     * Description: 重置任务实例位点
     * Summary: 重置任务实例位点
     */
    public SetSofamqConnectorplancheckpointResponse setSofamqConnectorplancheckpointEx(SetSofamqConnectorplancheckpointRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplancheckpoint.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetSofamqConnectorplancheckpointResponse());
    }

    /**
     * Description: 活跃的conenctor实例【常驻任务】
     * Summary: 活跃的conenctor实例
     */
    public QuerySofamqConnectorplansingletonResponse querySofamqConnectorplansingleton(QuerySofamqConnectorplansingletonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorplansingletonEx(request, headers, runtime);
    }

    /**
     * Description: 活跃的conenctor实例【常驻任务】
     * Summary: 活跃的conenctor实例
     */
    public QuerySofamqConnectorplansingletonResponse querySofamqConnectorplansingletonEx(QuerySofamqConnectorplansingletonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorplansingleton.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorplansingletonResponse());
    }

    /**
     * Description: 获取延迟时间
     * Summary: 获取延迟时间
     */
    public QuerySofamqConnectorjobdelayResponse querySofamqConnectorjobdelay(QuerySofamqConnectorjobdelayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorjobdelayEx(request, headers, runtime);
    }

    /**
     * Description: 获取延迟时间
     * Summary: 获取延迟时间
     */
    public QuerySofamqConnectorjobdelayResponse querySofamqConnectorjobdelayEx(QuerySofamqConnectorjobdelayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjobdelay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorjobdelayResponse());
    }

    /**
     * Description: 常驻任务分区信息详情
     * Summary: 分区状态详情列名
     */
    public QuerySofamqConnectorjobpartitionstatuscolumnResponse querySofamqConnectorjobpartitionstatuscolumn(QuerySofamqConnectorjobpartitionstatuscolumnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorjobpartitionstatuscolumnEx(request, headers, runtime);
    }

    /**
     * Description: 常驻任务分区信息详情
     * Summary: 分区状态详情列名
     */
    public QuerySofamqConnectorjobpartitionstatuscolumnResponse querySofamqConnectorjobpartitionstatuscolumnEx(QuerySofamqConnectorjobpartitionstatuscolumnRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorjobpartitionstatuscolumnResponse());
    }

    /**
     * Description: 分区状态分页查询
     * Summary: 分区状态分页查询
     */
    public QuerySofamqConnectorjobpartitionstatusResponse querySofamqConnectorjobpartitionstatus(QuerySofamqConnectorjobpartitionstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectorjobpartitionstatusEx(request, headers, runtime);
    }

    /**
     * Description: 分区状态分页查询
     * Summary: 分区状态分页查询
     */
    public QuerySofamqConnectorjobpartitionstatusResponse querySofamqConnectorjobpartitionstatusEx(QuerySofamqConnectorjobpartitionstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectorjobpartitionstatusResponse());
    }

    /**
     * Description: 手动触发UI
     * Summary: 手动触发UI
     */
    public QuerySofamqConnectortriggerconfigsResponse querySofamqConnectortriggerconfigs(QuerySofamqConnectortriggerconfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConnectortriggerconfigsEx(request, headers, runtime);
    }

    /**
     * Description: 手动触发UI
     * Summary: 手动触发UI
     */
    public QuerySofamqConnectortriggerconfigsResponse querySofamqConnectortriggerconfigsEx(QuerySofamqConnectortriggerconfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.connectortriggerconfigs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConnectortriggerconfigsResponse());
    }

    /**
     * Description: 清除消费进度
     * Summary: 清除消费进度
     */
    public DeleteSofamqOffsetResponse deleteSofamqOffset(DeleteSofamqOffsetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSofamqOffsetEx(request, headers, runtime);
    }

    /**
     * Description: 清除消费进度
     * Summary: 清除消费进度
     */
    public DeleteSofamqOffsetResponse deleteSofamqOffsetEx(DeleteSofamqOffsetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.offset.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSofamqOffsetResponse());
    }

    /**
     * Description: 用户端查询消费进度
     * Summary: 用户端查询消费进度
     */
    public QuerySofamqConsumptionResponse querySofamqConsumption(QuerySofamqConsumptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySofamqConsumptionEx(request, headers, runtime);
    }

    /**
     * Description: 用户端查询消费进度
     * Summary: 用户端查询消费进度
     */
    public QuerySofamqConsumptionResponse querySofamqConsumptionEx(QuerySofamqConsumptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.sofamq.consumption.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySofamqConsumptionResponse());
    }

    /**
     * Description: 查询用户端topic的queue信息
     * Summary: 查询用户端topic的queue信息
     */
    public QueryUserTopicqueueResponse queryUserTopicqueue(QueryUserTopicqueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserTopicqueueEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户端topic的queue信息
     * Summary: 查询用户端topic的queue信息
     */
    public QueryUserTopicqueueResponse queryUserTopicqueueEx(QueryUserTopicqueueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.user.topicqueue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserTopicqueueResponse());
    }

    /**
     * Description: update next delivery time
     * Summary: update delivery time
     */
    public UpdateMessageNextdeliverytimeResponse updateMessageNextdeliverytime(UpdateMessageNextdeliverytimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMessageNextdeliverytimeEx(request, headers, runtime);
    }

    /**
     * Description: update next delivery time
     * Summary: update delivery time
     */
    public UpdateMessageNextdeliverytimeResponse updateMessageNextdeliverytimeEx(UpdateMessageNextdeliverytimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.message.nextdeliverytime.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMessageNextdeliverytimeResponse());
    }

    /**
     * Description: 统计未投递消息数量
     * Summary: 统计未投递消息数量
     */
    public CountMessageUndeliveryResponse countMessageUndelivery(CountMessageUndeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countMessageUndeliveryEx(request, headers, runtime);
    }

    /**
     * Description: 统计未投递消息数量
     * Summary: 统计未投递消息数量
     */
    public CountMessageUndeliveryResponse countMessageUndeliveryEx(CountMessageUndeliveryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.message.undelivery.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountMessageUndeliveryResponse());
    }

    /**
     * Description: 加载任务SLO配置页面
     * Summary: 任务SLO配置
     */
    public LoadConnectorjobSloviewResponse loadConnectorjobSloview(LoadConnectorjobSloviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadConnectorjobSloviewEx(request, headers, runtime);
    }

    /**
     * Description: 加载任务SLO配置页面
     * Summary: 任务SLO配置
     */
    public LoadConnectorjobSloviewResponse loadConnectorjobSloviewEx(LoadConnectorjobSloviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2.0", "sofa.mq.connectorjob.sloview.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadConnectorjobSloviewResponse());
    }
}
