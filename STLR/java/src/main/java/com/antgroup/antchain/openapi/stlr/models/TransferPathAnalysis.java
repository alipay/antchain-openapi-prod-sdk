// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class TransferPathAnalysis extends TeaModel {
    // 所属领域
    /**
     * <strong>example:</strong>
     * <p>系统能效提升</p>
     */
    @NameInMap("field")
    @Validation(required = true)
    public String field;

    // 目录编号
    /**
     * <strong>example:</strong>
     * <p>1.12</p>
     */
    @NameInMap("index_number")
    @Validation(required = true)
    public String indexNumber;

    // 目录内容
    /**
     * <strong>example:</strong>
     * <p>低温余热有机工质郎肯循环（ORC）发电</p>
     */
    @NameInMap("index_content")
    @Validation(required = true)
    public String indexContent;

    // 技术标准说明
    /**
     * <strong>example:</strong>
     * <p>基于有机朗肯循环（ORC）原理，通过蒸发器回收95-300℃的热水、热液、蒸汽、烟气中的低温余热，通过向心涡轮和发电机将热量转换成高品质电能。参考标准《低温余热双循环发电装置》（GB/T 37819-2019）、《低温双循环余热回收利用装置性能测试方法》（GB/T 40286-2021）等。</p>
     */
    @NameInMap("detail")
    @Validation(required = true)
    public String detail;

    // 企业是否采取该路径
    /**
     * <strong>example:</strong>
     * <p>长期目标</p>
     */
    @NameInMap("target")
    @Validation(required = true)
    public String target;

    public static TransferPathAnalysis build(java.util.Map<String, ?> map) throws Exception {
        TransferPathAnalysis self = new TransferPathAnalysis();
        return TeaModel.build(map, self);
    }

    public TransferPathAnalysis setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public TransferPathAnalysis setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
        return this;
    }
    public String getIndexNumber() {
        return this.indexNumber;
    }

    public TransferPathAnalysis setIndexContent(String indexContent) {
        this.indexContent = indexContent;
        return this;
    }
    public String getIndexContent() {
        return this.indexContent;
    }

    public TransferPathAnalysis setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public TransferPathAnalysis setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
