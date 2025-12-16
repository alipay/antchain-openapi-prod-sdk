<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ProductParamInfo extends Model
{
    // 参数业务类型
    /**
     * @example certNo.身份证 name.姓名
     *
     * @var string
     */
    public $bizType;

    // 参数key
    /**
     * @example -
     *
     * @var string
     */
    public $paramKey;

    // 参数类型
    /**
     * @example -
     *
     * @var string
     */
    public $paramType;

    // 参数描述
    /**
     * @example -
     *
     * @var string
     */
    public $paramDesc;
    protected $_name = [
        'bizType'   => 'biz_type',
        'paramKey'  => 'param_key',
        'paramType' => 'param_type',
        'paramDesc' => 'param_desc',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('paramKey', $this->paramKey, true);
        Model::validateRequired('paramType', $this->paramType, true);
        Model::validateRequired('paramDesc', $this->paramDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->paramKey) {
            $res['param_key'] = $this->paramKey;
        }
        if (null !== $this->paramType) {
            $res['param_type'] = $this->paramType;
        }
        if (null !== $this->paramDesc) {
            $res['param_desc'] = $this->paramDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductParamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['param_key'])) {
            $model->paramKey = $map['param_key'];
        }
        if (isset($map['param_type'])) {
            $model->paramType = $map['param_type'];
        }
        if (isset($map['param_desc'])) {
            $model->paramDesc = $map['param_desc'];
        }

        return $model;
    }
}
