// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class PartyInfo extends TeaModel {
    //  
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    //  
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    //  
    @NameInMap("private_key")
    @Validation(required = true)
    public String privateKey;

    //  
    @NameInMap("private_key_passwd")
    @Validation(required = true)
    public String privateKeyPasswd;

    //  
    @NameInMap("recover_key")
    @Validation(required = true)
    public String recoverKey;

    //  
    @NameInMap("recovery_key_passwd")
    @Validation(required = true)
    public String recoveryKeyPasswd;

    public static PartyInfo build(java.util.Map<String, ?> map) throws Exception {
        PartyInfo self = new PartyInfo();
        return TeaModel.build(map, self);
    }

    public PartyInfo setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public PartyInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PartyInfo setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public PartyInfo setPrivateKeyPasswd(String privateKeyPasswd) {
        this.privateKeyPasswd = privateKeyPasswd;
        return this;
    }
    public String getPrivateKeyPasswd() {
        return this.privateKeyPasswd;
    }

    public PartyInfo setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

    public PartyInfo setRecoveryKeyPasswd(String recoveryKeyPasswd) {
        this.recoveryKeyPasswd = recoveryKeyPasswd;
        return this;
    }
    public String getRecoveryKeyPasswd() {
        return this.recoveryKeyPasswd;
    }

}
