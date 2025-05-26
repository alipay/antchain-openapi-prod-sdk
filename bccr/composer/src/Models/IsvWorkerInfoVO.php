<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class IsvWorkerInfoVO extends Model
{
    // 工作人员账号id
    /**
     * @example AC000100000000011000
     *
     * @var string
     */
    public $workerAccountId;

    // 工作人员姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $workerName;
    protected $_name = [
        'workerAccountId' => 'worker_account_id',
        'workerName'      => 'worker_name',
    ];

    public function validate()
    {
        Model::validateRequired('workerAccountId', $this->workerAccountId, true);
        Model::validateRequired('workerName', $this->workerName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workerAccountId) {
            $res['worker_account_id'] = $this->workerAccountId;
        }
        if (null !== $this->workerName) {
            $res['worker_name'] = $this->workerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IsvWorkerInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['worker_account_id'])) {
            $model->workerAccountId = $map['worker_account_id'];
        }
        if (isset($map['worker_name'])) {
            $model->workerName = $map['worker_name'];
        }

        return $model;
    }
}
