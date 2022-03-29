<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Model extends Model
{
    // rules
    /**
     * @example rules
     *
     * @var Rule[]
     */
    public $rules;

    // batch_rule_id
    /**
     * @example batch_rule_id
     *
     * @var string
     */
    public $batchRuleId;
    protected $_name = [
        'rules'       => 'rules',
        'batchRuleId' => 'batch_rule_id',
    ];

    public function validate()
    {
        self::validateRequired('rules', $this->rules, true);
        self::validateRequired('batchRuleId', $this->batchRuleId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->batchRuleId) {
            $res['batch_rule_id'] = $this->batchRuleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Model
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? Rule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['batch_rule_id'])) {
            $model->batchRuleId = $map['batch_rule_id'];
        }

        return $model;
    }
}
