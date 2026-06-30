// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeviceRiskReportResultData extends TeaModel {
    // webrtc_url
    /**
     * <strong>example:</strong>
     * <p>webrtc_url</p>
     */
    @NameInMap("webrtc_url")
    @Validation(required = true)
    public String webrtcUrl;

    // a_dynamic_swi
    /**
     * <strong>example:</strong>
     * <p>a_dynamic_swi</p>
     */
    @NameInMap("a_dynamic_swi")
    @Validation(required = true)
    public String aDynamicSwi;

    // dynamic_interval
    /**
     * <strong>example:</strong>
     * <p>dynamic_interval</p>
     */
    @NameInMap("dynamic_interval")
    @Validation(required = true)
    public String dynamicInterval;

    // color
    /**
     * <strong>example:</strong>
     * <p>color</p>
     */
    @NameInMap("color")
    @Validation(required = true)
    public String color;

    // os
    /**
     * <strong>example:</strong>
     * <p>os</p>
     */
    @NameInMap("os")
    @Validation(required = true)
    public String os;

    // dynamic_cmd
    /**
     * <strong>example:</strong>
     * <p>dynamic_cmd</p>
     */
    @NameInMap("dynamic_cmd")
    @Validation(required = true)
    public String dynamicCmd;

    // time_interval
    /**
     * <strong>example:</strong>
     * <p>time_interval</p>
     */
    @NameInMap("time_interval")
    @Validation(required = true)
    public String timeInterval;

    // dynamic_trace
    /**
     * <strong>example:</strong>
     * <p>dynamic_trace</p>
     */
    @NameInMap("dynamic_trace")
    @Validation(required = true)
    public String dynamicTrace;

    // dynamic_num
    /**
     * <strong>example:</strong>
     * <p>dynamic_num</p>
     */
    @NameInMap("dynamic_num")
    @Validation(required = true)
    public String dynamicNum;

    // result_type
    /**
     * <strong>example:</strong>
     * <p>result_type</p>
     */
    @NameInMap("result_type")
    @Validation(required = true)
    public String resultType;

    public static DeviceRiskReportResultData build(java.util.Map<String, ?> map) throws Exception {
        DeviceRiskReportResultData self = new DeviceRiskReportResultData();
        return TeaModel.build(map, self);
    }

    public DeviceRiskReportResultData setWebrtcUrl(String webrtcUrl) {
        this.webrtcUrl = webrtcUrl;
        return this;
    }
    public String getWebrtcUrl() {
        return this.webrtcUrl;
    }

    public DeviceRiskReportResultData setADynamicSwi(String aDynamicSwi) {
        this.aDynamicSwi = aDynamicSwi;
        return this;
    }
    public String getADynamicSwi() {
        return this.aDynamicSwi;
    }

    public DeviceRiskReportResultData setDynamicInterval(String dynamicInterval) {
        this.dynamicInterval = dynamicInterval;
        return this;
    }
    public String getDynamicInterval() {
        return this.dynamicInterval;
    }

    public DeviceRiskReportResultData setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public DeviceRiskReportResultData setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DeviceRiskReportResultData setDynamicCmd(String dynamicCmd) {
        this.dynamicCmd = dynamicCmd;
        return this;
    }
    public String getDynamicCmd() {
        return this.dynamicCmd;
    }

    public DeviceRiskReportResultData setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public String getTimeInterval() {
        return this.timeInterval;
    }

    public DeviceRiskReportResultData setDynamicTrace(String dynamicTrace) {
        this.dynamicTrace = dynamicTrace;
        return this;
    }
    public String getDynamicTrace() {
        return this.dynamicTrace;
    }

    public DeviceRiskReportResultData setDynamicNum(String dynamicNum) {
        this.dynamicNum = dynamicNum;
        return this;
    }
    public String getDynamicNum() {
        return this.dynamicNum;
    }

    public DeviceRiskReportResultData setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

}
