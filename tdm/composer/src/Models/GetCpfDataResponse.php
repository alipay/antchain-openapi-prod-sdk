<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class GetCpfDataResponse extends Model
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

    // PDF、或结构化信息、或加密数据
    /**
     * @var string
     */
    public $trustData;

    // 数据hash，数据验真时用
    /**
     * @var string
     */
    public $dataHash;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'trustData'  => 'trust_data',
        'dataHash'   => 'data_hash',
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
        if (null !== $this->trustData) {
            $res['trust_data'] = $this->trustData;
        }
        if (null !== $this->dataHash) {
            $res['data_hash'] = $this->dataHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCpfDataResponse
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
        if (isset($map['trust_data'])) {
            $model->trustData = $map['trust_data'];
        }
        if (isset($map['data_hash'])) {
            $model->dataHash = $map['data_hash'];
        }

        return $model;
    }
}
