// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractInfo extends TeaModel {
    // 待签署,SIGNING
    // 拒签,REJECT
    // 签署失败,SIGN_FAIL
    // 签署完成,FINISH
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 签署完成的合同文件 只有签署完成才有
    @NameInMap("signed_files")
    public java.util.List<BclFileInfo> signedFiles;

    public static BclContractInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractInfo self = new BclContractInfo();
        return TeaModel.build(map, self);
    }

    public BclContractInfo setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public BclContractInfo setSignedFiles(java.util.List<BclFileInfo> signedFiles) {
        this.signedFiles = signedFiles;
        return this;
    }
    public java.util.List<BclFileInfo> getSignedFiles() {
        return this.signedFiles;
    }

}
