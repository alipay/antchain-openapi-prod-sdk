<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacCustodyaddressResponse extends Model
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

    // 用户特定区块链的托管钱包地址，用于deposit转账使用
    /**
     * @var string
     */
    public $custodyAddress;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'custodyAddress' => 'custody_address',
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
        if (null !== $this->custodyAddress) {
            $res['custody_address'] = $this->custodyAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacCustodyaddressResponse
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
        if (isset($map['custody_address'])) {
            $model->custodyAddress = $map['custody_address'];
        }

        return $model;
    }
}
