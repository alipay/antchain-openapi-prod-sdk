<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class BidReason extends Model
{
    // 事由类别ID
    /**
     * @example 123
     *
     * @var string
     */
    public $categoryId;

    // 分类名称
    /**
     * @example 维权/合同纠纷
     *
     * @var string
     */
    public $categoryName;

    // 描述
    /**
     * @example 这是一个描述
     *
     * @var string
     */
    public $desc;

    // 文件上传描述
    /**
     * @example 这是一个文件上传描述
     *
     * @var string
     */
    public $fileUploadDesc;

    // 排序
    /**
     * @example 1
     *
     * @var int
     */
    public $rank;

    // 是否必须上传证明文件
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isNeedTestifyFile;

    // reasonArray
    /**
     * @example
     *
     * @var Reason[]
     */
    public $reasonArray;
    protected $_name = [
        'categoryId'        => 'category_id',
        'categoryName'      => 'category_name',
        'desc'              => 'desc',
        'fileUploadDesc'    => 'file_upload_desc',
        'rank'              => 'rank',
        'isNeedTestifyFile' => 'is_need_testify_file',
        'reasonArray'       => 'reason_array',
    ];

    public function validate()
    {
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('fileUploadDesc', $this->fileUploadDesc, true);
        Model::validateRequired('rank', $this->rank, true);
        Model::validateRequired('isNeedTestifyFile', $this->isNeedTestifyFile, true);
        Model::validateRequired('reasonArray', $this->reasonArray, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->fileUploadDesc) {
            $res['file_upload_desc'] = $this->fileUploadDesc;
        }
        if (null !== $this->rank) {
            $res['rank'] = $this->rank;
        }
        if (null !== $this->isNeedTestifyFile) {
            $res['is_need_testify_file'] = $this->isNeedTestifyFile;
        }
        if (null !== $this->reasonArray) {
            $res['reason_array'] = [];
            if (null !== $this->reasonArray && \is_array($this->reasonArray)) {
                $n = 0;
                foreach ($this->reasonArray as $item) {
                    $res['reason_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BidReason
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['file_upload_desc'])) {
            $model->fileUploadDesc = $map['file_upload_desc'];
        }
        if (isset($map['rank'])) {
            $model->rank = $map['rank'];
        }
        if (isset($map['is_need_testify_file'])) {
            $model->isNeedTestifyFile = $map['is_need_testify_file'];
        }
        if (isset($map['reason_array'])) {
            if (!empty($map['reason_array'])) {
                $model->reasonArray = [];
                $n                  = 0;
                foreach ($map['reason_array'] as $item) {
                    $model->reasonArray[$n++] = null !== $item ? Reason::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
