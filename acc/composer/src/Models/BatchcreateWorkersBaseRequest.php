<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateWorkersBaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 农民工基本信息
    /**
     * @var WorkersBaseInfo[]
     */
    public $workerList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'workerList'        => 'worker_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('workerList', $this->workerList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->workerList) {
            $res['worker_list'] = [];
            if (null !== $this->workerList && \is_array($this->workerList)) {
                $n = 0;
                foreach ($this->workerList as $item) {
                    $res['worker_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateWorkersBaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['worker_list'])) {
            if (!empty($map['worker_list'])) {
                $model->workerList = [];
                $n                 = 0;
                foreach ($map['worker_list'] as $item) {
                    $model->workerList[$n++] = null !== $item ? WorkersBaseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
