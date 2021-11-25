// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class PartyBFirmDto extends TeaModel {
    // 乙方统一社会信用代码
    @NameInMap("party_b_bidder_code")
    @Validation(required = true)
    public String partyBBidderCode;

    // 乙方名称
    @NameInMap("party_b_name")
    @Validation(required = true)
    public String partyBName;

    // 乙方授权代表Did
    @NameInMap("party_b_audit_did")
    @Validation(required = true)
    public String partyBAuditDid;

    public static PartyBFirmDto build(java.util.Map<String, ?> map) throws Exception {
        PartyBFirmDto self = new PartyBFirmDto();
        return TeaModel.build(map, self);
    }

    public PartyBFirmDto setPartyBBidderCode(String partyBBidderCode) {
        this.partyBBidderCode = partyBBidderCode;
        return this;
    }
    public String getPartyBBidderCode() {
        return this.partyBBidderCode;
    }

    public PartyBFirmDto setPartyBName(String partyBName) {
        this.partyBName = partyBName;
        return this;
    }
    public String getPartyBName() {
        return this.partyBName;
    }

    public PartyBFirmDto setPartyBAuditDid(String partyBAuditDid) {
        this.partyBAuditDid = partyBAuditDid;
        return this;
    }
    public String getPartyBAuditDid() {
        return this.partyBAuditDid;
    }

}
