<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class AdditionalFileInfo extends Model
{
    // 内容梗概文件fileId
    /**
     * @example 202212131900example001.png
     *
     * @var string
     */
    public $contentSummaryFileId;

    // 权利归属证明文件
    /**
     * @example
     *
     * @var string[]
     */
    public $ownershipFileIds;

    // 肖像权授权文件fileId
    /**
     * @example 202212131900example003.png
     *
     * @var string
     */
    public $portraitAuthFileId;

    // 他人作品授权文件fileId
    /**
     * @example 202212131900example004.png
     *
     * @var string
     */
    public $othersWorkAuthFileId;

    // 其他文件fileId列表
    /**
     * @example
     *
     * @var string[]
     */
    public $otherFileIdList;

    // 商用授权字体授权文件fileId
    /**
     * @example 202212131900example004.png
     *
     * @var string
     */
    public $fontAuthorizeFileId;
    protected $_name = [
        'contentSummaryFileId' => 'content_summary_file_id',
        'ownershipFileIds'     => 'ownership_file_ids',
        'portraitAuthFileId'   => 'portrait_auth_file_id',
        'othersWorkAuthFileId' => 'others_work_auth_file_id',
        'otherFileIdList'      => 'other_file_id_list',
        'fontAuthorizeFileId'  => 'font_authorize_file_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentSummaryFileId) {
            $res['content_summary_file_id'] = $this->contentSummaryFileId;
        }
        if (null !== $this->ownershipFileIds) {
            $res['ownership_file_ids'] = $this->ownershipFileIds;
        }
        if (null !== $this->portraitAuthFileId) {
            $res['portrait_auth_file_id'] = $this->portraitAuthFileId;
        }
        if (null !== $this->othersWorkAuthFileId) {
            $res['others_work_auth_file_id'] = $this->othersWorkAuthFileId;
        }
        if (null !== $this->otherFileIdList) {
            $res['other_file_id_list'] = $this->otherFileIdList;
        }
        if (null !== $this->fontAuthorizeFileId) {
            $res['font_authorize_file_id'] = $this->fontAuthorizeFileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AdditionalFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_summary_file_id'])) {
            $model->contentSummaryFileId = $map['content_summary_file_id'];
        }
        if (isset($map['ownership_file_ids'])) {
            if (!empty($map['ownership_file_ids'])) {
                $model->ownershipFileIds = $map['ownership_file_ids'];
            }
        }
        if (isset($map['portrait_auth_file_id'])) {
            $model->portraitAuthFileId = $map['portrait_auth_file_id'];
        }
        if (isset($map['others_work_auth_file_id'])) {
            $model->othersWorkAuthFileId = $map['others_work_auth_file_id'];
        }
        if (isset($map['other_file_id_list'])) {
            if (!empty($map['other_file_id_list'])) {
                $model->otherFileIdList = $map['other_file_id_list'];
            }
        }
        if (isset($map['font_authorize_file_id'])) {
            $model->fontAuthorizeFileId = $map['font_authorize_file_id'];
        }

        return $model;
    }
}
