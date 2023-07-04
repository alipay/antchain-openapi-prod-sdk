<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ParameterTemplate extends Model
{
    // template模板值
    /**
     * @example template
     *
     * @var string
     */
    public $template;

    // target 模版对象
    /**
     * @example target
     *
     * @var string
     */
    public $target;
    protected $_name = [
        'template' => 'template',
        'target'   => 'target',
    ];

    public function validate()
    {
        Model::validateRequired('template', $this->template, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParameterTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template'])) {
            $model->template = $map['template'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }

        return $model;
    }
}
