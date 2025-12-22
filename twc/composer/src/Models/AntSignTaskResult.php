<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignTaskResult extends Model
{
    // 子任务流水号
    /**
     * @example 子任务流水号
     *
     * @var string
     */
    public $subBizNo;

    // 签署子任务id
    /**
     * @example 签署子任务id
     *
     * @var string
     */
    public $signTaskId;

    // 签署子任务状态:
    // INIT-初始化
    // SIGNING-签署中
    // SIGNED-已签署
    // REJECTED-已拒绝
    /**
     * @example INIT
     *
     * @var string
     */
    public $signTaskStatus;

    // 上下游透传参数
    /**
     * @example 上下游透传参数
     *
     * @var string
     */
    public $extraParam;

    // 签署子任务完成的文件里表
    /**
     * @example
     *
     * @var AntSignFileResult[]
     */
    public $antSignFileResultList;

    // 签署人状态列表
    /**
     * @example
     *
     * @var AntSignOperatorResult[]
     */
    public $antSignOperatorResultList;
    protected $_name = [
        'subBizNo'                  => 'sub_biz_no',
        'signTaskId'                => 'sign_task_id',
        'signTaskStatus'            => 'sign_task_status',
        'extraParam'                => 'extra_param',
        'antSignFileResultList'     => 'ant_sign_file_result_list',
        'antSignOperatorResultList' => 'ant_sign_operator_result_list',
    ];

    public function validate()
    {
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
        if (null !== $this->extraParam) {
            $res['extra_param'] = $this->extraParam;
        }
        if (null !== $this->antSignFileResultList) {
            $res['ant_sign_file_result_list'] = [];
            if (null !== $this->antSignFileResultList && \is_array($this->antSignFileResultList)) {
                $n = 0;
                foreach ($this->antSignFileResultList as $item) {
                    $res['ant_sign_file_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->antSignOperatorResultList) {
            $res['ant_sign_operator_result_list'] = [];
            if (null !== $this->antSignOperatorResultList && \is_array($this->antSignOperatorResultList)) {
                $n = 0;
                foreach ($this->antSignOperatorResultList as $item) {
                    $res['ant_sign_operator_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntSignTaskResult
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
        if (isset($map['extra_param'])) {
            $model->extraParam = $map['extra_param'];
        }
        if (isset($map['ant_sign_file_result_list'])) {
            if (!empty($map['ant_sign_file_result_list'])) {
                $model->antSignFileResultList = [];
                $n                            = 0;
                foreach ($map['ant_sign_file_result_list'] as $item) {
                    $model->antSignFileResultList[$n++] = null !== $item ? AntSignFileResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ant_sign_operator_result_list'])) {
            if (!empty($map['ant_sign_operator_result_list'])) {
                $model->antSignOperatorResultList = [];
                $n                                = 0;
                foreach ($map['ant_sign_operator_result_list'] as $item) {
                    $model->antSignOperatorResultList[$n++] = null !== $item ? AntSignOperatorResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
