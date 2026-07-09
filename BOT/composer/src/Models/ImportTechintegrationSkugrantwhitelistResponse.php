<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportTechintegrationSkugrantwhitelistResponse extends Model
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

    // 成功导入的sn列表
    /**
     * @var string[]
     */
    public $successSnList;

    // 已经存在的sn列表（不会导入）
    /**
     * @var string[]
     */
    public $existedSnList;

    // 不合法的sn列表（不会导入）
    /**
     * @var string[]
     */
    public $invalidSnList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'successSnList' => 'success_sn_list',
        'existedSnList' => 'existed_sn_list',
        'invalidSnList' => 'invalid_sn_list',
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
        if (null !== $this->successSnList) {
            $res['success_sn_list'] = $this->successSnList;
        }
        if (null !== $this->existedSnList) {
            $res['existed_sn_list'] = $this->existedSnList;
        }
        if (null !== $this->invalidSnList) {
            $res['invalid_sn_list'] = $this->invalidSnList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportTechintegrationSkugrantwhitelistResponse
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
        if (isset($map['success_sn_list'])) {
            if (!empty($map['success_sn_list'])) {
                $model->successSnList = $map['success_sn_list'];
            }
        }
        if (isset($map['existed_sn_list'])) {
            if (!empty($map['existed_sn_list'])) {
                $model->existedSnList = $map['existed_sn_list'];
            }
        }
        if (isset($map['invalid_sn_list'])) {
            if (!empty($map['invalid_sn_list'])) {
                $model->invalidSnList = $map['invalid_sn_list'];
            }
        }

        return $model;
    }
}
