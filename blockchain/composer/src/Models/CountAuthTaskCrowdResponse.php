<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CountAuthTaskCrowdResponse extends Model
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

    // 人群预估数量
    /**
     * @var int
     */
    public $crowdCount;

    // 人群导出时间
    /**
     * @var string
     */
    public $bizDate;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'crowdCount' => 'crowd_count',
        'bizDate'    => 'biz_date',
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
        if (null !== $this->crowdCount) {
            $res['crowd_count'] = $this->crowdCount;
        }
        if (null !== $this->bizDate) {
            $res['biz_date'] = $this->bizDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountAuthTaskCrowdResponse
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
        if (isset($map['crowd_count'])) {
            $model->crowdCount = $map['crowd_count'];
        }
        if (isset($map['biz_date'])) {
            $model->bizDate = $map['biz_date'];
        }

        return $model;
    }
}
