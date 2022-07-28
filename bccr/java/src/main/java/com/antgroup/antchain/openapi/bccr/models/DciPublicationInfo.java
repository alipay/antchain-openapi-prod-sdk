// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DciPublicationInfo extends TeaModel {
    // 作品发表状态
    @NameInMap("publication_status")
    @Validation(required = true)
    public String publicationStatus;

    // 首次发表日期
    @NameInMap("first_publication_date")
    @Validation(required = true)
    public String firstPublicationDate;

    // 首次发表地址
    @NameInMap("first_publication_place")
    @Validation(required = true)
    public String firstPublicationPlace;

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

}
