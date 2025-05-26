// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class IsvWorkerInfoVOList extends TeaModel {
    // 服务商下工作人员信息列表
    @NameInMap("isv_worker_info_list")
    @Validation(required = true)
    public java.util.List<IsvWorkerInfoVO> isvWorkerInfoList;

    public static IsvWorkerInfoVOList build(java.util.Map<String, ?> map) throws Exception {
        IsvWorkerInfoVOList self = new IsvWorkerInfoVOList();
        return TeaModel.build(map, self);
    }

    public IsvWorkerInfoVOList setIsvWorkerInfoList(java.util.List<IsvWorkerInfoVO> isvWorkerInfoList) {
        this.isvWorkerInfoList = isvWorkerInfoList;
        return this;
    }
    public java.util.List<IsvWorkerInfoVO> getIsvWorkerInfoList() {
        return this.isvWorkerInfoList;
    }

}
