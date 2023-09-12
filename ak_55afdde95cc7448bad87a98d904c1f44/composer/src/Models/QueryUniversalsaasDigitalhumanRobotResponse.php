<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_55afdde95cc7448bad87a98d904c1f44\Models;

use AlibabaCloud\Tea\Model;

class QueryUniversalsaasDigitalhumanRobotResponse extends Model
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

    // 返回结果json字符串
    /**
     * @var string
     */
    public $resultData;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'resultData' => 'result_data',
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
        if (null !== $this->resultData) {
            $res['result_data'] = $this->resultData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUniversalsaasDigitalhumanRobotResponse
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
        if (isset($map['result_data'])) {
            $model->resultData = $map['result_data'];
        }

        return $model;
    }
}
