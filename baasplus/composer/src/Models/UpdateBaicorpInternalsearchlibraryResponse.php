<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaicorpInternalsearchlibraryResponse extends Model
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

    // NounceId
    /**
     * @var string
     */
    public $customId;

    // 更新是否成功
    /**
     * @var string
     */
    public $updateResult;

    // 更新描述、更新失败原因
    /**
     * @var string
     */
    public $updateDesc;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'customId'     => 'custom_id',
        'updateResult' => 'update_result',
        'updateDesc'   => 'update_desc',
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
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->updateResult) {
            $res['update_result'] = $this->updateResult;
        }
        if (null !== $this->updateDesc) {
            $res['update_desc'] = $this->updateDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBaicorpInternalsearchlibraryResponse
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
        if (isset($map['custom_id'])) {
            $model->customId = $map['custom_id'];
        }
        if (isset($map['update_result'])) {
            $model->updateResult = $map['update_result'];
        }
        if (isset($map['update_desc'])) {
            $model->updateDesc = $map['update_desc'];
        }

        return $model;
    }
}
