<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class InstanceDigest extends Model
{
    // job instance id
    /**
     * @example 000000001
     *
     * @var string
     */
    public $id;

    // 分区信息
    /**
     * @example dt=xxxx
     *
     * @var string
     */
    public $partition;

    // 时间
    /**
     * @example 2020-11-20-11:20:12
     *
     * @var string
     */
    public $gmtCreate;

    // 任务状态
    /**
     * @example SUCCESSFUL,FAILED,PAUSED,RUNNING
     *
     * @var string
     */
    public $state;
    protected $_name = [
        'id'        => 'id',
        'partition' => 'partition',
        'gmtCreate' => 'gmt_create',
        'state'     => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('partition', $this->partition, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceDigest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
