<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateLogisticFinanceAccountResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 失败列表
    /**
     * @var LogisticFinUser[]
     */
    public $failList;

    // 映射失败数
    /**
     * @var int
     */
    public $failNum;

    // 成功列表
    /**
     * @var string[]
     */
    public $successList;

    // 映射成功数
    /**
     * @var int
     */
    public $successNum;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'failList'    => 'fail_list',
        'failNum'     => 'fail_num',
        'successList' => 'success_list',
        'successNum'  => 'success_num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->failList) {
            $res['fail_list'] = [];
            if (null !== $this->failList && \is_array($this->failList)) {
                $n = 0;
                foreach ($this->failList as $item) {
                    $res['fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failNum) {
            $res['fail_num'] = $this->failNum;
        }
        if (null !== $this->successList) {
            $res['success_list'] = $this->successList;
        }
        if (null !== $this->successNum) {
            $res['success_num'] = $this->successNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateLogisticFinanceAccountResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['fail_list'])) {
            if (!empty($map['fail_list'])) {
                $model->failList = [];
                $n               = 0;
                foreach ($map['fail_list'] as $item) {
                    $model->failList[$n++] = null !== $item ? LogisticFinUser::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fail_num'])) {
            $model->failNum = $map['fail_num'];
        }
        if (isset($map['success_list'])) {
            if (!empty($map['success_list'])) {
                $model->successList = $map['success_list'];
            }
        }
        if (isset($map['success_num'])) {
            $model->successNum = $map['success_num'];
        }

        return $model;
    }
}
