<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class TemplateFieldConfigRequest extends Model
{
    // 字段拥有者（1个人，2客户，3人资服务商）
    /**
     * @example 1
     *
     * @var int
     */
    public $type;

    // 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
    /**
     * @example identityName
     *
     * @var string
     */
    public $fieldName;

    // 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
    /**
     * @example 姓名
     *
     * @var string
     */
    public $fieldNameDesc;

    // 字段值
    /**
     * @example 张三
     *
     * @var string
     */
    public $fieldValue;
    protected $_name = [
        'type'          => 'type',
        'fieldName'     => 'field_name',
        'fieldNameDesc' => 'field_name_desc',
        'fieldValue'    => 'field_value',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('fieldName', $this->fieldName, true);
        Model::validateRequired('fieldNameDesc', $this->fieldNameDesc, true);
        Model::validateRequired('fieldValue', $this->fieldValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fieldName) {
            $res['field_name'] = $this->fieldName;
        }
        if (null !== $this->fieldNameDesc) {
            $res['field_name_desc'] = $this->fieldNameDesc;
        }
        if (null !== $this->fieldValue) {
            $res['field_value'] = $this->fieldValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateFieldConfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['field_name'])) {
            $model->fieldName = $map['field_name'];
        }
        if (isset($map['field_name_desc'])) {
            $model->fieldNameDesc = $map['field_name_desc'];
        }
        if (isset($map['field_value'])) {
            $model->fieldValue = $map['field_value'];
        }

        return $model;
    }
}
