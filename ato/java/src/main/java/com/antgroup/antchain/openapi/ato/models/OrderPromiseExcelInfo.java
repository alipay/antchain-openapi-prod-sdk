// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderPromiseExcelInfo extends TeaModel {
    // 文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 任务状态
    // ● RUNNING:生成中
    // ● SUCCESS:已生成
    // ● FAILED:失败
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    public static OrderPromiseExcelInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderPromiseExcelInfo self = new OrderPromiseExcelInfo();
        return TeaModel.build(map, self);
    }

    public OrderPromiseExcelInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public OrderPromiseExcelInfo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public OrderPromiseExcelInfo setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
