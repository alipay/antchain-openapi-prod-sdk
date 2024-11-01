// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class BenefitWriteOffMonthFileData extends TeaModel {
    // 所属月份
    @NameInMap("billing_month")
    @Validation(required = true)
    public String billingMonth;

    // AFTS 上传到文件 id
    @NameInMap("file_filed_id")
    @Validation(required = true)
    public String fileFiledId;

    public static BenefitWriteOffMonthFileData build(java.util.Map<String, ?> map) throws Exception {
        BenefitWriteOffMonthFileData self = new BenefitWriteOffMonthFileData();
        return TeaModel.build(map, self);
    }

    public BenefitWriteOffMonthFileData setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
        return this;
    }
    public String getBillingMonth() {
        return this.billingMonth;
    }

    public BenefitWriteOffMonthFileData setFileFiledId(String fileFiledId) {
        this.fileFiledId = fileFiledId;
        return this;
    }
    public String getFileFiledId() {
        return this.fileFiledId;
    }

}
