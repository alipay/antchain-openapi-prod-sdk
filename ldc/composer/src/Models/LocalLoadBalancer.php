<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LocalLoadBalancer extends Model
{
    // local lb所在部署单元
    /**
     * @example rz01a
     *
     * @var string
     */
    public $cell;

    // local lb实例对应的iaas id
    /**
     * @example lb-bp1thv6gfoaefefeks7tq
     *
     * @var string
     */
    public $iaasId;

    // local lb实例对应的vip
    /**
     * @example 10.0.0.1
     *
     * @var string
     */
    public $vip;

    // 当前cell lb的phase
    /**
     * @example LBEnsured, LBFailed
     *
     * @var string
     */
    public $phase;

    // 空代表无错误信息，非空时即报错信息
    /**
     * @example "failed to create lb due to xxx" 或者 ""
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'cell'    => 'cell',
        'iaasId'  => 'iaas_id',
        'vip'     => 'vip',
        'phase'   => 'phase',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalLoadBalancer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
