// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class EntityRepresentative extends TeaModel {
    // 经办人证件姓名
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 经办人证件类型
    /**
     * <strong>example:</strong>
     * <p>ID_CARD</p>
     */
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 经办人证件号码
    /**
     * <strong>example:</strong>
     * <p>110101199001011234</p>
     */
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 经办人实人认证记录 ID，可为空
    /**
     * <strong>example:</strong>
     * <p>person-verification-101</p>
     */
    @NameInMap("real_person_ref")
    public String realPersonRef;

    // 企业授权记录 ID，可为空
    /**
     * <strong>example:</strong>
     * <p>enterprise-authority-201</p>
     */
    @NameInMap("authority_ref")
    public String authorityRef;

    public static EntityRepresentative build(java.util.Map<String, ?> map) throws Exception {
        EntityRepresentative self = new EntityRepresentative();
        return TeaModel.build(map, self);
    }

    public EntityRepresentative setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EntityRepresentative setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public EntityRepresentative setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public EntityRepresentative setRealPersonRef(String realPersonRef) {
        this.realPersonRef = realPersonRef;
        return this;
    }
    public String getRealPersonRef() {
        return this.realPersonRef;
    }

    public EntityRepresentative setAuthorityRef(String authorityRef) {
        this.authorityRef = authorityRef;
        return this;
    }
    public String getAuthorityRef() {
        return this.authorityRef;
    }

}
