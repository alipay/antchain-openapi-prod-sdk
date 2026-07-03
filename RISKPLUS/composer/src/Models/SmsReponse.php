<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SmsReponse extends Model
{
    // 发送回执ID
    /**
     * @example 696108134003934432^0
     *
     * @var string
     */
    public $bizId;

    // 请求状态码; OK表示成功, 其他表示失败
    /**
     * @example OK
     *
     * @var string
     */
    public $code;

    // 是否调用接口成功的描述
    /**
     * @example OK
     *
     * @var string
     */
    public $message;

    // 请求ID
    /**
     * @example EF2DE797-B632-5DCF-8502-600959436E77
     *
     * @var string
     */
    public $requestId;
    protected $_name = [
        'bizId'     => 'biz_id',
        'code'      => 'code',
        'message'   => 'message',
        'requestId' => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('requestId', $this->requestId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsReponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
