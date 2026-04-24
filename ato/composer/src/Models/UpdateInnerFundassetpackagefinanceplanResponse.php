<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UpdateInnerFundassetpackagefinanceplanResponse extends Model
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

    // 资金方案内容
    /**
     * @var AssetPackageFinancePlan
     */
    public $financePlan;

    // 类型
    /**
     * @var string
     */
    public $type;

    // 回答
    /**
     * @var string
     */
    public $answer;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'financePlan' => 'finance_plan',
        'type'        => 'type',
        'answer'      => 'answer',
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
        if (null !== $this->financePlan) {
            $res['finance_plan'] = null !== $this->financePlan ? $this->financePlan->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInnerFundassetpackagefinanceplanResponse
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
        if (isset($map['finance_plan'])) {
            $model->financePlan = AssetPackageFinancePlan::fromMap($map['finance_plan']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }

        return $model;
    }
}
