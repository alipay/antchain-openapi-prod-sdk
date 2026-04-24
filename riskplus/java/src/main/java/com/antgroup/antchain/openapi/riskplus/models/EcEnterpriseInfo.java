// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcEnterpriseInfo extends TeaModel {
    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>张三的贸易有限公司</p>
     */
    @NameInMap("ent_name")
    @Validation(required = true)
    public String entName;

    // 申请企业证件类型
    /**
     * <strong>example:</strong>
     * <p>Ent04</p>
     */
    @NameInMap("ent_id_type")
    @Validation(required = true)
    public String entIdType;

    // 客户企业的统一社会信用代码，有企业信息则必输
    /**
     * <strong>example:</strong>
     * <p>91234500123400000R</p>
     */
    @NameInMap("ent_id_no")
    @Validation(required = true)
    public String entIdNo;

    public static EcEnterpriseInfo build(java.util.Map<String, ?> map) throws Exception {
        EcEnterpriseInfo self = new EcEnterpriseInfo();
        return TeaModel.build(map, self);
    }

    public EcEnterpriseInfo setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EcEnterpriseInfo setEntIdType(String entIdType) {
        this.entIdType = entIdType;
        return this;
    }
    public String getEntIdType() {
        return this.entIdType;
    }

    public EcEnterpriseInfo setEntIdNo(String entIdNo) {
        this.entIdNo = entIdNo;
        return this;
    }
    public String getEntIdNo() {
        return this.entIdNo;
    }

}
