// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdip.models;

import com.aliyun.tea.*;

public class FlowRunOutput extends TeaModel {
    // Flow 输出定义中的稳定字段标识。
    /**
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("output_key")
    @Validation(required = true)
    public String outputKey;

    // 输出类型，支持 STRING、NUMBER、BOOLEAN、JSON、FILE。
    /**
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("output_type")
    @Validation(required = true)
    public String outputType;

    // 输出值。FILE 类型直接返回短期下载地址；JSON 类型返回 JSON 字符串；其他类型返回对应值的字符串形式。
    /**
     * <strong>example:</strong>
     * <p>风险较低</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static FlowRunOutput build(java.util.Map<String, ?> map) throws Exception {
        FlowRunOutput self = new FlowRunOutput();
        return TeaModel.build(map, self);
    }

    public FlowRunOutput setOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }
    public String getOutputKey() {
        return this.outputKey;
    }

    public FlowRunOutput setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public FlowRunOutput setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
