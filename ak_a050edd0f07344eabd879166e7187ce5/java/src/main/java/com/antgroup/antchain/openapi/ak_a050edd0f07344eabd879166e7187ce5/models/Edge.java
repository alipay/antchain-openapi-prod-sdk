// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Edge extends TeaModel {
    // 边的id，这个是前端生成的，用于图关系
    @NameInMap("edge_id")
    @Validation(required = true)
    public String edgeId;

    // key为上面content中的变量value为名称
    @NameInMap("variable_map")
    @Validation(required = true)
    public String variableMap;

    // 边的规则表达式
    @NameInMap("front_condition_expression")
    @Validation(required = true)
    public java.util.List<String> frontConditionExpression;

    // 前端图形相关
    @NameInMap("shape")
    @Validation(required = true)
    public Shape shape;

    // 边连接的上一个节点的feId
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 边连接的下一个节点的feId
    @NameInMap("target")
    @Validation(required = true)
    public String target;

    // 优先级，0~999
    @NameInMap("priority")
    @Validation(required = true)
    public Long priority;

    public static Edge build(java.util.Map<String, ?> map) throws Exception {
        Edge self = new Edge();
        return TeaModel.build(map, self);
    }

    public Edge setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

    public Edge setVariableMap(String variableMap) {
        this.variableMap = variableMap;
        return this;
    }
    public String getVariableMap() {
        return this.variableMap;
    }

    public Edge setFrontConditionExpression(java.util.List<String> frontConditionExpression) {
        this.frontConditionExpression = frontConditionExpression;
        return this;
    }
    public java.util.List<String> getFrontConditionExpression() {
        return this.frontConditionExpression;
    }

    public Edge setShape(Shape shape) {
        this.shape = shape;
        return this;
    }
    public Shape getShape() {
        return this.shape;
    }

    public Edge setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Edge setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public Edge setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

}
