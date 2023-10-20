<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class BizParam extends Model
{
    // 参数类型枚举，mobile、cert、biz_license
    /**
     * @example ·
     *
     * @var string
     */
    public $paramKey;

    // 值，如加密后的手机号
    /**
     * @example ·
     *
     * @var string
     */
    public $paramValue;
    protected $_name = [
        'paramKey'   => 'param_key',
        'paramValue' => 'param_value',
    ];

    public function validate()
    {
        Model::validateRequired('paramKey', $this->paramKey, true);
        Model::validateRequired('paramValue', $this->paramValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->paramKey) {
            $res['param_key'] = $this->paramKey;
        }
        if (null !== $this->paramValue) {
            $res['param_value'] = $this->paramValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['param_key'])) {
            $model->paramKey = $map['param_key'];
        }
        if (isset($map['param_value'])) {
            $model->paramValue = $map['param_value'];
        }

        return $model;
    }
}
