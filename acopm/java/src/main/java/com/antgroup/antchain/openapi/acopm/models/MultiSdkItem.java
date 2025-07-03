// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class MultiSdkItem extends TeaModel {
    // 任务id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("task_unique_id")
    @Validation(required = true)
    public String taskUniqueId;

    // 产品码
    /**
     * <strong>example:</strong>
     * <p>ABC</p>
     */
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // sdk版本
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("saassdk_version")
    @Validation(required = true)
    public String saassdkVersion;

    // sdk语言
    /**
     * <strong>example:</strong>
     * <p>python</p>
     */
    @NameInMap("lang")
    @Validation(required = true)
    public String lang;

    // 发布仓库
    /**
     * <strong>example:</strong>
     * <p><a href="http://maven">http://maven</a></p>
     */
    @NameInMap("repo")
    @Validation(required = true)
    public String repo;

    // 发布地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://maven">http://maven</a></p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>开始时间</p>
     */
    @NameInMap("start_tme")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTme;

    // 花费时间
    @NameInMap("cost")
    @Validation(required = true)
    public Long cost;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 打包状态
    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 查看链接
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("preview_link")
    public String previewLink;

    // 依赖
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("dependency")
    public String dependency;

    public static MultiSdkItem build(java.util.Map<String, ?> map) throws Exception {
        MultiSdkItem self = new MultiSdkItem();
        return TeaModel.build(map, self);
    }

    public MultiSdkItem setTaskUniqueId(String taskUniqueId) {
        this.taskUniqueId = taskUniqueId;
        return this;
    }
    public String getTaskUniqueId() {
        return this.taskUniqueId;
    }

    public MultiSdkItem setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public MultiSdkItem setSaassdkVersion(String saassdkVersion) {
        this.saassdkVersion = saassdkVersion;
        return this;
    }
    public String getSaassdkVersion() {
        return this.saassdkVersion;
    }

    public MultiSdkItem setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MultiSdkItem setRepo(String repo) {
        this.repo = repo;
        return this;
    }
    public String getRepo() {
        return this.repo;
    }

    public MultiSdkItem setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public MultiSdkItem setStartTme(String startTme) {
        this.startTme = startTme;
        return this;
    }
    public String getStartTme() {
        return this.startTme;
    }

    public MultiSdkItem setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public MultiSdkItem setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MultiSdkItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MultiSdkItem setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
        return this;
    }
    public String getPreviewLink() {
        return this.previewLink;
    }

    public MultiSdkItem setDependency(String dependency) {
        this.dependency = dependency;
        return this;
    }
    public String getDependency() {
        return this.dependency;
    }

}
