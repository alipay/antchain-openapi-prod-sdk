<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignTaskResult extends Model
{
    // 子任务流水号
    /**
     * @example C23231211212d112
     *
     * @var string
     */
    public $subBizNo;

    // 签署子任务id
    /**
     * @example C2023023108301930
     *
     * @var string
     */
    public $signTaskId;

    // 签署子任务的状态
    /**
     * @example FINISH
     *
     * @var string
     */
    public $signTaskStatus;

    // 签署完成的文件列表
    /**
     * @example
     *
     * @var CaSignFileResult[]
     */
    public $signFileResultList;

    // 签署人状态列表
    /**
     * @example
     *
     * @var CaSignOperatorResult[]
     */
    public $signOperatorResultList;
    protected $_name = [
        'subBizNo'               => 'sub_biz_no',
        'signTaskId'             => 'sign_task_id',
        'signTaskStatus'         => 'sign_task_status',
        'signFileResultList'     => 'sign_file_result_list',
        'signOperatorResultList' => 'sign_operator_result_list',
    ];

    public function validate()
    {
        Model::validateRequired('subBizNo', $this->subBizNo, true);
        Model::validateRequired('signTaskId', $this->signTaskId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subBizNo) {
            $res['sub_biz_no'] = $this->subBizNo;
        }
        if (null !== $this->signTaskId) {
            $res['sign_task_id'] = $this->signTaskId;
        }
        if (null !== $this->signTaskStatus) {
            $res['sign_task_status'] = $this->signTaskStatus;
        }
        if (null !== $this->signFileResultList) {
            $res['sign_file_result_list'] = [];
            if (null !== $this->signFileResultList && \is_array($this->signFileResultList)) {
                $n = 0;
                foreach ($this->signFileResultList as $item) {
                    $res['sign_file_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signOperatorResultList) {
            $res['sign_operator_result_list'] = [];
            if (null !== $this->signOperatorResultList && \is_array($this->signOperatorResultList)) {
                $n = 0;
                foreach ($this->signOperatorResultList as $item) {
                    $res['sign_operator_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignTaskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_biz_no'])) {
            $model->subBizNo = $map['sub_biz_no'];
        }
        if (isset($map['sign_task_id'])) {
            $model->signTaskId = $map['sign_task_id'];
        }
        if (isset($map['sign_task_status'])) {
            $model->signTaskStatus = $map['sign_task_status'];
        }
        if (isset($map['sign_file_result_list'])) {
            if (!empty($map['sign_file_result_list'])) {
                $model->signFileResultList = [];
                $n                         = 0;
                foreach ($map['sign_file_result_list'] as $item) {
                    $model->signFileResultList[$n++] = null !== $item ? CaSignFileResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_operator_result_list'])) {
            if (!empty($map['sign_operator_result_list'])) {
                $model->signOperatorResultList = [];
                $n                             = 0;
                foreach ($map['sign_operator_result_list'] as $item) {
                    $model->signOperatorResultList[$n++] = null !== $item ? CaSignOperatorResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
