<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RpcommonResp extends Model
{
    // 调用是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 结果描述
    /**
     * @example success
     *
     * @var string
     */
    public $resultMsg;

    // 结果码
    /**
     * @example 0
     *
     * @var string
     */
    public $responseCode;

    // 具体返回值.jsonString形式
    /**
     * @example {"a":1}
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'success'      => 'success',
        'resultMsg'    => 'result_msg',
        'responseCode' => 'response_code',
        'data'         => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
        Model::validateRequired('responseCode', $this->responseCode, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RpcommonResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
