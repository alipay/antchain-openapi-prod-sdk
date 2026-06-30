// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ResembleRiskData extends TeaModel {
    // 重复作品ID
    /**
     * <strong>example:</strong>
     * <p>重复作品ID</p>
     */
    @NameInMap("work_id")
    @Validation(required = true)
    public String workId;

    // 相似作品的名称
    /**
     * <strong>example:</strong>
     * <p>相似作品的名称</p>
     */
    @NameInMap("work_name")
    public String workName;

    // 相似作品的类型
    /**
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("work_type")
    public String workType;

    // 相似值
    /**
     * <strong>example:</strong>
     * <p>相似值</p>
     */
    @NameInMap("score")
    public String score;

    // 相似作品下载凭证
    /**
     * <strong>example:</strong>
     * <p>相似作品下载凭证</p>
     */
    @NameInMap("work_file_id")
    public String workFileId;

    // 相似明细
    @NameInMap("resemble_details")
    public java.util.List<ResembleDetail> resembleDetails;

    public static ResembleRiskData build(java.util.Map<String, ?> map) throws Exception {
        ResembleRiskData self = new ResembleRiskData();
        return TeaModel.build(map, self);
    }

    public ResembleRiskData setWorkId(String workId) {
        this.workId = workId;
        return this;
    }
    public String getWorkId() {
        return this.workId;
    }

    public ResembleRiskData setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

    public ResembleRiskData setWorkType(String workType) {
        this.workType = workType;
        return this;
    }
    public String getWorkType() {
        return this.workType;
    }

    public ResembleRiskData setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public ResembleRiskData setWorkFileId(String workFileId) {
        this.workFileId = workFileId;
        return this;
    }
    public String getWorkFileId() {
        return this.workFileId;
    }

    public ResembleRiskData setResembleDetails(java.util.List<ResembleDetail> resembleDetails) {
        this.resembleDetails = resembleDetails;
        return this;
    }
    public java.util.List<ResembleDetail> getResembleDetails() {
        return this.resembleDetails;
    }

}
