<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVerifyCarinfoResponse extends Model
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

    // 业务流水号，输入参数的bizId返回。
    /**
     * @var string
     */
    public $bizId;

    // 来自入参，具体看业务场景。
    /**
     * @var string
     */
    public $bizType;

    // 目标用户创建的did结果，如果为空则表明未创建。
    /**
     * @var string
     */
    public $did;

    // 查询结果
    // 1 一致(收费)
    // 2 姓名不一致(收费)
    // 3 身份证未命中(收费)
    // 4 车牌号不一致(收费)
    // 0 无意义(responsecode 不为 100 时 出现)
    /**
     * @var int
     */
    public $resultStatus;

    // 查询结果数据，result_status 不等于 1 时为null，结果是一个JSON字符串，具体结果内容解释，需要参考文档说明。
    /**
     * @var string
     */
    public $resultData;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'bizId'        => 'biz_id',
        'bizType'      => 'biz_type',
        'did'          => 'did',
        'resultStatus' => 'result_status',
        'resultData'   => 'result_data',
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->resultStatus) {
            $res['result_status'] = $this->resultStatus;
        }
        if (null !== $this->resultData) {
            $res['result_data'] = $this->resultData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVerifyCarinfoResponse
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['result_status'])) {
            $model->resultStatus = $map['result_status'];
        }
        if (isset($map['result_data'])) {
            $model->resultData = $map['result_data'];
        }

        return $model;
    }
}
