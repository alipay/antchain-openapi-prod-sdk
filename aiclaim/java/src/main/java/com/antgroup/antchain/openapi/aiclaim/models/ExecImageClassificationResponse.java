// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class ExecImageClassificationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务号，⽤于对账
    @NameInMap("batch_no")
    public String batchNo;

    // 枚举类型，详见接入文档说明
    @NameInMap("image_type")
    public String imageType;

    // 图片描述
    @NameInMap("description")
    public String description;

    // 增强后的图片
    @NameInMap("enhance_image")
    public String enhanceImage;

    // 是否模糊，返回0表示清晰，返回1表示模糊
    @NameInMap("is_blur")
    public Boolean isBlur;

    // 是否复印件，返回0表示⾮ 复印件，返回1表示复印件
    @NameInMap("is_copyfile")
    public Boolean isCopyfile;

    // 是否翻拍件，返回0表示⾮ 翻拍件，返回1表示翻拍件
    @NameInMap("is_remakefile")
    public Boolean isRemakefile;

    // 材料是否不完整（有遮 挡），返回0表示完整（⽆ 遮挡），返回1表示材料不完 整（有遮挡）
    @NameInMap("is_uncomplet")
    public Boolean isUncomplet;

    // 单张图片中是否包含2份及以上材料，0表示只有1份，1表示两份及以上
    @NameInMap("is_multi_material")
    public Boolean isMultiMaterial;

    public static ExecImageClassificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecImageClassificationResponse self = new ExecImageClassificationResponse();
        return TeaModel.build(map, self);
    }

    public ExecImageClassificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecImageClassificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecImageClassificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecImageClassificationResponse setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public ExecImageClassificationResponse setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ExecImageClassificationResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExecImageClassificationResponse setEnhanceImage(String enhanceImage) {
        this.enhanceImage = enhanceImage;
        return this;
    }
    public String getEnhanceImage() {
        return this.enhanceImage;
    }

    public ExecImageClassificationResponse setIsBlur(Boolean isBlur) {
        this.isBlur = isBlur;
        return this;
    }
    public Boolean getIsBlur() {
        return this.isBlur;
    }

    public ExecImageClassificationResponse setIsCopyfile(Boolean isCopyfile) {
        this.isCopyfile = isCopyfile;
        return this;
    }
    public Boolean getIsCopyfile() {
        return this.isCopyfile;
    }

    public ExecImageClassificationResponse setIsRemakefile(Boolean isRemakefile) {
        this.isRemakefile = isRemakefile;
        return this;
    }
    public Boolean getIsRemakefile() {
        return this.isRemakefile;
    }

    public ExecImageClassificationResponse setIsUncomplet(Boolean isUncomplet) {
        this.isUncomplet = isUncomplet;
        return this;
    }
    public Boolean getIsUncomplet() {
        return this.isUncomplet;
    }

    public ExecImageClassificationResponse setIsMultiMaterial(Boolean isMultiMaterial) {
        this.isMultiMaterial = isMultiMaterial;
        return this;
    }
    public Boolean getIsMultiMaterial() {
        return this.isMultiMaterial;
    }

}
