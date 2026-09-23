// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SummaryAgenticnexusDashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标领域: PREFILTER 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    @NameInMap("module")
    @Validation(required = true)
    public String module;

    // 待总结的输入内容（该领域指标/观察文本）
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // 原始数据 JSON 字符串（补充上下文）
    @NameInMap("raw_data")
    public String rawData;

    // 数据日期 yyyyMMdd，仅作上下文/记录,默认当天
    @NameInMap("date")
    public String date;

    public static SummaryAgenticnexusDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        SummaryAgenticnexusDashboardRequest self = new SummaryAgenticnexusDashboardRequest();
        return TeaModel.build(map, self);
    }

    public SummaryAgenticnexusDashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SummaryAgenticnexusDashboardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SummaryAgenticnexusDashboardRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public SummaryAgenticnexusDashboardRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SummaryAgenticnexusDashboardRequest setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

    public SummaryAgenticnexusDashboardRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
