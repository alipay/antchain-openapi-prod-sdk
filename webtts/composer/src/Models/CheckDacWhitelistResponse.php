<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class CheckDacWhitelistResponse extends Model
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

    // 公钥地址
    /**
     * @var string
     */
    public $address;

    // 支持的链列表
    /**
     * @var string[]
     */
    public $blockchainList;

    // 检查结果类型
    /**
     * @var string
     */
    public $checkResultType;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'address'         => 'address',
        'blockchainList'  => 'blockchain_list',
        'checkResultType' => 'check_result_type',
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->blockchainList) {
            $res['blockchain_list'] = $this->blockchainList;
        }
        if (null !== $this->checkResultType) {
            $res['check_result_type'] = $this->checkResultType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckDacWhitelistResponse
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['blockchain_list'])) {
            if (!empty($map['blockchain_list'])) {
                $model->blockchainList = $map['blockchain_list'];
            }
        }
        if (isset($map['check_result_type'])) {
            $model->checkResultType = $map['check_result_type'];
        }

        return $model;
    }
}
