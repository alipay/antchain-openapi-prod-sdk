// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotsuccessProductKnowledgebaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 映射kbName
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 映射kbDescription
    @NameInMap("description")
    public String description;

    // 枚举:OFFICIAL,CUSTOM
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 映射docCount
    @NameInMap("content_count")
    @Validation(required = true)
    public Long contentCount;

    @NameInMap("paragraph_count")
    @Validation(required = true)
    public Long paragraphCount;

    // 沿现有关联查询聚合；不新增版本账本
    @NameInMap("associated_product_keys")
    @Validation(required = true)
    public java.util.List<String> associatedProductKeys;

    public static CreateIotsuccessProductKnowledgebaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIotsuccessProductKnowledgebaseResponse self = new CreateIotsuccessProductKnowledgebaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateIotsuccessProductKnowledgebaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setContentCount(Long contentCount) {
        this.contentCount = contentCount;
        return this;
    }
    public Long getContentCount() {
        return this.contentCount;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setParagraphCount(Long paragraphCount) {
        this.paragraphCount = paragraphCount;
        return this;
    }
    public Long getParagraphCount() {
        return this.paragraphCount;
    }

    public CreateIotsuccessProductKnowledgebaseResponse setAssociatedProductKeys(java.util.List<String> associatedProductKeys) {
        this.associatedProductKeys = associatedProductKeys;
        return this;
    }
    public java.util.List<String> getAssociatedProductKeys() {
        return this.associatedProductKeys;
    }

}
