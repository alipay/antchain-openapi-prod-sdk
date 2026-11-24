// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class PushCreativeMaterialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 素材id
    @NameInMap("material_id")
    public String materialId;

    // 产品码
    @NameInMap("product_code")
    public String productCode;

    // 素材格式类型
    @NameInMap("material_type")
    public String materialType;

    // 素材形式（素材包还是单素材）
    @NameInMap("material_form")
    public String materialForm;

    // 名称
    @NameInMap("name")
    public String name;

    // 素材大小
    @NameInMap("size_bytes")
    public Long sizeBytes;

    // 文件url
    @NameInMap("file_url")
    public String fileUrl;

    // 模版元数据
    @NameInMap("template_data")
    public MaterialTemplateData templateData;

    // 时长，单位秒
    @NameInMap("duration_seconds")
    public String durationSeconds;

    public static PushCreativeMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        PushCreativeMaterialResponse self = new PushCreativeMaterialResponse();
        return TeaModel.build(map, self);
    }

    public PushCreativeMaterialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushCreativeMaterialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushCreativeMaterialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushCreativeMaterialResponse setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public PushCreativeMaterialResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushCreativeMaterialResponse setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public PushCreativeMaterialResponse setMaterialForm(String materialForm) {
        this.materialForm = materialForm;
        return this;
    }
    public String getMaterialForm() {
        return this.materialForm;
    }

    public PushCreativeMaterialResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushCreativeMaterialResponse setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public PushCreativeMaterialResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public PushCreativeMaterialResponse setTemplateData(MaterialTemplateData templateData) {
        this.templateData = templateData;
        return this;
    }
    public MaterialTemplateData getTemplateData() {
        return this.templateData;
    }

    public PushCreativeMaterialResponse setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public String getDurationSeconds() {
        return this.durationSeconds;
    }

}
