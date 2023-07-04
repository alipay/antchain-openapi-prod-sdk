<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Exec extends Model
{
    // args
    /**
     * @example
     *
     * @var string[]
     */
    public $args;

    // cmd
    /**
     * @example ["bash","sleep","20"]
     *
     * @var string
     */
    public $cmd;
    protected $_name = [
        'args' => 'args',
        'cmd'  => 'cmd',
    ];

    public function validate()
    {
        Model::validateRequired('args', $this->args, true);
        Model::validateRequired('cmd', $this->cmd, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->args) {
            $res['args'] = $this->args;
        }
        if (null !== $this->cmd) {
            $res['cmd'] = $this->cmd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Exec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['args'])) {
            if (!empty($map['args'])) {
                $model->args = $map['args'];
            }
        }
        if (isset($map['cmd'])) {
            $model->cmd = $map['cmd'];
        }

        return $model;
    }
}
