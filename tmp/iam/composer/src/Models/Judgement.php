<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Judgement extends Model
{
    // 唯一ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 是否通过
    /**
     * @example true, false
     *
     * @var bool
     */
    public $pass;

    // 失败原因
    /**
     * @example reason
     *
     * @var string
     */
    public $reason;

    // 解决方案
    /**
     * @example 解决方案
     *
     * @var string
     */
    public $solution;
    protected $_name = [
        'id'       => 'id',
        'pass'     => 'pass',
        'reason'   => 'reason',
        'solution' => 'solution',
    ];

    public function validate()
    {
        Model::validateRequired('pass', $this->pass, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->solution) {
            $res['solution'] = $this->solution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Judgement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['pass'])) {
            $model->pass = $map['pass'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['solution'])) {
            $model->solution = $map['solution'];
        }

        return $model;
    }
}
