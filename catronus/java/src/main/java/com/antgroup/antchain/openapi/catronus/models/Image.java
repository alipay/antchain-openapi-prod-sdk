// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Image extends TeaModel {
    // 镜像Ref
    @NameInMap("image_ref")
    @Validation(required = true)
    public String imageRef;

    // 镜像标签
    @NameInMap("image_tag")
    @Validation(required = true)
    public String imageTag;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 扫描状态
    @NameInMap("scan_status")
    @Validation(required = true)
    public String scanStatus;

    // 镜像漏洞
    @NameInMap("image_vul")
    @Validation(required = true)
    public Long imageVul;

    // 镜像风险漏洞
    @NameInMap("image_risk_vul")
    @Validation(required = true)
    public Long imageRiskVul;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static Image build(java.util.Map<String, ?> map) throws Exception {
        Image self = new Image();
        return TeaModel.build(map, self);
    }

    public Image setImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }
    public String getImageRef() {
        return this.imageRef;
    }

    public Image setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public Image setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Image setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }
    public String getScanStatus() {
        return this.scanStatus;
    }

    public Image setImageVul(Long imageVul) {
        this.imageVul = imageVul;
        return this;
    }
    public Long getImageVul() {
        return this.imageVul;
    }

    public Image setImageRiskVul(Long imageRiskVul) {
        this.imageRiskVul = imageRiskVul;
        return this;
    }
    public Long getImageRiskVul() {
        return this.imageRiskVul;
    }

    public Image setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Image setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
