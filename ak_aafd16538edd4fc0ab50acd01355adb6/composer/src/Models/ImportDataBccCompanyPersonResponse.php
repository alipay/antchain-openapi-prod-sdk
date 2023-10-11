<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class ImportDataBccCompanyPersonResponse extends Model
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

    // 数据模型唯一key
    /**
     * @var string
     */
    public $dataKey;

    // 模型码
    /**
     * @var string
     */
    public $dataCode;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'dataKey'    => 'data_key',
        'dataCode'   => 'data_code',
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
        if (null !== $this->dataKey) {
            $res['data_key'] = $this->dataKey;
        }
        if (null !== $this->dataCode) {
            $res['data_code'] = $this->dataCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDataBccCompanyPersonResponse
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
        if (isset($map['data_key'])) {
            $model->dataKey = $map['data_key'];
        }
        if (isset($map['data_code'])) {
            $model->dataCode = $map['data_code'];
        }

        return $model;
    }
}
