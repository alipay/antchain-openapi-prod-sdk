<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class PaymentCreateCheckResult extends Model
{
    // 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
    /**
     * @example PASS
     *
     * @var string
     */
    public $result;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'result'  => 'result',
        'subCode' => 'sub_code',
        'subMsg'  => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentCreateCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
