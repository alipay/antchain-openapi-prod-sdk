<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTranslateExpression extends Model
{
    // expression type
    /**
     * @example regex
     *
     * @var string
     */
    public $type;

    // from
    /**
     * @example
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example
     *
     * @var string
     */
    public $to;
    protected $_name = [
        'type' => 'type',
        'from' => 'from',
        'to'   => 'to',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTranslateExpression
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }

        return $model;
    }
}
