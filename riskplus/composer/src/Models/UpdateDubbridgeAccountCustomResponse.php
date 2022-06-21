<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgeAccountCustomResponse extends Model
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

    // id
    /**
     * @var int
     */
    public $id;

    // 渠道编码
    /**
     * @var string
     */
    public $channelCode;

    // 渠道id
    /**
     * @var string
     */
    public $channelNo;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;

    // 创建时间
    /**
     * @var string
     */
    public $createTime;

    // 更新时间
    /**
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'id'          => 'id',
        'channelCode' => 'channel_code',
        'channelNo'   => 'channel_no',
        'customerNo'  => 'customer_no',
        'createTime'  => 'create_time',
        'updateTime'  => 'update_time',
    ];

    public function validate()
    {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('updateTime', $this->updateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->channelNo) {
            $res['channel_no'] = $this->channelNo;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubbridgeAccountCustomResponse
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['channel_no'])) {
            $model->channelNo = $map['channel_no'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
