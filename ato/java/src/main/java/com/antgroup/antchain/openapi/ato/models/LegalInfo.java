// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class LegalInfo extends TeaModel {
    // 法人名称
    /**
     * <strong>example:</strong>
     * <p>法人名称</p>
     */
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 法人证件号
    /**
     * <strong>example:</strong>
     * <p>法人证件号</p>
     */
    @NameInMap("legal_cert_no")
    @Validation(required = true)
    public String legalCertNo;

    // 法人证件正面
    @NameInMap("legal_cert_front_file")
    @Validation(required = true)
    public FileInfo legalCertFrontFile;

    // 法人证件反面
    @NameInMap("legal_cert_back_file")
    @Validation(required = true)
    public FileInfo legalCertBackFile;

    public static LegalInfo build(java.util.Map<String, ?> map) throws Exception {
        LegalInfo self = new LegalInfo();
        return TeaModel.build(map, self);
    }

    public LegalInfo setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public LegalInfo setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public LegalInfo setLegalCertFrontFile(FileInfo legalCertFrontFile) {
        this.legalCertFrontFile = legalCertFrontFile;
        return this;
    }
    public FileInfo getLegalCertFrontFile() {
        return this.legalCertFrontFile;
    }

    public LegalInfo setLegalCertBackFile(FileInfo legalCertBackFile) {
        this.legalCertBackFile = legalCertBackFile;
        return this;
    }
    public FileInfo getLegalCertBackFile() {
        return this.legalCertBackFile;
    }

}
