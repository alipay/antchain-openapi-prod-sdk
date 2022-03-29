<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SubMapDTO extends Model
{
    // cell name
    /**
     * @example RZ00A
     *
     * @var string
     */
    public $cell;

    // 该 Group ID 客户端消费记录的明细列表
    //
    //
    /**
     * @example
     *
     * @var SubClientInfoDTO[]
     */
    public $clientList;

    // 该 Group ID 消费失败次数统计
    /**
     * @example 0
     *
     * @var int
     */
    public $failCount;

    // 消费方 Group ID
    /**
     * @example GID_test
     *
     * @var string
     */
    public $subGroupName;

    // 该 Group ID 消费成功次数统计
    /**
     * @example 1
     *
     * @var int
     */
    public $successCount;
    protected $_name = [
        'cell'         => 'cell',
        'clientList'   => 'client_list',
        'failCount'    => 'fail_count',
        'subGroupName' => 'sub_group_name',
        'successCount' => 'success_count',
    ];

    public function validate()
    {
        Model::validateRequired('clientList', $this->clientList, true);
        Model::validateRequired('failCount', $this->failCount, true);
        Model::validateRequired('subGroupName', $this->subGroupName, true);
        Model::validateRequired('successCount', $this->successCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->clientList) {
            $res['client_list'] = [];
            if (null !== $this->clientList && \is_array($this->clientList)) {
                $n = 0;
                foreach ($this->clientList as $item) {
                    $res['client_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failCount) {
            $res['fail_count'] = $this->failCount;
        }
        if (null !== $this->subGroupName) {
            $res['sub_group_name'] = $this->subGroupName;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubMapDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['client_list'])) {
            if (!empty($map['client_list'])) {
                $model->clientList = [];
                $n                 = 0;
                foreach ($map['client_list'] as $item) {
                    $model->clientList[$n++] = null !== $item ? SubClientInfoDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fail_count'])) {
            $model->failCount = $map['fail_count'];
        }
        if (isset($map['sub_group_name'])) {
            $model->subGroupName = $map['sub_group_name'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }

        return $model;
    }
}
