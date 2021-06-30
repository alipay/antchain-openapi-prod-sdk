// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpGalleryinstructionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页数据量大小
    @NameInMap("page_size")
    public Long pageSize;

    // 符合条件的数据总数
    @NameInMap("total_count")
    public Long totalCount;

    // 图库系在记录信息
    @NameInMap("gallery_instruction_list")
    public java.util.List<IPGalleryInstruction> galleryInstructionList;

    public static PagequeryIpGalleryinstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpGalleryinstructionResponse self = new PagequeryIpGalleryinstructionResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpGalleryinstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpGalleryinstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpGalleryinstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpGalleryinstructionResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpGalleryinstructionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpGalleryinstructionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryIpGalleryinstructionResponse setGalleryInstructionList(java.util.List<IPGalleryInstruction> galleryInstructionList) {
        this.galleryInstructionList = galleryInstructionList;
        return this;
    }
    public java.util.List<IPGalleryInstruction> getGalleryInstructionList() {
        return this.galleryInstructionList;
    }

}
