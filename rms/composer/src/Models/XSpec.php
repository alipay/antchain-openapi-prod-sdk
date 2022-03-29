<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XSpec extends Model
{
    /**
     * @example
     *
     * @var XTarget
     */
    public $target;

    /**
     * @example
     *
     * @var XRule
     */
    public $rule;
    protected $_name = [
        'target' => 'target',
        'rule'   => 'rule',
    ];

    public function validate()
    {
        Model::validateRequired('target', $this->target, true);
        Model::validateRequired('rule', $this->rule, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->target) {
            $res['target'] = null !== $this->target ? $this->target->toMap() : null;
        }
        if (null !== $this->rule) {
            $res['rule'] = null !== $this->rule ? $this->rule->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['target'])) {
            $model->target = XTarget::fromMap($map['target']);
        }
        if (isset($map['rule'])) {
            $model->rule = XRule::fromMap($map['rule']);
        }

        return $model;
    }
}
