// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class BaasUnionInfo extends TeaModel {
    // 联盟名称
    @NameInMap("union_name")
    @Validation(required = true)
    public String unionName;

    // 描述
    @NameInMap("union_description")
    @Validation(required = true)
    public String unionDescription;

    // 联系人
    @NameInMap("union_user")
    @Validation(required = true)
    public String unionUser;

    // 联盟联系人手机号码
    @NameInMap("union_user_cell")
    @Validation(required = true)
    public String unionUserCell;

    // 联盟联系人邮箱
    @NameInMap("union_user_mail")
    @Validation(required = true)
    public String unionUserMail;

    public static BaasUnionInfo build(java.util.Map<String, ?> map) throws Exception {
        BaasUnionInfo self = new BaasUnionInfo();
        return TeaModel.build(map, self);
    }

    public BaasUnionInfo setUnionName(String unionName) {
        this.unionName = unionName;
        return this;
    }
    public String getUnionName() {
        return this.unionName;
    }

    public BaasUnionInfo setUnionDescription(String unionDescription) {
        this.unionDescription = unionDescription;
        return this;
    }
    public String getUnionDescription() {
        return this.unionDescription;
    }

    public BaasUnionInfo setUnionUser(String unionUser) {
        this.unionUser = unionUser;
        return this;
    }
    public String getUnionUser() {
        return this.unionUser;
    }

    public BaasUnionInfo setUnionUserCell(String unionUserCell) {
        this.unionUserCell = unionUserCell;
        return this;
    }
    public String getUnionUserCell() {
        return this.unionUserCell;
    }

    public BaasUnionInfo setUnionUserMail(String unionUserMail) {
        this.unionUserMail = unionUserMail;
        return this;
    }
    public String getUnionUserMail() {
        return this.unionUserMail;
    }

}
