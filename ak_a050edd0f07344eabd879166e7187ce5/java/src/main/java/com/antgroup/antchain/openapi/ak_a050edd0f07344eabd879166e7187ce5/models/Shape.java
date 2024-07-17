// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Shape extends TeaModel {
    // 边的样式
    @NameInMap("shape")
    @Validation(required = true)
    public String shape;

    // edgeId
    @NameInMap("edge_id")
    @Validation(required = true)
    public String edgeId;

    // 边起点的锚点位置
    @NameInMap("source_anchor")
    @Validation(required = true)
    public Long sourceAnchor;

    // 边终点的锚点位置
    @NameInMap("target_anchor")
    @Validation(required = true)
    public Long targetAnchor;

    public static Shape build(java.util.Map<String, ?> map) throws Exception {
        Shape self = new Shape();
        return TeaModel.build(map, self);
    }

    public Shape setShape(String shape) {
        this.shape = shape;
        return this;
    }
    public String getShape() {
        return this.shape;
    }

    public Shape setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

    public Shape setSourceAnchor(Long sourceAnchor) {
        this.sourceAnchor = sourceAnchor;
        return this;
    }
    public Long getSourceAnchor() {
        return this.sourceAnchor;
    }

    public Shape setTargetAnchor(Long targetAnchor) {
        this.targetAnchor = targetAnchor;
        return this;
    }
    public Long getTargetAnchor() {
        return this.targetAnchor;
    }

}
