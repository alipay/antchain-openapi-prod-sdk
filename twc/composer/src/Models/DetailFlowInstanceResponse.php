<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DetailFlowInstanceResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 本次存证的存证主体信息
    /**
     * @var NotaryUser
     */
    public $notaryUser;

    // 本次全流程的阶段存证详情列表
    /**
     * @var PhaseDetail[]
     */
    public $phaseDetailList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'notaryUser'      => 'notary_user',
        'phaseDetailList' => 'phase_detail_list',
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
        if (null !== $this->notaryUser) {
            $res['notary_user'] = null !== $this->notaryUser ? $this->notaryUser->toMap() : null;
        }
        if (null !== $this->phaseDetailList) {
            $res['phase_detail_list'] = [];
            if (null !== $this->phaseDetailList && \is_array($this->phaseDetailList)) {
                $n = 0;
                foreach ($this->phaseDetailList as $item) {
                    $res['phase_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailFlowInstanceResponse
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
        if (isset($map['notary_user'])) {
            $model->notaryUser = NotaryUser::fromMap($map['notary_user']);
        }
        if (isset($map['phase_detail_list'])) {
            if (!empty($map['phase_detail_list'])) {
                $model->phaseDetailList = [];
                $n                      = 0;
                foreach ($map['phase_detail_list'] as $item) {
                    $model->phaseDetailList[$n++] = null !== $item ? PhaseDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
