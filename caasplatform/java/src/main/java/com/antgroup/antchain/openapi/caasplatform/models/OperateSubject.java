// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class OperateSubject extends TeaModel {
    // 主体名称
    /**
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("subject_name")
    @Validation(required = true)
    public String subjectName;

    // 证件类型,ID_CARD:身份证;PASSPORT:护照;BUSINESS_LICENSE:营业执照;OTHER:其他
    /**
     * <strong>example:</strong>
     * <p>ID_CARD</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码，可以脱敏传输
    /**
     * <strong>example:</strong>
     * <p>310***********1234</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 主体信息明文计算出来的hash数据
    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4e5f6789012345678901234567890abcd</p>
     */
    @NameInMap("subject_hash")
    @Validation(required = true)
    public String subjectHash;

    public static OperateSubject build(java.util.Map<String, ?> map) throws Exception {
        OperateSubject self = new OperateSubject();
        return TeaModel.build(map, self);
    }

    public OperateSubject setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }
    public String getSubjectName() {
        return this.subjectName;
    }

    public OperateSubject setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public OperateSubject setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public OperateSubject setSubjectHash(String subjectHash) {
        this.subjectHash = subjectHash;
        return this;
    }
    public String getSubjectHash() {
        return this.subjectHash;
    }

}
