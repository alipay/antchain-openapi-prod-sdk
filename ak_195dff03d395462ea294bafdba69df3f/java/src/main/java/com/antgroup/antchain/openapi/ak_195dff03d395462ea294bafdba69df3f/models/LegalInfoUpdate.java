// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class LegalInfoUpdate extends TeaModel {
    // 法人名称
    /**
     * <strong>example:</strong>
     * <p>法人名称</p>
     */
    @NameInMap("legal_name")
    public String legalName;

    // 法人证件号
    /**
     * <strong>example:</strong>
     * <p>法人证件号</p>
     */
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 法人证件正面
    @NameInMap("legal_cert_front_file")
    public FileInfo legalCertFrontFile;

    // 法人证件反面
    @NameInMap("legal_cert_back_file")
    public FileInfo legalCertBackFile;

    public static LegalInfoUpdate build(java.util.Map<String, ?> map) throws Exception {
        LegalInfoUpdate self = new LegalInfoUpdate();
        return TeaModel.build(map, self);
    }

    public LegalInfoUpdate setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public LegalInfoUpdate setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public LegalInfoUpdate setLegalCertFrontFile(FileInfo legalCertFrontFile) {
        this.legalCertFrontFile = legalCertFrontFile;
        return this;
    }
    public FileInfo getLegalCertFrontFile() {
        return this.legalCertFrontFile;
    }

    public LegalInfoUpdate setLegalCertBackFile(FileInfo legalCertBackFile) {
        this.legalCertBackFile = legalCertBackFile;
        return this;
    }
    public FileInfo getLegalCertBackFile() {
        return this.legalCertBackFile;
    }

}
