// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSConfig extends TeaModel {
    // Logtail配置名称，同一Project下配置名必须唯一。
    // 只能包括小写字母、数字、连字符（-）和下划线（_）。
    // 必须以小写字母或者数字开头和结尾。
    // 长度必须为2~128字节。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 配置类型，支持plugin、file。
    @NameInMap("input_type")
    @Validation(required = true)
    public String inputType;

    // 输出类型，目前只支持LogService。
    @NameInMap("output_type")
    public String outputType;

    // 日志样例
    @NameInMap("log_sample")
    public String logSample;

    // 输入类型配置
    @NameInMap("input_detail")
    @Validation(required = true)
    public SLSConfigInputDetail inputDetail;

    // 输出类型配置
    @NameInMap("output_detail")
    @Validation(required = true)
    public SLSConfigOutputDetail outputDetail;

    public static SLSConfig build(java.util.Map<String, ?> map) throws Exception {
        SLSConfig self = new SLSConfig();
        return TeaModel.build(map, self);
    }

    public SLSConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SLSConfig setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public SLSConfig setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public SLSConfig setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public SLSConfig setInputDetail(SLSConfigInputDetail inputDetail) {
        this.inputDetail = inputDetail;
        return this;
    }
    public SLSConfigInputDetail getInputDetail() {
        return this.inputDetail;
    }

    public SLSConfig setOutputDetail(SLSConfigOutputDetail outputDetail) {
        this.outputDetail = outputDetail;
        return this;
    }
    public SLSConfigOutputDetail getOutputDetail() {
        return this.outputDetail;
    }

}
