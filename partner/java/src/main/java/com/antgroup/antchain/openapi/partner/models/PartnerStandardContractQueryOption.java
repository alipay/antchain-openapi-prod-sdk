// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerStandardContractQueryOption extends TeaModel {
    // 是否渲染
    @NameInMap("render_contract")
    @Validation(required = true)
    public Boolean renderContract;

    // 合同渲染上下文，jsonString格式，key值需要提前约定好	
    // 
    @NameInMap("render_context")
    @Validation(required = true)
    public String renderContext;

    public static PartnerStandardContractQueryOption build(java.util.Map<String, ?> map) throws Exception {
        PartnerStandardContractQueryOption self = new PartnerStandardContractQueryOption();
        return TeaModel.build(map, self);
    }

    public PartnerStandardContractQueryOption setRenderContract(Boolean renderContract) {
        this.renderContract = renderContract;
        return this;
    }
    public Boolean getRenderContract() {
        return this.renderContract;
    }

    public PartnerStandardContractQueryOption setRenderContext(String renderContext) {
        this.renderContext = renderContext;
        return this;
    }
    public String getRenderContext() {
        return this.renderContext;
    }

}
