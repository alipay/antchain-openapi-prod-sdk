// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DciPublicationInfo extends TeaModel {
    // 作品发表状态
    /**
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("publication_status")
    @Validation(required = true)
    public String publicationStatus;

    // 首次发表日期
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("first_publication_date")
    @Validation(required = true)
    public String firstPublicationDate;

    // 首次发表地址
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("first_publication_place")
    public String firstPublicationPlace;

    // 首次发表地点地区编码
    /**
     * <strong>example:</strong>
     * <p>110101</p>
     */
    @NameInMap("first_publication_code")
    @Validation(required = true)
    public String firstPublicationCode;

    public static DciPublicationInfo build(java.util.Map<String, ?> map) throws Exception {
        DciPublicationInfo self = new DciPublicationInfo();
        return TeaModel.build(map, self);
    }

    public DciPublicationInfo setPublicationStatus(String publicationStatus) {
        this.publicationStatus = publicationStatus;
        return this;
    }
    public String getPublicationStatus() {
        return this.publicationStatus;
    }

    public DciPublicationInfo setFirstPublicationDate(String firstPublicationDate) {
        this.firstPublicationDate = firstPublicationDate;
        return this;
    }
    public String getFirstPublicationDate() {
        return this.firstPublicationDate;
    }

    public DciPublicationInfo setFirstPublicationPlace(String firstPublicationPlace) {
        this.firstPublicationPlace = firstPublicationPlace;
        return this;
    }
    public String getFirstPublicationPlace() {
        return this.firstPublicationPlace;
    }

    public DciPublicationInfo setFirstPublicationCode(String firstPublicationCode) {
        this.firstPublicationCode = firstPublicationCode;
        return this;
    }
    public String getFirstPublicationCode() {
        return this.firstPublicationCode;
    }

}
