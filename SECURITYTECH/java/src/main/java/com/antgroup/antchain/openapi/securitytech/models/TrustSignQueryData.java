// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TrustSignQueryData extends TeaModel {
    // 请求唯一标识Id
    /**
     * <strong>example:</strong>
     * <p>111111111111111</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 签约方案码
    /**
     * <strong>example:</strong>
     * <p>011fda32a0046d0e8a8be6b94b367fb3</p>
     */
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-03-20</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2024-03-20</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 签约文件列表
    @NameInMap("file_list")
    @Validation(required = true)
    public java.util.List<String> fileList;

    public static TrustSignQueryData build(java.util.Map<String, ?> map) throws Exception {
        TrustSignQueryData self = new TrustSignQueryData();
        return TeaModel.build(map, self);
    }

    public TrustSignQueryData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrustSignQueryData setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public TrustSignQueryData setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

    public TrustSignQueryData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TrustSignQueryData setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TrustSignQueryData setFileList(java.util.List<String> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<String> getFileList() {
        return this.fileList;
    }

}
