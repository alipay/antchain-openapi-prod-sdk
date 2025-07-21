// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AdditionalFileInfo extends TeaModel {
    // 内容梗概文件fileId
    /**
     * <strong>example:</strong>
     * <p>202212131900example001.png</p>
     */
    @NameInMap("content_summary_file_id")
    public String contentSummaryFileId;

    // 权利归属证明文件
    @NameInMap("ownership_file_ids")
    public java.util.List<String> ownershipFileIds;

    // 肖像权授权文件fileId
    /**
     * <strong>example:</strong>
     * <p>202212131900example003.png</p>
     */
    @NameInMap("portrait_auth_file_id")
    public String portraitAuthFileId;

    // 他人作品授权文件fileId
    /**
     * <strong>example:</strong>
     * <p>202212131900example004.png</p>
     */
    @NameInMap("others_work_auth_file_id")
    public String othersWorkAuthFileId;

    // 其他文件fileId列表
    @NameInMap("other_file_id_list")
    public java.util.List<String> otherFileIdList;

    // 商用授权字体授权文件fileId
    /**
     * <strong>example:</strong>
     * <p>202212131900example004.png </p>
     */
    @NameInMap("font_authorize_file_id")
    public String fontAuthorizeFileId;

    public static AdditionalFileInfo build(java.util.Map<String, ?> map) throws Exception {
        AdditionalFileInfo self = new AdditionalFileInfo();
        return TeaModel.build(map, self);
    }

    public AdditionalFileInfo setContentSummaryFileId(String contentSummaryFileId) {
        this.contentSummaryFileId = contentSummaryFileId;
        return this;
    }
    public String getContentSummaryFileId() {
        return this.contentSummaryFileId;
    }

    public AdditionalFileInfo setOwnershipFileIds(java.util.List<String> ownershipFileIds) {
        this.ownershipFileIds = ownershipFileIds;
        return this;
    }
    public java.util.List<String> getOwnershipFileIds() {
        return this.ownershipFileIds;
    }

    public AdditionalFileInfo setPortraitAuthFileId(String portraitAuthFileId) {
        this.portraitAuthFileId = portraitAuthFileId;
        return this;
    }
    public String getPortraitAuthFileId() {
        return this.portraitAuthFileId;
    }

    public AdditionalFileInfo setOthersWorkAuthFileId(String othersWorkAuthFileId) {
        this.othersWorkAuthFileId = othersWorkAuthFileId;
        return this;
    }
    public String getOthersWorkAuthFileId() {
        return this.othersWorkAuthFileId;
    }

    public AdditionalFileInfo setOtherFileIdList(java.util.List<String> otherFileIdList) {
        this.otherFileIdList = otherFileIdList;
        return this;
    }
    public java.util.List<String> getOtherFileIdList() {
        return this.otherFileIdList;
    }

    public AdditionalFileInfo setFontAuthorizeFileId(String fontAuthorizeFileId) {
        this.fontAuthorizeFileId = fontAuthorizeFileId;
        return this;
    }
    public String getFontAuthorizeFileId() {
        return this.fontAuthorizeFileId;
    }

}
