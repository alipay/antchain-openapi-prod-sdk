<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class DownloadMarkResult extends Model
{
    // TaskId
    /**
     * @example TaskId
     *
     * @var string
     */
    public $taskid;

    // RunInstId
    /**
     * @example RunInstId
     *
     * @var string
     */
    public $runinstid;

    // msgid
    /**
     * @example msgid
     *
     * @var string
     */
    public $msgid;
    protected $_name = [
        'taskid'    => 'taskid',
        'runinstid' => 'runinstid',
        'msgid'     => 'msgid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskid) {
            $res['taskid'] = $this->taskid;
        }
        if (null !== $this->runinstid) {
            $res['runinstid'] = $this->runinstid;
        }
        if (null !== $this->msgid) {
            $res['msgid'] = $this->msgid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadMarkResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['taskid'])) {
            $model->taskid = $map['taskid'];
        }
        if (isset($map['runinstid'])) {
            $model->runinstid = $map['runinstid'];
        }
        if (isset($map['msgid'])) {
            $model->msgid = $map['msgid'];
        }

        return $model;
    }
}
