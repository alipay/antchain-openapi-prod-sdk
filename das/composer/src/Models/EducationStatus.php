<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EducationStatus extends Model
{
    // 是否211院校
    /**
     * @example true, false
     *
     * @var bool
     */
    public $project211;

    // 是否985院校
    /**
     * @example true, false
     *
     * @var bool
     */
    public $project985;

    // boolean	是否双一流院校
    /**
     * @example true, false
     *
     * @var bool
     */
    public $doubleFirstClass;

    // 入学时间
    /**
     * @example 202109
     *
     * @var string
     */
    public $admissionDate;

    // 学制，字典
    /**
     * @example C
     *
     * @var string
     */
    public $educationalSystem;

    // boolean	是否注册学籍
    /**
     * @example true, false
     *
     * @var bool
     */
    public $registeredStudentStatus;
    protected $_name = [
        'project211'              => 'project211',
        'project985'              => 'project985',
        'doubleFirstClass'        => 'double_first_class',
        'admissionDate'           => 'admission_date',
        'educationalSystem'       => 'educational_system',
        'registeredStudentStatus' => 'registered_student_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->project211) {
            $res['project211'] = $this->project211;
        }
        if (null !== $this->project985) {
            $res['project985'] = $this->project985;
        }
        if (null !== $this->doubleFirstClass) {
            $res['double_first_class'] = $this->doubleFirstClass;
        }
        if (null !== $this->admissionDate) {
            $res['admission_date'] = $this->admissionDate;
        }
        if (null !== $this->educationalSystem) {
            $res['educational_system'] = $this->educationalSystem;
        }
        if (null !== $this->registeredStudentStatus) {
            $res['registered_student_status'] = $this->registeredStudentStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EducationStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project211'])) {
            $model->project211 = $map['project211'];
        }
        if (isset($map['project985'])) {
            $model->project985 = $map['project985'];
        }
        if (isset($map['double_first_class'])) {
            $model->doubleFirstClass = $map['double_first_class'];
        }
        if (isset($map['admission_date'])) {
            $model->admissionDate = $map['admission_date'];
        }
        if (isset($map['educational_system'])) {
            $model->educationalSystem = $map['educational_system'];
        }
        if (isset($map['registered_student_status'])) {
            $model->registeredStudentStatus = $map['registered_student_status'];
        }

        return $model;
    }
}
