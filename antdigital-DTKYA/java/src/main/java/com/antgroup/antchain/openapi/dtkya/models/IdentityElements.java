// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class IdentityElements extends TeaModel {
    // 个人证件姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 个人证件类型
    /**
     * <strong>example:</strong>
     * <p>ID_CARD</p>
     */
    @NameInMap("id_type")
    public String idType;

    // 个人证件号码
    /**
     * <strong>example:</strong>
     * <p>110101199001011234</p>
     */
    @NameInMap("id_number")
    public String idNumber;

    // 企业法定名称
    /**
     * <strong>example:</strong>
     * <p>示例科技有限公司</p>
     */
    @NameInMap("enterprise_name")
    public String enterpriseName;

    // 企业统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>91310000TEST000001</p>
     */
    @NameInMap("unified_social_credit_code")
    public String unifiedSocialCreditCode;

    public static IdentityElements build(java.util.Map<String, ?> map) throws Exception {
        IdentityElements self = new IdentityElements();
        return TeaModel.build(map, self);
    }

    public IdentityElements setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IdentityElements setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public IdentityElements setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public IdentityElements setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public IdentityElements setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
        return this;
    }
    public String getUnifiedSocialCreditCode() {
        return this.unifiedSocialCreditCode;
    }

}
