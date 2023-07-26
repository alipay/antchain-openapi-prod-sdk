<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractCreateProcessResp extends Model
{
    // 当前进度信息
    /**
     * @example SERVICE_START
     *
     * @var string
     */
    public $status;

    // 合约部署进度
    /**
     * @example
     *
     * @var InstanceProgressInfo[]
     */
    public $progressInfoList;
    protected $_name = [
        'status'           => 'status',
        'progressInfoList' => 'progress_info_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->progressInfoList) {
            $res['progress_info_list'] = [];
            if (null !== $this->progressInfoList && \is_array($this->progressInfoList)) {
                $n = 0;
                foreach ($this->progressInfoList as $item) {
                    $res['progress_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractCreateProcessResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['progress_info_list'])) {
            if (!empty($map['progress_info_list'])) {
                $model->progressInfoList = [];
                $n                       = 0;
                foreach ($map['progress_info_list'] as $item) {
                    $model->progressInfoList[$n++] = null !== $item ? InstanceProgressInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
