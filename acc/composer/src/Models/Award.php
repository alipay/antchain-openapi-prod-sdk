<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class Award extends Model
{
    // 奖项名称
    //
    //
    /**
     * @example 奖项名称
     *
     * @var string
     */
    public $awardName;

    // 奖项级别（参见附录十四）
    //
    //
    /**
     * @example 奖项级别（参见附录十四）
     *
     * @var string
     */
    public $awardLevel;

    // 颁发日期（yyyy）
    //
    //
    /**
     * @example 颁发日期（yyyy）
     *
     * @var string
     */
    public $issueDate;

    // 有效开始日期（yyyy-MM-dd）
    //
    //
    /**
     * @example 有效开始日期（yyyy-MM-dd）
     *
     * @var string
     */
    public $effectStartDate;

    // 有效结束日期（yyyy-MM-dd）
    //
    //
    /**
     * @example 有效结束日期（yyyy-MM-dd）
     *
     * @var string
     */
    public $effectEndDate;

    // 文件信息，支持上传多个文件
    //
    //
    /**
     * @example
     *
     * @var FileDefine[]
     */
    public $fileDefines;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $awardId;
    protected $_name = [
        'awardName'       => 'award_name',
        'awardLevel'      => 'award_level',
        'issueDate'       => 'issue_date',
        'effectStartDate' => 'effect_start_date',
        'effectEndDate'   => 'effect_end_date',
        'fileDefines'     => 'file_defines',
        'awardId'         => 'award_id',
    ];

    public function validate()
    {
        Model::validateRequired('awardName', $this->awardName, true);
        Model::validateRequired('awardLevel', $this->awardLevel, true);
        Model::validateRequired('issueDate', $this->issueDate, true);
        Model::validateRequired('effectStartDate', $this->effectStartDate, true);
        Model::validateRequired('effectEndDate', $this->effectEndDate, true);
        Model::validateRequired('fileDefines', $this->fileDefines, true);
        Model::validateRequired('awardId', $this->awardId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->awardName) {
            $res['award_name'] = $this->awardName;
        }
        if (null !== $this->awardLevel) {
            $res['award_level'] = $this->awardLevel;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->effectStartDate) {
            $res['effect_start_date'] = $this->effectStartDate;
        }
        if (null !== $this->effectEndDate) {
            $res['effect_end_date'] = $this->effectEndDate;
        }
        if (null !== $this->fileDefines) {
            $res['file_defines'] = [];
            if (null !== $this->fileDefines && \is_array($this->fileDefines)) {
                $n = 0;
                foreach ($this->fileDefines as $item) {
                    $res['file_defines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->awardId) {
            $res['award_id'] = $this->awardId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Award
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['award_name'])) {
            $model->awardName = $map['award_name'];
        }
        if (isset($map['award_level'])) {
            $model->awardLevel = $map['award_level'];
        }
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['effect_start_date'])) {
            $model->effectStartDate = $map['effect_start_date'];
        }
        if (isset($map['effect_end_date'])) {
            $model->effectEndDate = $map['effect_end_date'];
        }
        if (isset($map['file_defines'])) {
            if (!empty($map['file_defines'])) {
                $model->fileDefines = [];
                $n                  = 0;
                foreach ($map['file_defines'] as $item) {
                    $model->fileDefines[$n++] = null !== $item ? FileDefine::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['award_id'])) {
            $model->awardId = $map['award_id'];
        }

        return $model;
    }
}
