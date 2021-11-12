// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeConfigTimeInfo extends TeaModel {
    // 正版码申请时间，商家申请正版码第一批数量的时间
    @NameInMap("code_apply_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String codeApplyTime;

    // 正版码配置时间
    @NameInMap("code_set_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String codeSetTime;

    // 正版码生效时间
    @NameInMap("code_effect_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String codeEffectTime;

    public static IPCodeConfigTimeInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeConfigTimeInfo self = new IPCodeConfigTimeInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeConfigTimeInfo setCodeApplyTime(String codeApplyTime) {
        this.codeApplyTime = codeApplyTime;
        return this;
    }
    public String getCodeApplyTime() {
        return this.codeApplyTime;
    }

    public IPCodeConfigTimeInfo setCodeSetTime(String codeSetTime) {
        this.codeSetTime = codeSetTime;
        return this;
    }
    public String getCodeSetTime() {
        return this.codeSetTime;
    }

    public IPCodeConfigTimeInfo setCodeEffectTime(String codeEffectTime) {
        this.codeEffectTime = codeEffectTime;
        return this;
    }
    public String getCodeEffectTime() {
        return this.codeEffectTime;
    }

}
