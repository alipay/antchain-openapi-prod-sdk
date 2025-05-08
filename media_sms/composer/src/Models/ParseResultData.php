<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ParseResultData extends Model
{
    // 手机号
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $mobile;

    // 是否有解析能力
    // 0:否
    // 1: 是
    /**
     * @example 1
     *
     * @var int
     */
    public $receiveState;
    protected $_name = [
        'mobile'       => 'mobile',
        'receiveState' => 'receive_state',
    ];

    public function validate()
    {
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('receiveState', $this->receiveState, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->receiveState) {
            $res['receive_state'] = $this->receiveState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParseResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['receive_state'])) {
            $model->receiveState = $map['receive_state'];
        }

        return $model;
    }
}
