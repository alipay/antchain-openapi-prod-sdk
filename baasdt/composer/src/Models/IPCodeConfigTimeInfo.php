<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeConfigTimeInfo extends Model
{
    // 正版码申请时间，商家申请正版码第一批数量的时间
    /**
     * @example 7238738297892
     *
     * @var string
     */
    public $codeApplyTime;

    // 正版码配置时间
    /**
     * @example 3242342313242333
     *
     * @var string
     */
    public $codeSetTime;

    // 正版码生效时间
    /**
     * @example 323423432432432
     *
     * @var string
     */
    public $codeEffectTime;
    protected $_name = [
        'codeApplyTime'  => 'code_apply_time',
        'codeSetTime'    => 'code_set_time',
        'codeEffectTime' => 'code_effect_time',
    ];

    public function validate()
    {
        Model::validatePattern('codeApplyTime', $this->codeApplyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('codeSetTime', $this->codeSetTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('codeEffectTime', $this->codeEffectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->codeApplyTime) {
            $res['code_apply_time'] = $this->codeApplyTime;
        }
        if (null !== $this->codeSetTime) {
            $res['code_set_time'] = $this->codeSetTime;
        }
        if (null !== $this->codeEffectTime) {
            $res['code_effect_time'] = $this->codeEffectTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeConfigTimeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code_apply_time'])) {
            $model->codeApplyTime = $map['code_apply_time'];
        }
        if (isset($map['code_set_time'])) {
            $model->codeSetTime = $map['code_set_time'];
        }
        if (isset($map['code_effect_time'])) {
            $model->codeEffectTime = $map['code_effect_time'];
        }

        return $model;
    }
}
