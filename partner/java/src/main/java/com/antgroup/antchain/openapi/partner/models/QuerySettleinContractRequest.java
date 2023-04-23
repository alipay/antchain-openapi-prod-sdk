// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QuerySettleinContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用户租户间功能和数据隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 一级合作类型
    @NameInMap("l1_partner_type")
    @Validation(required = true)
    public String l1PartnerType;

    // 二级合作类型
    @NameInMap("l2_partner_type")
    @Validation(required = true)
    public String l2PartnerType;

    // 伙伴标准合同查询扩展选项
    @NameInMap("option")
    public PartnerStandardContractQueryOption option;

    // 合同渲染上下文，jsonString格式，key值需要提前约定好
    @NameInMap("render_context")
    public String renderContext;

    public static QuerySettleinContractRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySettleinContractRequest self = new QuerySettleinContractRequest();
        return TeaModel.build(map, self);
    }

    public QuerySettleinContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySettleinContractRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QuerySettleinContractRequest setL1PartnerType(String l1PartnerType) {
        this.l1PartnerType = l1PartnerType;
        return this;
    }
    public String getL1PartnerType() {
        return this.l1PartnerType;
    }

    public QuerySettleinContractRequest setL2PartnerType(String l2PartnerType) {
        this.l2PartnerType = l2PartnerType;
        return this;
    }
    public String getL2PartnerType() {
        return this.l2PartnerType;
    }

    public QuerySettleinContractRequest setOption(PartnerStandardContractQueryOption option) {
        this.option = option;
        return this;
    }
    public PartnerStandardContractQueryOption getOption() {
        return this.option;
    }

    public QuerySettleinContractRequest setRenderContext(String renderContext) {
        this.renderContext = renderContext;
        return this;
    }
    public String getRenderContext() {
        return this.renderContext;
    }

}
