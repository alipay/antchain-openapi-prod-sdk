// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ThoughtChainContent extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // source
    /**
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // children
    /**
     * <strong>example:</strong>
     * <p>children</p>
     */
    @NameInMap("children")
    @Validation(required = true)
    public String children;

    // timeConsuming
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("time_consuming")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String timeConsuming;

    // timeConsumingEpoch
    @NameInMap("time_consuming_epoch")
    @Validation(required = true)
    public Long timeConsumingEpoch;

    // latency
    @NameInMap("latency")
    @Validation(required = true)
    public Long latency;

    // type
    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ThoughtChainContent build(java.util.Map<String, ?> map) throws Exception {
        ThoughtChainContent self = new ThoughtChainContent();
        return TeaModel.build(map, self);
    }

    public ThoughtChainContent setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ThoughtChainContent setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ThoughtChainContent setChildren(String children) {
        this.children = children;
        return this;
    }
    public String getChildren() {
        return this.children;
    }

    public ThoughtChainContent setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
        return this;
    }
    public String getTimeConsuming() {
        return this.timeConsuming;
    }

    public ThoughtChainContent setTimeConsumingEpoch(Long timeConsumingEpoch) {
        this.timeConsumingEpoch = timeConsumingEpoch;
        return this;
    }
    public Long getTimeConsumingEpoch() {
        return this.timeConsumingEpoch;
    }

    public ThoughtChainContent setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public ThoughtChainContent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
