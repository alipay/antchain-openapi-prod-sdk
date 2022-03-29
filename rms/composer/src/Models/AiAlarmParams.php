<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AiAlarmParams extends Model
{
    // value_fields
    /**
     * @example value_fields
     *
     * @var string[]
     */
    public $valueFields;

    // ai_algo_code
    /**
     * @example ai_algo_code
     *
     * @var string
     */
    public $aiAlgoCode;

    // ai_extra_attr
    /**
     * @example ai_extra_attr
     *
     * @var AiExtraAttr
     */
    public $aiExtraAttr;
    protected $_name = [
        'valueFields' => 'value_fields',
        'aiAlgoCode'  => 'ai_algo_code',
        'aiExtraAttr' => 'ai_extra_attr',
    ];

    public function validate()
    {
        Model::validateRequired('valueFields', $this->valueFields, true);
        Model::validateRequired('aiAlgoCode', $this->aiAlgoCode, true);
        Model::validateRequired('aiExtraAttr', $this->aiExtraAttr, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->valueFields) {
            $res['value_fields'] = $this->valueFields;
        }
        if (null !== $this->aiAlgoCode) {
            $res['ai_algo_code'] = $this->aiAlgoCode;
        }
        if (null !== $this->aiExtraAttr) {
            $res['ai_extra_attr'] = null !== $this->aiExtraAttr ? $this->aiExtraAttr->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AiAlarmParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value_fields'])) {
            if (!empty($map['value_fields'])) {
                $model->valueFields = $map['value_fields'];
            }
        }
        if (isset($map['ai_algo_code'])) {
            $model->aiAlgoCode = $map['ai_algo_code'];
        }
        if (isset($map['ai_extra_attr'])) {
            $model->aiExtraAttr = AiExtraAttr::fromMap($map['ai_extra_attr']);
        }

        return $model;
    }
}
