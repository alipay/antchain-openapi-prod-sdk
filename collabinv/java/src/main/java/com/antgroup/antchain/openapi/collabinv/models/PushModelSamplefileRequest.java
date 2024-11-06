// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class PushModelSamplefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 开始日期：示例 YYYYMMDD
    @NameInMap("begin_date")
    @Validation(required = true)
    public String beginDate;

    // 样本内采样日期截止日：YYYYMMDD
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 样本数据量
    @NameInMap("org_nums")
    @Validation(required = true)
    public Long orgNums;

    // 样本批次号，唯一，建议：租户code+时间戳
    @NameInMap("sample_code")
    @Validation(required = true)
    public String sampleCode;

    // 文件路径，bucket 下路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 文件名,以.csv结尾，分隔符为  ","号
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static PushModelSamplefileRequest build(java.util.Map<String, ?> map) throws Exception {
        PushModelSamplefileRequest self = new PushModelSamplefileRequest();
        return TeaModel.build(map, self);
    }

    public PushModelSamplefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushModelSamplefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushModelSamplefileRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public PushModelSamplefileRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public PushModelSamplefileRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public PushModelSamplefileRequest setOrgNums(Long orgNums) {
        this.orgNums = orgNums;
        return this;
    }
    public Long getOrgNums() {
        return this.orgNums;
    }

    public PushModelSamplefileRequest setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
        return this;
    }
    public String getSampleCode() {
        return this.sampleCode;
    }

    public PushModelSamplefileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public PushModelSamplefileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
