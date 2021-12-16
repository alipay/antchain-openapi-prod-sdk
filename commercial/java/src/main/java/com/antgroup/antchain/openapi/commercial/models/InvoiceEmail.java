// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class InvoiceEmail extends TeaModel {
    // 电子邮箱
    @NameInMap("email")
    public String email;

    // 主键id
    @NameInMap("id")
    public Long id;

    // 唯一id
    @NameInMap("unique_id")
    public String uniqueId;

    public static InvoiceEmail build(java.util.Map<String, ?> map) throws Exception {
        InvoiceEmail self = new InvoiceEmail();
        return TeaModel.build(map, self);
    }

    public InvoiceEmail setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public InvoiceEmail setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public InvoiceEmail setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
