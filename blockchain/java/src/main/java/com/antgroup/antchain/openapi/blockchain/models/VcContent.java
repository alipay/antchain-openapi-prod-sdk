// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcContent extends TeaModel {
    // 可验证声明的唯一标识id，status 为 “1” 时候非空
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 可验证声明完整内容， status 为 “1” 时候非空
    @NameInMap("vc_content")
    @Validation(required = true)
    public String vcContent;

    // 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 被颁发当前可验证声明的目标did
    @NameInMap("did")
    public String did;

    // 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
    @NameInMap("message")
    public String message;

    public static VcContent build(java.util.Map<String, ?> map) throws Exception {
        VcContent self = new VcContent();
        return TeaModel.build(map, self);
    }

    public VcContent setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcContent setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public VcContent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VcContent setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public VcContent setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
