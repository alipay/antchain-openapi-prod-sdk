<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class IsvWorkerInfoVOList extends Model
{
    // 服务商下工作人员信息列表
    /**
     * @example   [{ "workerAccountId": "AC000100000000011000","workerName": "testName"  }]
     *
     * @var IsvWorkerInfoVO[]
     */
    public $isvWorkerInfoList;
    protected $_name = [
        'isvWorkerInfoList' => 'isv_worker_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('isvWorkerInfoList', $this->isvWorkerInfoList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isvWorkerInfoList) {
            $res['isv_worker_info_list'] = [];
            if (null !== $this->isvWorkerInfoList && \is_array($this->isvWorkerInfoList)) {
                $n = 0;
                foreach ($this->isvWorkerInfoList as $item) {
                    $res['isv_worker_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IsvWorkerInfoVOList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['isv_worker_info_list'])) {
            if (!empty($map['isv_worker_info_list'])) {
                $model->isvWorkerInfoList = [];
                $n                        = 0;
                foreach ($map['isv_worker_info_list'] as $item) {
                    $model->isvWorkerInfoList[$n++] = null !== $item ? IsvWorkerInfoVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
