<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BizInfo extends Model
{
    // BPWZPFCN
    /**
     * @example 用户的金融科技租户id
     *
     * @var string
     */
    public $clientTenent;

    // 业务代码
    /**
     * @example BAAS_ANTFIN|BAAS_ALICLOUD|MORSE|RECEIVABLE|TRACE|GLOBAL_PAYMENT|JUDICIAL|INVOICE
     *
     * @var string
     */
    public $code;
    protected $_name = [
        'clientTenent' => 'client_tenent',
        'code'         => 'code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientTenent) {
            $res['client_tenent'] = $this->clientTenent;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_tenent'])) {
            $model->clientTenent = $map['client_tenent'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
