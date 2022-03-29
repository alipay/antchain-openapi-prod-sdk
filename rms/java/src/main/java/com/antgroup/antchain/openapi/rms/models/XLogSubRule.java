// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XLogSubRule extends TeaModel {
    // log path
    @NameInMap("path")
    public String path;

    //  
    @NameInMap("metrics")
    @Validation(required = true)
    public java.util.List<XExpression> metrics;

    //  
    @NameInMap("rule_tags")
    public java.util.List<XExpression> ruleTags;

    // 白名单
    @NameInMap("include_lines")
    public java.util.List<XExpression> includeLines;

    //  
    @NameInMap("exclude_lines")
    public java.util.List<XExpression> excludeLines;

    // x
    @NameInMap("paths")
    public java.util.List<String> paths;

    // x
    @NameInMap("path_link_prefix")
    public String pathLinkPrefix;

    //  
    @NameInMap("path_expression")
    public XExpression pathExpression;

    public static XLogSubRule build(java.util.Map<String, ?> map) throws Exception {
        XLogSubRule self = new XLogSubRule();
        return TeaModel.build(map, self);
    }

    public XLogSubRule setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public XLogSubRule setMetrics(java.util.List<XExpression> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<XExpression> getMetrics() {
        return this.metrics;
    }

    public XLogSubRule setRuleTags(java.util.List<XExpression> ruleTags) {
        this.ruleTags = ruleTags;
        return this;
    }
    public java.util.List<XExpression> getRuleTags() {
        return this.ruleTags;
    }

    public XLogSubRule setIncludeLines(java.util.List<XExpression> includeLines) {
        this.includeLines = includeLines;
        return this;
    }
    public java.util.List<XExpression> getIncludeLines() {
        return this.includeLines;
    }

    public XLogSubRule setExcludeLines(java.util.List<XExpression> excludeLines) {
        this.excludeLines = excludeLines;
        return this;
    }
    public java.util.List<XExpression> getExcludeLines() {
        return this.excludeLines;
    }

    public XLogSubRule setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public XLogSubRule setPathLinkPrefix(String pathLinkPrefix) {
        this.pathLinkPrefix = pathLinkPrefix;
        return this;
    }
    public String getPathLinkPrefix() {
        return this.pathLinkPrefix;
    }

    public XLogSubRule setPathExpression(XExpression pathExpression) {
        this.pathExpression = pathExpression;
        return this;
    }
    public XExpression getPathExpression() {
        return this.pathExpression;
    }

}
