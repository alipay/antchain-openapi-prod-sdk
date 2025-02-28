// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderPrimiseExcelInfo extends TeaModel {
    // 文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    //  生成中, 已生成,无效
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    public static OrderPrimiseExcelInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderPrimiseExcelInfo self = new OrderPrimiseExcelInfo();
        return TeaModel.build(map, self);
    }

    public OrderPrimiseExcelInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public OrderPrimiseExcelInfo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public OrderPrimiseExcelInfo setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
