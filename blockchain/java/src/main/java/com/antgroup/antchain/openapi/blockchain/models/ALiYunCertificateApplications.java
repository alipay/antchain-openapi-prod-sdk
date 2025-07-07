// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunCertificateApplications extends TeaModel {
    // pagination
    /**
     * <strong>example:</strong>
     * <p>pagination</p>
     */
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // certificate_application
    /**
     * <strong>example:</strong>
     * <p>certificate_application</p>
     */
    @NameInMap("certificate_applications")
    public java.util.List<ALiYunCertificateApplication> certificateApplications;

    public static ALiYunCertificateApplications build(java.util.Map<String, ?> map) throws Exception {
        ALiYunCertificateApplications self = new ALiYunCertificateApplications();
        return TeaModel.build(map, self);
    }

    public ALiYunCertificateApplications setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

    public ALiYunCertificateApplications setCertificateApplications(java.util.List<ALiYunCertificateApplication> certificateApplications) {
        this.certificateApplications = certificateApplications;
        return this;
    }
    public java.util.List<ALiYunCertificateApplication> getCertificateApplications() {
        return this.certificateApplications;
    }

}
