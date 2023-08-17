<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class TaskTemplateOptionConfig extends Model
{
    // defaultresult
    /**
     * @example defaultresult
     *
     * @var string
     */
    public $defaultresult;

    // rule
    /**
     * @example rule
     *
     * @var string
     */
    public $rule;

    // 预制选项，针对填空题的输入题目
    /**
     * @example
     *
     * @var string[]
     */
    public $preoptions;
    protected $_name = [
        'defaultresult' => 'defaultresult',
        'rule'          => 'rule',
        'preoptions'    => 'preoptions',
    ];

    public function validate()
    {
        Model::validateRequired('defaultresult', $this->defaultresult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultresult) {
            $res['defaultresult'] = $this->defaultresult;
        }
        if (null !== $this->rule) {
            $res['rule'] = $this->rule;
        }
        if (null !== $this->preoptions) {
            $res['preoptions'] = $this->preoptions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskTemplateOptionConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['defaultresult'])) {
            $model->defaultresult = $map['defaultresult'];
        }
        if (isset($map['rule'])) {
            $model->rule = $map['rule'];
        }
        if (isset($map['preoptions'])) {
            if (!empty($map['preoptions'])) {
                $model->preoptions = $map['preoptions'];
            }
        }

        return $model;
    }
}
