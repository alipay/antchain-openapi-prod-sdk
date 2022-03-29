<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTranslate extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $defaultValue;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $includeNotMatched;

    /**
     * @example
     *
     * @var XTranslateExpression[]
     */
    public $translateExpressions;
    protected $_name = [
        'defaultValue'         => 'default_value',
        'includeNotMatched'    => 'include_not_matched',
        'translateExpressions' => 'translate_expressions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->includeNotMatched) {
            $res['include_not_matched'] = $this->includeNotMatched;
        }
        if (null !== $this->translateExpressions) {
            $res['translate_expressions'] = [];
            if (null !== $this->translateExpressions && \is_array($this->translateExpressions)) {
                $n = 0;
                foreach ($this->translateExpressions as $item) {
                    $res['translate_expressions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTranslate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['include_not_matched'])) {
            $model->includeNotMatched = $map['include_not_matched'];
        }
        if (isset($map['translate_expressions'])) {
            if (!empty($map['translate_expressions'])) {
                $model->translateExpressions = [];
                $n                           = 0;
                foreach ($map['translate_expressions'] as $item) {
                    $model->translateExpressions[$n++] = null !== $item ? XTranslateExpression::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
