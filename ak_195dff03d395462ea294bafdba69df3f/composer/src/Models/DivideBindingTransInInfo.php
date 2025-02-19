<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class DivideBindingTransInInfo extends Model
{
    // 分账方支付宝pid
    /**
     * @example 2088123456789
     *
     * @var string
     */
    public $alipayPid;
    protected $_name = [
        'alipayPid' => 'alipay_pid',
    ];

    public function validate()
    {
        Model::validateRequired('alipayPid', $this->alipayPid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alipayPid) {
            $res['alipay_pid'] = $this->alipayPid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DivideBindingTransInInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alipay_pid'])) {
            $model->alipayPid = $map['alipay_pid'];
        }

        return $model;
    }
}
