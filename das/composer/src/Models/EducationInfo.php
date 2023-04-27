<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EducationInfo extends Model
{
    // 专业
    /**
     * @example 计算机
     *
     * @var string
     */
    public $major;

    // 学历等级代码
    /**
     * @example 01
     *
     * @var string
     */
    public $educationLevel;

    // 毕业日期
    /**
     * @example 202006
     *
     * @var string
     */
    public $graduationDate;

    // 学习形式
    /**
     * @example 全日制
     *
     * @var string
     */
    public $educationType;

    // 是否211
    /**
     * @example true, false
     *
     * @var bool
     */
    public $project211;

    // 是否985
    /**
     * @example true, false
     *
     * @var bool
     */
    public $project985;

    // 是否双一流
    /**
     * @example true
     *
     * @var bool
     */
    public $doubleFirstClass;
    protected $_name = [
        'major'            => 'major',
        'educationLevel'   => 'education_level',
        'graduationDate'   => 'graduation_date',
        'educationType'    => 'education_type',
        'project211'       => 'project211',
        'project985'       => 'project985',
        'doubleFirstClass' => 'double_first_class',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->major) {
            $res['major'] = $this->major;
        }
        if (null !== $this->educationLevel) {
            $res['education_level'] = $this->educationLevel;
        }
        if (null !== $this->graduationDate) {
            $res['graduation_date'] = $this->graduationDate;
        }
        if (null !== $this->educationType) {
            $res['education_type'] = $this->educationType;
        }
        if (null !== $this->project211) {
            $res['project211'] = $this->project211;
        }
        if (null !== $this->project985) {
            $res['project985'] = $this->project985;
        }
        if (null !== $this->doubleFirstClass) {
            $res['double_first_class'] = $this->doubleFirstClass;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EducationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['major'])) {
            $model->major = $map['major'];
        }
        if (isset($map['education_level'])) {
            $model->educationLevel = $map['education_level'];
        }
        if (isset($map['graduation_date'])) {
            $model->graduationDate = $map['graduation_date'];
        }
        if (isset($map['education_type'])) {
            $model->educationType = $map['education_type'];
        }
        if (isset($map['project211'])) {
            $model->project211 = $map['project211'];
        }
        if (isset($map['project985'])) {
            $model->project985 = $map['project985'];
        }
        if (isset($map['double_first_class'])) {
            $model->doubleFirstClass = $map['double_first_class'];
        }

        return $model;
    }
}
