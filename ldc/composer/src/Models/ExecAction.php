<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecAction extends Model
{
    // 执行健康检查的命令。
    /**
     * @example sh /home/admin/checkservice.sh
     *
     * @var string
     */
    public $command;
    protected $_name = [
        'command' => 'command',
    ];

    public function validate()
    {
        Model::validateRequired('command', $this->command, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->command) {
            $res['command'] = $this->command;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['command'])) {
            $model->command = $map['command'];
        }

        return $model;
    }
}
