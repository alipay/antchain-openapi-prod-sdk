<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateDigitalassetartAccountResponse extends Model
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

    // 失败的账户
    /**
     * @var string[]
     */
    public $failList;

    // 失败的个数
    /**
     * @var int
     */
    public $failNum;

    // 成功的个数
    /**
     * @var int
     */
    public $successNum;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'failList'   => 'fail_list',
        'failNum'    => 'fail_num',
        'successNum' => 'success_num',
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
            $res['fail_list'] = $this->failList;
        }
        if (null !== $this->failNum) {
            $res['fail_num'] = $this->failNum;
        }
        if (null !== $this->successNum) {
            $res['success_num'] = $this->successNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateDigitalassetartAccountResponse
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
                $model->failList = $map['fail_list'];
            }
        }
        if (isset($map['fail_num'])) {
            $model->failNum = $map['fail_num'];
        }
        if (isset($map['success_num'])) {
            $model->successNum = $map['success_num'];
        }

        return $model;
    }
}
