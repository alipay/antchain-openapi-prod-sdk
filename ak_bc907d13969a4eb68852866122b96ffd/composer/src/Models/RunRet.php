<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class RunRet extends Model
{
    // taskid
    /**
     * @example taskid
     *
     * @var string
     */
    public $taskid;

    // subtaskdistdt
    /**
     * @example subtaskdistdt
     *
     * @var string
     */
    public $subtaskdistdt;

    // requestid
    /**
     * @example requestid
     *
     * @var string
     */
    public $requestid;

    // taskname
    /**
     * @example taskname
     *
     * @var string
     */
    public $taskname;

    // msgsenddt
    /**
     * @example msgsenddt
     *
     * @var string
     */
    public $msgsenddt;

    // msgid
    /**
     * @example msgid
     *
     * @var string
     */
    public $msgid;

    // resultlink
    /**
     * @example resultlink
     *
     * @var string
     */
    public $resultlink;
    protected $_name = [
        'taskid'        => 'taskid',
        'subtaskdistdt' => 'subtaskdistdt',
        'requestid'     => 'requestid',
        'taskname'      => 'taskname',
        'msgsenddt'     => 'msgsenddt',
        'msgid'         => 'msgid',
        'resultlink'    => 'resultlink',
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
        if (null !== $this->subtaskdistdt) {
            $res['subtaskdistdt'] = $this->subtaskdistdt;
        }
        if (null !== $this->requestid) {
            $res['requestid'] = $this->requestid;
        }
        if (null !== $this->taskname) {
            $res['taskname'] = $this->taskname;
        }
        if (null !== $this->msgsenddt) {
            $res['msgsenddt'] = $this->msgsenddt;
        }
        if (null !== $this->msgid) {
            $res['msgid'] = $this->msgid;
        }
        if (null !== $this->resultlink) {
            $res['resultlink'] = $this->resultlink;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunRet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['taskid'])) {
            $model->taskid = $map['taskid'];
        }
        if (isset($map['subtaskdistdt'])) {
            $model->subtaskdistdt = $map['subtaskdistdt'];
        }
        if (isset($map['requestid'])) {
            $model->requestid = $map['requestid'];
        }
        if (isset($map['taskname'])) {
            $model->taskname = $map['taskname'];
        }
        if (isset($map['msgsenddt'])) {
            $model->msgsenddt = $map['msgsenddt'];
        }
        if (isset($map['msgid'])) {
            $model->msgid = $map['msgid'];
        }
        if (isset($map['resultlink'])) {
            $model->resultlink = $map['resultlink'];
        }

        return $model;
    }
}
