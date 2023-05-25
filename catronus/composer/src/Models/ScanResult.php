<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ScanResult extends Model
{
    // 安全组件名
    /**
     * @example mycomponent
     *
     * @var string
     */
    public $component;

    // 结果
    /**
     * @example myresult
     *
     * @var string
     */
    public $result;
    protected $_name = [
        'component' => 'component',
        'result'    => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('component', $this->component, true);
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->component) {
            $res['component'] = $this->component;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScanResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['component'])) {
            $model->component = $map['component'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
