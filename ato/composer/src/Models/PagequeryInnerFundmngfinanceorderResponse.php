<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerFundmngfinanceorderResponse extends Model
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

    // 总数
    /**
     * @var int
     */
    public $totalCount;

    // 查询结果
    /**
     * @var string
     */
    public $items;

    // 资方放款申请失败数量
    /**
     * @var int
     */
    public $loanApplyFailCount;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'totalCount'         => 'total_count',
        'items'              => 'items',
        'loanApplyFailCount' => 'loan_apply_fail_count',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->items) {
            $res['items'] = $this->items;
        }
        if (null !== $this->loanApplyFailCount) {
            $res['loan_apply_fail_count'] = $this->loanApplyFailCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerFundmngfinanceorderResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['items'])) {
            $model->items = $map['items'];
        }
        if (isset($map['loan_apply_fail_count'])) {
            $model->loanApplyFailCount = $map['loan_apply_fail_count'];
        }

        return $model;
    }
}
