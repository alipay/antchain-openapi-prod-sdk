// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PsiParticipantConfig extends TeaModel {
    // 参与方所属节点ID
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    // 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
    @NameInMap("matched_column")
    public String matchedColumn;

    // 参与方输入数据，参考结构体定义
    @NameInMap("input")
    @Validation(required = true)
    public ParticipantInput input;

    // 参与方输出数据，参考结构体定义
    @NameInMap("output")
    public ParticipantOutput output;

    public static PsiParticipantConfig build(java.util.Map<String, ?> map) throws Exception {
        PsiParticipantConfig self = new PsiParticipantConfig();
        return TeaModel.build(map, self);
    }

    public PsiParticipantConfig setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public PsiParticipantConfig setMatchedColumn(String matchedColumn) {
        this.matchedColumn = matchedColumn;
        return this;
    }
    public String getMatchedColumn() {
        return this.matchedColumn;
    }

    public PsiParticipantConfig setInput(ParticipantInput input) {
        this.input = input;
        return this;
    }
    public ParticipantInput getInput() {
        return this.input;
    }

    public PsiParticipantConfig setOutput(ParticipantOutput output) {
        this.output = output;
        return this;
    }
    public ParticipantOutput getOutput() {
        return this.output;
    }

}
