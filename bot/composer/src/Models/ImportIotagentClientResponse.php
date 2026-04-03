<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportIotagentClientResponse extends Model
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

    // 成功导入的设备标识列表
    /**
     * @var string[]
     */
    public $successUidList;

    // 已经存在的设备标识列表（不会导入）
    /**
     * @var string[]
     */
    public $existedUidList;

    // 不合法的设备标识列表（不会导入）
    /**
     * @var string[]
     */
    public $invalidUidList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'successUidList' => 'success_uid_list',
        'existedUidList' => 'existed_uid_list',
        'invalidUidList' => 'invalid_uid_list',
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
        if (null !== $this->successUidList) {
            $res['success_uid_list'] = $this->successUidList;
        }
        if (null !== $this->existedUidList) {
            $res['existed_uid_list'] = $this->existedUidList;
        }
        if (null !== $this->invalidUidList) {
            $res['invalid_uid_list'] = $this->invalidUidList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIotagentClientResponse
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
        if (isset($map['success_uid_list'])) {
            if (!empty($map['success_uid_list'])) {
                $model->successUidList = $map['success_uid_list'];
            }
        }
        if (isset($map['existed_uid_list'])) {
            if (!empty($map['existed_uid_list'])) {
                $model->existedUidList = $map['existed_uid_list'];
            }
        }
        if (isset($map['invalid_uid_list'])) {
            if (!empty($map['invalid_uid_list'])) {
                $model->invalidUidList = $map['invalid_uid_list'];
            }
        }

        return $model;
    }
}
