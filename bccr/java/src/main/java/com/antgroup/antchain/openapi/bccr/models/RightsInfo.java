// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RightsInfo extends TeaModel {
    // 作品创作完成时间
    /**
     * <strong>example:</strong>
     * <p>1629364618790</p>
     */
    @NameInMap("completed_time")
    @Validation(required = true)
    public Long completedTime;

    // 作品创作完成地点（最长128个字符）
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("completed_place")
    @Validation(required = true, maxLength = 128)
    public String completedPlace;

    // 是否发表
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_publish")
    @Validation(required = true)
    public Boolean isPublish;

    // 发表时间（如果isPublish为true则必填）
    /**
     * <strong>example:</strong>
     * <p>1629969432519</p>
     */
    @NameInMap("publish_time")
    public Long publishTime;

    // 发表地点（如果isPublish为true则必填，最长128个字符）
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("publish_place")
    @Validation(maxLength = 128)
    public String publishPlace;

    // 发表网址（如果isPublish为true则必填，最长1024个字符）
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("publish_web")
    @Validation(maxLength = 1024)
    public String publishWeb;

    // 是否是作者
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_author")
    @Validation(required = true)
    public Boolean isAuthor;

    // 作者姓名（如果isAuthor为true则必填，最长32个字符）
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("author_cert_name")
    @Validation(maxLength = 32)
    public String authorCertName;

    // 作者身份证号（如果isAuthor为true则必填）
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("author_cert_no")
    @Validation(maxLength = 30)
    public String authorCertNo;

    public static RightsInfo build(java.util.Map<String, ?> map) throws Exception {
        RightsInfo self = new RightsInfo();
        return TeaModel.build(map, self);
    }

    public RightsInfo setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
        return this;
    }
    public Long getCompletedTime() {
        return this.completedTime;
    }

    public RightsInfo setCompletedPlace(String completedPlace) {
        this.completedPlace = completedPlace;
        return this;
    }
    public String getCompletedPlace() {
        return this.completedPlace;
    }

    public RightsInfo setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }
    public Boolean getIsPublish() {
        return this.isPublish;
    }

    public RightsInfo setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public RightsInfo setPublishPlace(String publishPlace) {
        this.publishPlace = publishPlace;
        return this;
    }
    public String getPublishPlace() {
        return this.publishPlace;
    }

    public RightsInfo setPublishWeb(String publishWeb) {
        this.publishWeb = publishWeb;
        return this;
    }
    public String getPublishWeb() {
        return this.publishWeb;
    }

    public RightsInfo setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
        return this;
    }
    public Boolean getIsAuthor() {
        return this.isAuthor;
    }

    public RightsInfo setAuthorCertName(String authorCertName) {
        this.authorCertName = authorCertName;
        return this;
    }
    public String getAuthorCertName() {
        return this.authorCertName;
    }

    public RightsInfo setAuthorCertNo(String authorCertNo) {
        this.authorCertNo = authorCertNo;
        return this;
    }
    public String getAuthorCertNo() {
        return this.authorCertNo;
    }

}
