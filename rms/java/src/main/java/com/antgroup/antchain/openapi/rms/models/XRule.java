// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XRule extends TeaModel {
    // rule type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    //  
    @NameInMap("interval")
    @Validation(required = true)
    public Long interval;

    // rule timeout
    @NameInMap("timeout")
    public Long timeout;

    //  
    @NameInMap("external_tags")
    public java.util.List<XExpression> externalTags;

    // log rules
    @NameInMap("rules")
    public java.util.List<XLogSubRule> rules;

    // metrics
    @NameInMap("metrics")
    public java.util.List<XExpression> metrics;

    // prometheus port
    @NameInMap("port")
    public Long port;

    // prometheus path
    @NameInMap("path")
    public String path;

    //  
    @NameInMap("scheme")
    public String scheme;

    //  
    @NameInMap("method")
    public String method;

    // tcp ports
    @NameInMap("ports")
    public java.util.List<Long> ports;

    //  
    @NameInMap("tags")
    public java.util.List<XExpression> tags;

    //  
    @NameInMap("expression")
    public String expression;

    //  
    @NameInMap("target")
    public XMatchExpression target;

    //  
    @NameInMap("local_host")
    public Boolean localHost;

    //   
    @NameInMap("ca_file")
    public String caFile;

    //  
    @NameInMap("cert_file")
    public String certFile;

    //  
    @NameInMap("key_file")
    public String keyFile;

    //  
    @NameInMap("bearer_token_file")
    public String bearerTokenFile;

    //  
    @NameInMap("insecure_skip_verify")
    public Boolean insecureSkipVerify;

    public static XRule build(java.util.Map<String, ?> map) throws Exception {
        XRule self = new XRule();
        return TeaModel.build(map, self);
    }

    public XRule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XRule setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public XRule setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public XRule setExternalTags(java.util.List<XExpression> externalTags) {
        this.externalTags = externalTags;
        return this;
    }
    public java.util.List<XExpression> getExternalTags() {
        return this.externalTags;
    }

    public XRule setRules(java.util.List<XLogSubRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<XLogSubRule> getRules() {
        return this.rules;
    }

    public XRule setMetrics(java.util.List<XExpression> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<XExpression> getMetrics() {
        return this.metrics;
    }

    public XRule setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public XRule setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public XRule setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public XRule setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public XRule setPorts(java.util.List<Long> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<Long> getPorts() {
        return this.ports;
    }

    public XRule setTags(java.util.List<XExpression> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<XExpression> getTags() {
        return this.tags;
    }

    public XRule setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public XRule setTarget(XMatchExpression target) {
        this.target = target;
        return this;
    }
    public XMatchExpression getTarget() {
        return this.target;
    }

    public XRule setLocalHost(Boolean localHost) {
        this.localHost = localHost;
        return this;
    }
    public Boolean getLocalHost() {
        return this.localHost;
    }

    public XRule setCaFile(String caFile) {
        this.caFile = caFile;
        return this;
    }
    public String getCaFile() {
        return this.caFile;
    }

    public XRule setCertFile(String certFile) {
        this.certFile = certFile;
        return this;
    }
    public String getCertFile() {
        return this.certFile;
    }

    public XRule setKeyFile(String keyFile) {
        this.keyFile = keyFile;
        return this;
    }
    public String getKeyFile() {
        return this.keyFile;
    }

    public XRule setBearerTokenFile(String bearerTokenFile) {
        this.bearerTokenFile = bearerTokenFile;
        return this;
    }
    public String getBearerTokenFile() {
        return this.bearerTokenFile;
    }

    public XRule setInsecureSkipVerify(Boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
        return this;
    }
    public Boolean getInsecureSkipVerify() {
        return this.insecureSkipVerify;
    }

}
