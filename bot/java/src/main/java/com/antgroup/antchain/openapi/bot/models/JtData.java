// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtData extends TeaModel {
    // 数据的可信平台唯一ID
    @NameInMap("trustiot_id")
    @Validation(required = true)
    public Long trustiotId;

    // IoT可信平台设备唯一ID
    @NameInMap("trustiot_entity_id")
    @Validation(required = true)
    public Long trustiotEntityId;

    // 上报原文解析处理之后的数据
    @NameInMap("processed_content")
    @Validation(required = true)
    public String processedContent;

    // 和上一次上报数据里程对比，新增的里程数
    @NameInMap("delta_mileage")
    public Long deltaMileage;

    public static JtData build(java.util.Map<String, ?> map) throws Exception {
        JtData self = new JtData();
        return TeaModel.build(map, self);
    }

    public JtData setTrustiotId(Long trustiotId) {
        this.trustiotId = trustiotId;
        return this;
    }
    public Long getTrustiotId() {
        return this.trustiotId;
    }

    public JtData setTrustiotEntityId(Long trustiotEntityId) {
        this.trustiotEntityId = trustiotEntityId;
        return this;
    }
    public Long getTrustiotEntityId() {
        return this.trustiotEntityId;
    }

    public JtData setProcessedContent(String processedContent) {
        this.processedContent = processedContent;
        return this;
    }
    public String getProcessedContent() {
        return this.processedContent;
    }

    public JtData setDeltaMileage(Long deltaMileage) {
        this.deltaMileage = deltaMileage;
        return this;
    }
    public Long getDeltaMileage() {
        return this.deltaMileage;
    }

}
